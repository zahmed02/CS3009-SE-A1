package com.alphasoft.exercise2.integration;

import com.alphasoft.base.core.PaymentService;
import com.alphasoft.exercise2.external.GlobalPayService;

public class GlobalPayIntegration implements PaymentService {
    private final GlobalPayService global;
    private final String currencyCode;

    public GlobalPayIntegration(GlobalPayService global, String currencyCode) {
        this.global = global;
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean pay(double amount) {
        global.processPayment(currencyCode, amount);
        return true;
    }
}
