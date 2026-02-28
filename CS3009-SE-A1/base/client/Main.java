package com.alphasoft.base.client;

import com.alphasoft.base.core.PaymentService;
import com.alphasoft.base.external.LegacyPayService;
import com.alphasoft.base.integration.LegacyPayIntegration;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new LegacyPayIntegration(new LegacyPayService());
        PaymentClient client = new PaymentClient(service);
        client.makePayment(250.0);
    }
}