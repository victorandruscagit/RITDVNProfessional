/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mybank.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Victor
 */
public class BankTest {
    Bank bank = Bank.getBank();

        Customer firstCustomer = new Customer("John Doe");
        Customer secondCustomer = new Customer("Jane Doe");

       
    
    
    public BankTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         SavingAccount johnSavings = new SavingAccount(1000, 5);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);

        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);

        Bank.addCustomer(firstCustomer);
        Bank.addCustomer(secondCustomer);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBank method, of class Bank.
     */
    @Test
    public void testGetBank() {
        System.out.println("getBank- only one instance of Bank");
        Bank expResult = bank;
        Bank result = Bank.getBank();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        int custNo = 0;
        Customer expResult = null;
        Customer result = Bank.getCustomer(custNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomer method, of class Bank.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        Customer newCustomer = null;
        Bank.addCustomer(newCustomer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAccount method, of class Bank.
     */
    @Test
    public void testAddAccount() {
        System.out.println("addAccount");
        Account newAccount = null;
        Bank instance = null;
        instance.addAccount(newAccount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfClients method, of class Bank.
     */
    @Test
    public void testGetNumOfClients() {
        System.out.println("getNumOfClients");
        int expResult = 0;
        int result = Bank.getNumOfClients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
