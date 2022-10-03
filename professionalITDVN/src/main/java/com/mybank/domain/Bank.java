package com.mybank.domain;

import javax.crypto.MacSpi;
import java.util.ArrayList;

public class Bank {
    private static ArrayList<Customer> customers = new ArrayList();
    private static int numOfClients = 0;
    private static Bank myBank = new Bank();


    public static Bank getBank() {
        return myBank;
    }

    private Bank() {
    }

    public static Customer getCustomer(int custNo) {
        if (custNo < customers.size()) {
            return customers.get(custNo);
        }
        return null;
    }

    public static void addCustomer(Customer newCustomer) {
        customers.add(newCustomer);
        numOfClients++;
    }


    void addAccount(Account newAccount) {
    }

    public static int getNumOfClients() {
        return numOfClients;
    }

    public static ArrayList<Customer> getCustomers() {
        return customers;
    }
}
