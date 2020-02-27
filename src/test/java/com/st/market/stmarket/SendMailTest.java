package com.st.market.stmarket;

import com.st.market.stmarket.address.model.Address;
import com.st.market.stmarket.address.service.AddressService;
import com.st.market.stmarket.product.model.Product;
import com.st.market.stmarket.user.model.User;
import com.st.market.stmarket.user.service.UserService;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application.integration.properties")
public class SendMailTest {

    @Autowired
    JavaMailSender javaMailSender;

    @Autowired
    UserService userService;

    @Autowired
    AddressService addressService;

    @Test
    void sendEmail() throws MessagingException {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("janezmejias@sempiterno.xyz");

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
        StringBuilder builder = new StringBuilder();
        builder.append(buildMessage());

        mimeMessage.setContent(builder.toString(), "text/html");
        helper.setTo("janezmejias@sempiterno.xyz");
        helper.setSubject("Orden de Compra | Factura | Sempiterno");
        helper.setFrom("abc@gmail.com");

        javaMailSender.send(mimeMessage);

    }

    private List<Product> getProducts() {
        List<Product> list = new ArrayList<>();
        for (int index = 2; index < 6; index++) {
            Product model = new Product();
            model.setId(new Long(index));
            model.setTitle("title product " + index);
            model.setName("product _ " + index);
            model.setImage("assets/img/product/c-product-" + index + ".jpg");
            model.setOldPrice(new BigDecimal(index * 2));
            model.setNewPrice(new BigDecimal(index));
            model.setDiscount(30);
            model.setAvailable(index + 0L);
            model.setDescription("--description here--");
            list.add(model);
        }
        Product model = new Product();
        model.setId(new Long(2));
        model.setTitle("title product " + 2);
        model.setName("product _ " + 2);
        model.setImage("assets/img/product/c-product-" + 2 + ".jpg");
        model.setOldPrice(new BigDecimal(2 * 2));
        model.setNewPrice(new BigDecimal(2));
        model.setDiscount(30);
        model.setAvailable(1L);
        model.setDescription("--description here--");

        list.add(model);

        model = new Product();
        model.setId(new Long(2));
        model.setTitle("title product " + 2);
        model.setName("product _ " + 2);
        model.setImage("assets/img/product/c-product-" + 2 + ".jpg");
        model.setOldPrice(new BigDecimal(2 * 2));
        model.setNewPrice(new BigDecimal(2));
        model.setDiscount(30);
        model.setAvailable(1L);
        model.setDescription("--description here--");

        list.add(model);

        return list;
    }

    private List<Product> buildProducts(List<Product> list) {
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

    private String getHeader() {
        return "<div style='width: 100% !important' id='logo'>"
                + "        "
                + "      </div>"
                + "      <div id='company'>"
                + "        <h2 class='name'>Sempiterno</h2>"
                + "        <div>455 Foggy Heights, AZ 85004, MX</div>"
                + "        <div>(602) 519-0450</div>"
                + "        <div><a href='mailto:facturacion@sempiterno.xyz'>facturacion@sempiterno.xyz</a></div>"
                + "      </div>"
                + "      </div> <br /><br /><br />"
                + "    ";
    }

    private String buildMessage() {
        User user = userService.findById(16L).get();

        Address address = addressService.findById(28L).get();

        StringBuilder builder = new StringBuilder();
        builder.append(getHeader());
        builder.append("<!DOCTYPE html>"
                + "<html lang='es'>"
                + "  <head>"
                + "    <meta charset='utf-8'>");
        builder.append(getSyle());
        builder.append("</head>"
                + "  <body style='width: 100% !important'> "
                + "    <main>"
                + "      <div id='details' class='clearfix' >"
                + "        <div id='client'>"
                + "          <div class='to'>INFORMACION DE FACTURA:</div>"
                + "          <h2 class='name'>" + user.getCompleteName() + "</h2>"
                + "          <div class='address'>" + address.getAsentamiento() + " " + address.getPostalCode() + " " + address.getLocalidad() + "</div>"
                + "          <div class='email'>" + user.getEmail() + "</div>"
                + "        </div>"
                + "        <div id='invoice'>"
                + "          <h2>Factura Número 000001</h2>"
                + "          <div class='date'>Fecha de Factura: 01/06/2014</div>"
                + "        </div>"
                + "      </div>"
                + "      <table border='0' cellspacing='0' cellpadding='0'>"
                + "        <thead>"
                + "          <tr>"
                + "            <th class='no'>#</th>"
                + "            <th class='desc'>DESCRIPCION</th>"
                + "            <th class='unit'>PRECIO UNITARIO</th>"
                + "            <th class='qty'>CANTIDAD</th>"
                + "            <th class='total'>TOTAL</th>"
                + "          </tr>"
                + "        </thead>"
                + "        <tbody>");

        List<Product> list = buildProducts(getProducts());
        int index = 1;
        subTotal = new BigDecimal(BigInteger.ZERO);
        for (Product product : list) {
            builder.append(" <tr>");
            builder.append("<td align='center' class='no'>" + index + "</td>");
            builder.append("<td align='center' class='desc'><h3>" + product.getName() + "</h3></td>");
            builder.append("<td align='center' class='unit'>$" + product.getNewPrice().setScale(2, RoundingMode.HALF_UP).toString() + "</td>");
            builder.append("<td align='center' class='qty'> " + product.getAvailable() + "</td>");
            builder.append("<td align='center' class='total'>$" + (product.getNewPrice().multiply(new BigDecimal(product.getAvailable()))) + "</td>");
            builder.append(" </tr>");

            subTotal = subTotal.add(product.getNewPrice().multiply(new BigDecimal(product.getAvailable())));

            index++;
        }
        builder.append(getFooter());

        return builder.toString();
    }
    private BigDecimal subTotal;

    private String getFooter() {
        return ""
                + "        </tbody>"
                + "        <tfoot>"
                + "          <tr>"
                + "            <td colspan='2'></td>"
                + "            <td colspan='2'>SUBTOTAL</td>"
                + "            <td align='center'>$" + subTotal.setScale(2, RoundingMode.HALF_UP).toString() + "</td>"
                + "          </tr>"
                + "          <tr>"
                + "            <td colspan='2'></td>"
                + "            <td colspan='2'>IVA 16%</td>"
                + "            <td align='center'>$" + subTotal.multiply(new BigDecimal(0.16)).setScale(2, RoundingMode.HALF_UP).toString() + "</td>"
                + "          </tr>"
                + "          <tr>"
                + "            <td colspan='2'></td>"
                + "            <td colspan='2'>TOTAL</td>"
                + "            <td align='center'>$" + subTotal.add(subTotal.multiply(new BigDecimal(0.16))).setScale(2, RoundingMode.HALF_UP).toString() + "</td>"
                + "          </tr>"
                + "        </tfoot>"
                + "      </table>"
                + "  </body>"
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
                + "    </style>";
    }

}
