package com.mybank.data;

import com.mybank.domain.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DataSource {
    private File dataFile;

    public DataSource(String dataFilePath) {
        dataFile = new File(dataFilePath);

    }

    public void loadData() throws IOException {
        Bank bank = Bank.getBank();
        Scanner scanner = new Scanner(dataFile);
        Customer customer ;
        int numofCustomers = scanner.nextInt();
        for (int i = 0; i < numofCustomers; i++) {
            String firstName = scanner.next();
            String lastName = scanner.next();
            bank.addCustomer(new Customer(firstName, lastName));
            customer = bank.getCustomer(i);
            int numOfAccounts = scanner.nextInt();
            while (numOfAccounts-- > 0) {
                char accountType = scanner.next().charAt(0);
                switch (accountType) {
                    case 'S': {
                        float initialBalance = scanner.nextFloat();
                        float interestRate = scanner.nextFloat();
                        customer.addAccount(new SavingAccount(initialBalance, interestRate));
                        break;
                    }
                    case 'C': {
                        float initialBalance = scanner.nextFloat();
                        float ovedraftAmount = scanner.nextFloat();
                        customer.addAccount(new CheckingAccount(initialBalance, ovedraftAmount));
                        break;
                    }


                }

            }


        }


    }

}
