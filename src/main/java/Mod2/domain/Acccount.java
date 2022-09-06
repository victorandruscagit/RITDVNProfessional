package Mod2.domain;

public class Acccount {

    private double balance;

    public Acccount(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }

    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }

    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }

    }
}
