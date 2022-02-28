package com.company;

public class Account {

    private String accountNumber;
    private double balance;
    private String title;


    public void depositAmount(double amount) {
        this.balance += amount;
        System.out.println("Deposit Amount: " + amount);
        System.out.println("New Balance: " + this.balance);
        System.out.println();
    }

    public void withdrawAmount(double amount) {
        System.out.println("Withdraw Amount: " + amount);
        if (this.balance - amount < 0) {
            System.out.println("Insufficient Fund for Withdraw");
            System.out.println();

        } else {
            this.balance -= amount;
            System.out.println("New Balance: " + this.balance);
        }
    }

    public void information() {
        System.out.println("Account Title: " + this.title);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Balance: " + this.balance);
        System.out.println();
    }

    public Account(String accountNumber, String title) {
        this.accountNumber = accountNumber;
        this.title = title;
        this.balance = 0.0;
    }

}
