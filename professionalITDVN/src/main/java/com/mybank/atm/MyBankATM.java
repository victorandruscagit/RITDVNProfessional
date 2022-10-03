/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mybank.atm;

import com.mybank.domain.*;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Victor
 */
public class MyBankATM extends javax.swing.JFrame {

    Bank bank;
    Customer currentCustomer;
    Account currentAccount;

    /**
     * Creates new form MyBankATM
     */
    public MyBankATM() {
        bank = Bank.getBank();

        Customer firstCustomer = new Customer("John", " Doe");
        Customer secondCustomer = new Customer("Jane", " Doe");

        SavingAccount johnSavings = new SavingAccount(1000, 5);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);

        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);
        this.setLocationRelativeTo(null);
        this.setSize(1200, 700);

        Bank.addCustomer(firstCustomer);
        Bank.addCustomer(secondCustomer);

        initComponents();

        for (Component c : jPanel3.getComponents()) {
            if ((c.getClass() == JButton.class) && (((JButton) c).getText() != "Enter")) { //&& (((JButton)c).getText()!= "ENTER")
                JButton currentButton = (JButton) c;
                currentButton.addActionListener(((e) -> {
                    addDigit(e);
                }));
            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ballanceButton = new javax.swing.JButton();
        depositButton = new javax.swing.JButton();
        withdrowButton = new javax.swing.JButton();
        ammountField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        oneButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        poinButton = new javax.swing.JButton();
        enterButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyArea = new javax.swing.JTextArea();
        statusField = new javax.swing.JTextField();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyBankATM");
        setAlwaysOnTop(true);

        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        jPanel2.setLayout(new java.awt.GridLayout(4, 1));

        ballanceButton.setText("Check Account Balance");
        ballanceButton.setEnabled(false);
        ballanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ballanceButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ballanceButton);

        depositButton.setText("Make a deposit");
        depositButton.setEnabled(false);
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });
        jPanel2.add(depositButton);

        withdrowButton.setText("Make a widthtrow");
        withdrowButton.setEnabled(false);
        withdrowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrowButtonActionPerformed(evt);
            }
        });
        jPanel2.add(withdrowButton);
        jPanel2.add(ammountField);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(4, 3));

        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });
        jPanel3.add(oneButton);

        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });
        jPanel3.add(twoButton);

        threeButton.setText("3");
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });
        jPanel3.add(threeButton);

        fourButton.setText("4");
        jPanel3.add(fourButton);

        fiveButton.setText("5");
        jPanel3.add(fiveButton);

        sixButton.setText("6");
        jPanel3.add(sixButton);

        sevenButton.setText("7");
        jPanel3.add(sevenButton);

        eightButton.setText("8");
        jPanel3.add(eightButton);

        nineButton.setText("9");
        jPanel3.add(nineButton);

        zeroButton.setText("0");
        jPanel3.add(zeroButton);

        poinButton.setText(".");
        jPanel3.add(poinButton);

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });
        jPanel3.add(enterButton);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        historyArea.setEditable(false);
        historyArea.setColumns(20);
        historyArea.setRows(5);
        jScrollPane1.setViewportView(historyArea);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        statusField.setEditable(false);
        statusField.setText("Welcome to my bank .Enter the client ID and press ENTER...");
        getContentPane().add(statusField, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeButtonActionPerformed

    }//GEN-LAST:event_threeButtonActionPerformed

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
        //ammountField.setText(ammountField.getText()+ ((JButton)evt.getSource()).getText());
    }//GEN-LAST:event_oneButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twoButtonActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        int customerID = 99;
        try {
            customerID = Integer.parseInt(ammountField.getText());
            currentCustomer = bank.getCustomer(customerID);
            currentAccount = currentCustomer.getAccount(0);
            historyArea.append("Customer with ID: " + customerID + " is "
                    + currentCustomer.getFirstName() + "" + currentCustomer.getLastName() + "\n");
            ballanceButton.setEnabled(true);
            depositButton.setEnabled(true);
            withdrowButton.setEnabled(true);
            enterButton.setEnabled(false);

        } catch (Exception e) {
            historyArea.append("\nError.Customer with customer ID  " + customerID + " not found");

        }

        ammountField.setText("");
        statusField.setText("Customer" + currentCustomer.getFirstName() + "" + currentCustomer.getLastName() + "\n" );


    }//GEN-LAST:event_enterButtonActionPerformed

    private void ballanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ballanceButtonActionPerformed

        historyArea.append("Balance of " + currentCustomer.getFirstName() + "'s first"
                + "account is $ " + currentAccount.getBalance());
        if (currentAccount instanceof CheckingAccount) {
            historyArea.append(" This is a checking account with overdraft protection: "
                    + ((CheckingAccount) currentAccount).getOverdraftAmount() + "\n" );
             statusField.setText("Ready");
        } else {
            historyArea.append("This is a savings  account with interest rate " + ((SavingAccount) currentAccount).getInterestRate());
             statusField.setText("Error");
        }
        

    }//GEN-LAST:event_ballanceButtonActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        try {
            double amount = Double.parseDouble(ammountField.getText());
            currentAccount.deposit(amount);
            historyArea.append("Deposit : $ " + amount + " new balance is $ " + currentAccount.getBalance() + "\n");
             statusField.setText("Ready");
        } catch (Exception e) {
            historyArea.append("ERROR: can't complete deposit operation...");
             statusField.setText("Error");
        }
        ammountField.setText("");

    }//GEN-LAST:event_depositButtonActionPerformed

    private void withdrowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrowButtonActionPerformed
        try {
            double amount = Double.parseDouble(ammountField.getText());
            if (currentAccount.withdraw(amount)) {
                historyArea.append("Deposit : $ " + amount + " new balance is $ " + currentAccount.getBalance() + "\n");
            } 
            
        }catch(OverdraftException oe){
            historyArea.append("Error: Insufficient funds\n");
            statusField.setText("Error");
        } 
        catch (Exception e) {
            historyArea.append("ERROR: can't complete deposit operation...");
        }
        ammountField.setText("");
 
    }//GEN-LAST:event_withdrowButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyBankATM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ammountField;
    private javax.swing.JButton ballanceButton;
    private javax.swing.JButton depositButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton enterButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JTextArea historyArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton poinButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JTextField statusField;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton withdrowButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables

    private void addDigit(ActionEvent e) {
        ammountField.setText(ammountField.getText() + ((JButton) e.getSource()).getText());
    }
}
