package com.mybank.domain;

public class Customer {
    private Account[] accounts;
    String fullName;
    int customerNumber;
    private static int customerNumberBase = 1000;
    private int nomOfAccounts;

    public Customer(String fullName) {
        accounts = new Account[10];
        this.fullName = fullName;
        this.customerNumber = customerNumberBase++;
        this.nomOfAccounts = 0;
    }

    public Account getAccount(int accNo) {
        if (accNo < accounts.length && nomOfAccounts != 0) {
            return accounts[accNo];
        }
        return null;
    }

    public void addAccount(Account acc) {
        accounts[nomOfAccounts] = acc;
        nomOfAccounts++;
    }

    @Override
    public String toString() {
        String s = "Customer: " +
                fullName +
                ", customerNumber = " + customerNumber +
                ", nomOfAccounts = " + nomOfAccounts;
        for (int i = 0; i < this.nomOfAccounts; i++) {
            Account acc = getAccount(i);
            if (acc instanceof SavingAccount) {
                s = s + "\n\t" + (i + 1)+ ")" + " Saving accounts whith interest rate " +
                        ((SavingAccount) acc).getInterestRate();
            } else {
                s = s + "\n\t" + (i + 1) + ")"+ " Checking account with overdraft " +
                        ((CheckingAccount) acc).getOverdraftAmount();
            }
            s = s + ", balance $" + acc.getBalance();
        }
        s = s + "\n";
        return s;
    }


}
