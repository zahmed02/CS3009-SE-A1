package com.alphasoft.exercise5.integration;

import com.alphasoft.base.core.PaymentService;
import com.alphasoft.exercise5.external.MockPayService;

public class MockPayIntegration implements PaymentService {
    private final MockPayService mock;

    public MockPayIntegration(MockPayService mock) {
        this.mock = mock;
    }

    @Override
    public boolean pay(double amount) {
        mock.simulatePayment(amount);
        System.out.println("[Test Mode] No real transaction executed.");
        return true;
    }
}
