package com.alphasoft.exercise4.integration;

import com.alphasoft.base.core.PaymentService;
import com.alphasoft.exercise4.external.GlobalPayService;

public class GlobalPayIntegration implements PaymentService {
    private final GlobalPayService global;
    private final String currency;

    public GlobalPayIntegration(GlobalPayService global, String currency) {
        this.global = global;
        this.currency = currency;
    }

    @Override
    public boolean pay(double amount) {
        global.processPayment(currency, amount);
        return true;
    }
}
