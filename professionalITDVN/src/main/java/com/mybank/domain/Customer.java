package com.mybank.domain;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Account> accounts ;
    String firstName;
    String lastName;
    int customerNumber;
    private static int customerNumberBase = 1000;
    private int nomOfAccounts;
   
    public int getNomOfAccounts() {
        return nomOfAccounts;
    }

    public Customer(String firstName, String lastName) {
        accounts = new ArrayList<>();
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerNumber = customerNumberBase++;
        this.nomOfAccounts = 0;
    }

    public Account getAccount(int accNo) {
        if (accNo < accounts.size() && nomOfAccounts != 0) {
            return accounts.get(accNo);
        }
        return null;
    }

    public void addAccount(Account acc) {
        accounts.add(acc);
        nomOfAccounts++;
    }

    @Override
    public String toString() {
        String s = "Customer: " +
                lastName + " " + firstName +
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
