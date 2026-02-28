package com.alphasoft.exercise4.integration;

import com.alphasoft.base.core.PaymentService;

public class ProviderRegistry {
    private static PaymentService provider;

    public static void setProvider(PaymentService p) {
        provider = p;
    }

    public static PaymentService getProvider() {
        return provider;
    }
}
