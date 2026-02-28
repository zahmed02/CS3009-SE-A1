package com.alphasoft.exercise3.client;

import com.alphasoft.base.client.PaymentClient;
import com.alphasoft.base.core.PaymentService;
import com.alphasoft.exercise3.external.ConfirmPayService;
import com.alphasoft.exercise3.integration.ConfirmPayIntegration;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new ConfirmPayIntegration(new ConfirmPayService());
        PaymentClient client = new PaymentClient(service);
        client.makePayment(300.0);
    }
}
