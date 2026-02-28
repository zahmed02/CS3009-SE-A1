package com.alphasoft.exercise4.external;

public class GlobalPayService {
    public void processPayment(String currency, double amount) {
        System.out.println("[GlobalPayService] Processing " + amount + " " + currency);
    }
}
