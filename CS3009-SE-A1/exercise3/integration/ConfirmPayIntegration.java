package com.alphasoft.exercise3.integration;

import com.alphasoft.base.core.PaymentService;
import com.alphasoft.exercise3.external.ConfirmPayService;

public class ConfirmPayIntegration implements PaymentService {
    private final ConfirmPayService svc;

    public ConfirmPayIntegration(ConfirmPayService svc) {
        this.svc = svc;
    }

    @Override
    public boolean pay(double amount) {
        String confirmation = svc.confirmPayment(amount);
        System.out.println("[AlphaSoft Log] Payment successful -> " + confirmation + " :: Amount=" + amount);
        return true;
    }
}
