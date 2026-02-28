package com.alphasoft.exercise2.external;

public class GlobalPayService {
    public void processPayment(String currencyCode, double amount) {
        System.out.println("[GlobalPayService] Processing " + amount + " " + currencyCode);
    }
}
