package com.alphasoft.base.client;

import com.alphasoft.base.core.PaymentService;

public class PaymentClient {
    private final PaymentService paymentService;

    public PaymentClient(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void makePayment(double amount) {
        System.out.println("Client initiating payment...");
        boolean ok = paymentService.pay(amount);
        if (ok) {
            System.out.println("Payment completed successfully.");
        } else {
            System.out.println("Payment failed.");
        }
    }
}
