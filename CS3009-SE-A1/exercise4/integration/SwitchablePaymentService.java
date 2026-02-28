package com.alphasoft.exercise4.integration;

import com.alphasoft.base.core.PaymentService;

public class SwitchablePaymentService implements PaymentService {

    @Override
    public boolean pay(double amount) {
        PaymentService current = ProviderRegistry.getProvider();
        if (current == null) {
            System.out.println("[System] No payment provider configured.");
            return false;
        }
        return current.pay(amount);
    }
}
