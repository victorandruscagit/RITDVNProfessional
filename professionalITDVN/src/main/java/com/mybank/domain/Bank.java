package com.mybank.domain;

import javax.crypto.MacSpi;

public class Bank {
    private static Customer[] customers = new Customer[1000];
    private static int numOfClients = 0;
    private static Bank myBank = new Bank();


    public static Bank getBank() {
        return myBank;
    }

    private Bank() {
    }

    public static Customer getCustomer(int custNo) {
        if (custNo < customers.length) {
            return customers[custNo];
        }
        return null;
    }

    public static void addCustomer(Customer newCustomer) {
        customers[numOfClients] = newCustomer;
        numOfClients++;
    }


    void addAccount(Account newAccount) {
    }

    public static int getNumOfClients() {
        return numOfClients;
    }
}
