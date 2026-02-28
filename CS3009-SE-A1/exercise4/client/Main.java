package com.alphasoft.exercise4.client;

import com.alphasoft.base.client.PaymentClient;
import com.alphasoft.base.core.PaymentService;
import com.alphasoft.exercise4.external.LegacyPayService;
import com.alphasoft.exercise4.external.GlobalPayService;
import com.alphasoft.exercise4.integration.GlobalPayIntegration;
import com.alphasoft.exercise4.integration.LegacyPayIntegration;
import com.alphasoft.exercise4.integration.ProviderRegistry;
import com.alphasoft.exercise4.integration.SwitchablePaymentService;

public class Main {
    public static void main(String[] args) {
        
        PaymentService switchable = new SwitchablePaymentService();
        PaymentClient client = new PaymentClient(switchable);

        ProviderRegistry.setProvider(new LegacyPayIntegration(new LegacyPayService()));
        client.makePayment(120.0);

        ProviderRegistry.setProvider(new GlobalPayIntegration(new GlobalPayService(), "EUR"));
        System.out.println("[System] Payment provider switched.");
        client.makePayment(120.0);
    }
}