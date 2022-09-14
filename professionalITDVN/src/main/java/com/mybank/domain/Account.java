package com.mybank.domain;

public class Account {
    protected double balance;

    public Account() {
        this.balance = 0;

    }

    protected Account(double initbalance) {
        if (initbalance >= 0) {
            this.balance = initbalance;
        } else {
            this.balance = 0;
            System.out.println("");
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) throws Exception{
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
