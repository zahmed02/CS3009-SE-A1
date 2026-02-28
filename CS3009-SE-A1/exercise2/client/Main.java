package com.alphasoft.exercise2.client;

import com.alphasoft.base.client.PaymentClient;
import com.alphasoft.base.core.PaymentService;
import com.alphasoft.exercise2.external.GlobalPayService;
import com.alphasoft.exercise2.integration.GlobalPayIntegration;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new GlobalPayIntegration(new GlobalPayService(), "USD");
        PaymentClient client = new PaymentClient(service);
        client.makePayment(150.75);
    }
}