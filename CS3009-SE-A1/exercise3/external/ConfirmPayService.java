package com.alphasoft.exercise3.external;

public class ConfirmPayService {
    public String confirmPayment(double amount) {
        System.out.println("[ConfirmPayService] Processing payment of $" + amount);
        return "TXN-OK";
    }
}
