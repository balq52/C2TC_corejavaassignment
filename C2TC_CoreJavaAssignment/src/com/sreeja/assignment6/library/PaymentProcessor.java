package com.sreeja.assignment6.library;

public class PaymentProcessor {

    // 1. Cash Payment
    public void makePayment(double amount) {
        System.out.printf("Amount %.1f paid in cash\n", amount);
    }

    // 2. Wallet Payment
    public void makePayment(double amount, String walletNumber) {
        System.out.printf("Amount %.1f paid using wallet number %s\n", amount, walletNumber);
    }

    // 3. Credit Card Payment
    public void makePayment(String holderName, double amount, String cardType, String ccv) {
        System.out.println("Holder name:" + holderName);
        System.out.printf("Amount %.1f paid using %s card\n", amount, cardType);
        System.out.println("CCV:" + ccv);
    }
}