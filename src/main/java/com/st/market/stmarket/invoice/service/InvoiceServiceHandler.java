package com.st.market.stmarket.invoice.service;

import com.st.market.stmarket.address.model.Address;
import com.st.market.stmarket.address.service.AddressService;
import com.st.market.stmarket.invoice.model.Invoice;
import com.st.market.stmarket.order.model.Order;
import com.st.market.stmarket.product.model.Product;
import com.st.market.stmarket.product.repository.ProductRepository;
import com.st.market.stmarket.user.model.User;
import com.st.market.stmarket.user.service.UserService;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

/**
 *
 * @author janez
 */
@Service
public class InvoiceServiceHandler implements InvoiceService {
    
    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private UserService userService;
    @Autowired
    private AddressService addressService;
    @Autowired
    private ProductRepository productRepository;
    private BigDecimal subTotal;
    
    @Override
    public void sendInvoice(Order order) throws Exception {
        
        User user = userService.findById(order.getUserId()).get();
        Address address = addressService.findById(order.getAddressId()).get();
        
        Invoice invoice = new Invoice(order, user, address);
        
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "UTF-8");
        String content = buildMessage(invoice);
        
        mimeMessage.setContent(content, "text/html");
        helper.setTo(user.getEmail());
        helper.setSubject("Orden de Compra | Factura | Sempiterno");
        
