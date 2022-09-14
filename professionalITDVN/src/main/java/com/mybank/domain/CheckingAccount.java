package com.mybank.domain;

public class CheckingAccount extends  Account{
    private double overdraftAmount;

    public CheckingAccount() {
        super();
    }

    public CheckingAccount(double initbalance, double overdraftAmount) {
        this.balance = initbalance;
        this.overdraftAmount = overdraftAmount;
    }

    public CheckingAccount(double initbalance) {
        this(initbalance, 0);
    }

    @Override
    public boolean withdraw(double amt) throws OverdraftException{
        if (amt <= balance  + overdraftAmount) {
            balance = balance - amt;
            return true;
        }
       throw new OverdraftException(amt - balance - overdraftAmount, "Error.Insufficent funds");
    };

    public double getOverdraftAmount() {
        return overdraftAmount;
    }
}
