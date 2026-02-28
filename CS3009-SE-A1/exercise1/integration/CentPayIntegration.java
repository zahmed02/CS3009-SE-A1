package com.alphasoft.exercise1.integration;

import com.alphasoft.base.core.PaymentService;
import com.alphasoft.exercise1.external.CentPayService;

public class CentPayIntegration implements PaymentService {
    private final CentPayService centService;

    public CentPayIntegration(CentPayService centService) {
        this.centService = centService;
    }

    @Override
    public boolean pay(double amount) {
        int cents = (int) Math.round(amount * 100.0);
        centService.payInCents(cents);
        return true;
    }
}