        javaMailSender.send(mimeMessage);
        
    }
    
    private String buildMessage(Invoice invoice) {
        StringBuilder builder = new StringBuilder();
        builder.append(getHeader());
        builder.append("<!DOCTYPE html>"
                + "<html lang='es'>"
                + "<head>"
                + "<meta charset='utf-8'>");
        builder.append(getSyle());
        builder.append("</head><body style='width: 100% !important'><main><div id='details' class='clearfix' ><div id='client'><div class='to'>INFORMACION DE FACTURA:</div><h2 class='name'>")
                .append(invoice.getUser().getCompleteName()).append("</h2><div class='address'>")
                .append(invoice.getAddress().getAsentamiento()).append(" ")
                .append(invoice.getAddress().getPostalCode()).append(" ")
                .append(invoice.getAddress().getLocalidad()).append(" ")
                .append("</div></div><div id='invoice'><h2>Factura N\u00famero</h2>")                
                .append(invoice.getOrder().getInvoiceNo())
                .append("<div class='date'>Fecha ").append(new Date(System.currentTimeMillis()))
                .append("</div></div></div><table border='0' cellspacing='0' cellpadding='0'><thead><tr><th class='no'>#</th><th class='desc'>DESCRIPCION</th><th class='unit'>PRECIO UNITARIO</th><th class='qty'>CANTIDAD</th><th class='total'>TOTAL</th></tr></thead><tbody>");
        
        List<Product> list = buildProducts(invoice.getOrder().getUserId());
        int index = 1;
        subTotal = new BigDecimal(BigInteger.ZERO);
        for (Product product : list) {
            builder.append("<tr>");
            builder.append("<td align='center' class='no'>").append(index).append("</td>");
            builder.append("<td align='center' class='desc'><h3>").append(product.getName()).append("</h3></td>");
            builder.append("<td align='center' class='unit'>$").append(product.getNewPrice().setScale(2, RoundingMode.HALF_UP).toString()).append("</td>");
            builder.append("<td align='center' class='qty'> ").append(product.getAvailable()).append("</td>");
            builder.append("<td align='center' class='total'>$").append(product.getNewPrice().multiply(new BigDecimal(product.getAvailable()))).append("</td>");
            builder.append("</tr>");
            
            subTotal = subTotal.add(product.getNewPrice().multiply(new BigDecimal(product.getAvailable())));
            
            index++;
        }
        builder.append(getFooter());
        
        return builder.toString();
    }
    
    private String getHeader() {
        return "<div style='width: 100% !important' id='logo'>"
                + "        "
                + "</div>"
                + "<div id='company'>"
                + "<h2 class='name'>Sempiterno</h2>"
                + "<div>455 Foggy Heights, AZ 85004, MX</div>"
                + "<div>(602) 519-0450</div>"
                + "<div><a href='mailto:facturacion@sempiterno.xyz'>facturacion@sempiterno.xyz</a></div>"
                + "</div>"
                + "</div><br /><br /><br />"
                + "    ";
    }
    
    private List<Product> buildProducts(Long userId) {
        List<Product> list = productRepository.findProductCartByToOrder(userId);
        List<Product> response = new ArrayList<>();
        Map<Long, Product> map = new HashMap<>();
        list.forEach((product) -> {
            if (map.containsKey(product.getId())) {
                Product productOrder = map.get(product.getId());
                productOrder.setAvailable(productOrder.getAvailable() + 1);
                
                map.put(product.getId(), productOrder);
            } else {
                product.setAvailable(1L);
                map.put(product.getId(), product);
            }
        });
        
        map.entrySet().stream().map((entry) -> entry.getValue()).forEachOrdered((value) -> {
            response.add(value);
        });
        
        return response;
    }
    
    private String getFooter() {
        return ""
                + "</tbody>"
                + "<tfoot>"
                + "<tr>"
                + "<td colspan='2'></td>"
                + "<td colspan='2'>SUBTOTAL</td>"
                + "<td align='center'>$" + subTotal.setScale(2, RoundingMode.HALF_UP).toString() + "</td>"
                + "</tr>"
                + "<tr>"
                + "<td colspan='2'></td>"
                + "<td colspan='2'>IVA 16%</td>"
                + "<td align='center'>$" + subTotal.multiply(new BigDecimal(0.16)).setScale(2, RoundingMode.HALF_UP).toString() + "</td>"
                + "</tr>"
                + "<tr>"
                + "<td colspan='2'></td>"
                + "<td colspan='2'>TOTAL</td>"
                + "<td align='center'>$" + subTotal.add(subTotal.multiply(new BigDecimal(0.16))).setScale(2, RoundingMode.HALF_UP).toString() + "</td>"
                + "</tr>"
                + "</tfoot>"
                + "</table>"
                + "</body>"
                + "</html>";
    }
    
    private String getSyle() {
        return "<style rel='stylesheet'>"
                + ""
                + ".clearfix:after {"
                + "  content: '';"
                + "  display: table;"
                + "  clear: both;"
                + "}"
                + ""
                + "a {"
                + "  color: #0087C3;"
                + "  text-decoration: none;"
                + "}"
                + ""
                + "body {"
                + "  position: relative;"
                + "  height: 29.7cm; "
                + "  margin: 0 auto; "
                + "  color: #555555;"
                + "  background: #FFFFFF; "
                + "  font-family: Arial, sans-serif; "
                + "  font-size: 14px; "
                + "  font-family: SourceSansPro;"
                + "}"
                + ""
                + "header {"
                + "  padding: 10px 0;"
                + "  margin-bottom: 20px;"
                + "  border-bottom: 1px solid #AAAAAA;"
                + "}"
                + ""
                + "#logo {"
                + "  float: left;"
                + "  margin-top: 8px;"
                + "}"
                + ""
                + "#logo img {"
                + "  height: 70px;"
                + "}"
                + ""
                + "#company {"
                + "  float: right;"
                + "  text-align: right;"
                + "}"
                + ""
                + ""
                + "#details {"
                + "  margin-bottom: 50px;"
                + "}"
                + ""
                + "#client {"
                + "  padding-left: 6px;"
                + "  border-left: 6px solid #0087C3;"
                + "  float: left;"
                + "}"
                + ""
                + "#client .to {"
                + "  color: #777777;"
                + "}"
                + ""
                + "h2.name {"
                + "  font-size: 1.4em;"
                + "  font-weight: normal;"
                + "  margin: 0;"
                + "}"
                + ""
                + "#invoice {"
                + "  float: right;"
                + "  text-align: right;"
                + "}"
                + ""
                + "#invoice h1 {"
                + "  color: #0087C3;"
                + "  font-size: 2.4em;"
                + "  line-height: 1em;"
                + "  font-weight: normal;"
                + "  margin: 0  0 10px 0;"
                + "}"
                + ""
                + "#invoice .date {"
                + "  font-size: 1.1em;"
                + "  color: #777777;"
                + "}"
                + ""
                + "table {"
                + "  border-collapse: collapse;"
                + "  border-spacing: 0;"
                + "  margin-bottom: 20px;"
                + "  width: 100% !important"
                + "}"
                + ""
                + "table th,"
                + "table td {"
                + "  padding: 20px;"
                + "  background: #EEEEEE;"
                + "  text-align: center;"
                + "  border-bottom: 1px solid #FFFFFF;"
                + "}"
                + ""
                + "table th {"
                + "  white-space: nowrap;        "
                + "  font-weight: normal;"
                + "}"
                + ""
                + "table td {"
                + "  text-align: right;"
                + "}"
                + ""
                + "table td h3{"
                + "  color: #38d39f;"
                + "  font-size: 1.2em;"
                + "  font-weight: normal;"
                + "  margin: 0 0 0.2em 0;"
                + "}"
                + ""
                + "table .no {"
                + "  color: #FFFFFF;"
                + "  font-size: 1.6em;"
                + "  background: #38d39f;"
                + "  text-align: center;"
                + "}"
                + ""
                + "table .desc {"
                + "  text-align: left;"
                + "}"
                + ""
                + "table .unit {"
                + "  background: #DDDDDD;"
                + "  text-align: center;"
                + "}"
                + ""
                + "table .qty {"
                + "  text-align: center;"
                + "}"
                + ""
                + "table .total {"
                + "  background: #38d39f;"
                + "  color: #FFFFFF;"
                + "  text-align: center;"
                + "}"
                + ""
                + "table td.unit,"
                + "table td.qty,"
                + "table td.total {"
                + "  font-size: 1.2em;"
                + "}"
                + ""
                + "table tbody tr:last-child td {"
                + "  border: none;"
                + "}"
                + ""
                + "table tfoot td {"
                + "  padding: 10px 20px;"
                + "  background: #FFFFFF;"
                + "  border-bottom: none;"
                + "  font-size: 1.2em;"
                + "  white-space: nowrap; "
                + "  border-top: 1px solid #AAAAAA; "
                + "}"
                + ""
                + "table tfoot tr:first-child td {"
                + "  border-top: none; "
                + "}"
                + ""
                + "table tfoot tr:last-child td {"
                + "  color: #38d39f;"
                + "  font-size: 1.4em;"
                + "  border-top: 1px solid #38d39f; "
                + ""
                + "}"
                + ""
                + "table tfoot tr td:first-child {"
                + "  border: none;"
                + "}"
                + ""
                + "#thanks{"
                + "  font-size: 2em;"
                + "  margin-bottom: 50px;"
                + "}"
                + ""
                + "#notices{"
                + "  padding-left: 6px;"
                + "  border-left: 6px solid #0087C3;  "
                + "}"
                + ""
                + "#notices .notice {"
                + "  font-size: 1.2em;"
                + "}"
                + ""
                + "footer {"
                + "  color: #777777;"
                + "  height: 30px;"
                + "  position: absolute;"
                + "  bottom: 0;"
                + "  border-top: 1px solid #AAAAAA;"
                + "  padding: 8px 0;"
                + "  text-align: center;"
                + "}"
                + "</style>";
    }
    
}
