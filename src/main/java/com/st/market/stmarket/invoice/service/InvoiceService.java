package com.st.market.stmarket.invoice.service;

import com.st.market.stmarket.order.model.Order;

/**
 *
 * @author janez
 */
public interface InvoiceService {

    void sendInvoice(Order order) throws Exception;

}
