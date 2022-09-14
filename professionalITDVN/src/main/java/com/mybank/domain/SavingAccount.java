package com.mybank.domain;

public class SavingAccount extends Account{

    private double interestRate;

    public SavingAccount(double initbalance, double interestRate) {
        this.balance = initbalance;
        this.interestRate = interestRate;
    }

    public SavingAccount(double balance) {
        super(balance);

    }
    public  void addInterestRate(){
        this.balance = this.balance + this.balance * interestRate/100;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
