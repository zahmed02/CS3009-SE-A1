package com.alphasoft.exercise1.client;

import com.alphasoft.base.client.PaymentClient;
import com.alphasoft.base.core.PaymentService;
import com.alphasoft.exercise1.external.CentPayService;
import com.alphasoft.exercise1.integration.CentPayIntegration;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new CentPayIntegration(new CentPayService());
        PaymentClient client = new PaymentClient(service);
        client.makePayment(99.99);
    }
}