/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.mybank.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Victor
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mybank.domain.CustomerTest.class, com.mybank.domain.OverdraftExceptionTest.class, com.mybank.domain.BankTest.class, com.mybank.domain.CheckingAccountTest.class, com.mybank.domain.AccountTest.class, com.mybank.domain.SavingAccountTest.class})
public class DomainSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
