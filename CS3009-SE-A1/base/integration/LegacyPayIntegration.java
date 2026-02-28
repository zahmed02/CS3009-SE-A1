package com.alphasoft.base.integration;

import com.alphasoft.base.core.PaymentService;
import com.alphasoft.base.external.LegacyPayService;

public class LegacyPayIntegration implements PaymentService {
    private final LegacyPayService legacy;

    public LegacyPayIntegration(LegacyPayService legacy) {
        this.legacy = legacy;
    }

    @Override
    public boolean pay(double amount) {

        legacy.makePayment(amount);

        return true;
    }
}
