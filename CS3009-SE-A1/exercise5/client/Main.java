package com.alphasoft.exercise5.client;

import com.alphasoft.base.client.PaymentClient;
import com.alphasoft.base.core.PaymentService;
import com.alphasoft.exercise5.external.MockPayService;
import com.alphasoft.exercise5.integration.MockPayIntegration;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new MockPayIntegration(new MockPayService());
        PaymentClient client = new PaymentClient(service);
        client.makePayment(500.0);
    }
}
