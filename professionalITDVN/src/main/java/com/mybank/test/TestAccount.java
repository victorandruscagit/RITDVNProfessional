package com.mybank.test;

import com.mybank.domain.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestAccount {
    public static void main(String[] args) {
        Bank bank = Bank.getBank();

        Customer firstCustomer = new Customer("John", " Doe");
        Customer secondCustomer = new Customer("Jane" ," Doe");

        SavingAccount johnSavings = new SavingAccount(1000, 5);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);

        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);

        Bank.addCustomer(firstCustomer);
        Bank.addCustomer(secondCustomer);

        displayCustomers();

        Bank.getCustomer(0).getAccount(0).deposit(2000);
        try {
            Bank.getCustomer(0).getAccount(1).withdraw(9500);
        } catch (OverdraftException ex) {
            System.out.println(ex.getMessage() + ": $" + ex.getDeficit() + "!\n");
        } catch (Exception ex) {
            System.out.println("Something went wrong");
        }
        ((SavingAccount) Bank.getCustomer(0).getAccount(0)).addInterestRate();
        System.out.println("");

        displayCustomers();


    }

    private static void displayCustomers() {
        System.out.println(Bank.getCustomer(0));
        System.out.println(Bank.getCustomer(1));
    }
}
