/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mybank.data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import sun.jvm.hotspot.ui.action.ShowAction;

/**
 *
 * @author Victor
 */
public class ChatClient {
    private JTextArea output;
    private JTextField input;
    private JButton sendButton;
    private JButton quitButton;

    public ChatClient() {
        this.output = new JTextArea(10, 50);
        this.input = new JTextField(50);
        this.sendButton = new JButton("Send");
        this.quitButton = new JButton("Quit");
    }
    
    public void launchFrame(){
        JFrame frame = new JFrame("Bank Chat Room");
        frame.setLayout(new BorderLayout());
        frame.add(output, BorderLayout.CENTER);
        frame.add(input, BorderLayout.SOUTH);
        JPanel buttonPannel = new JPanel();
        buttonPannel.setLayout(new GridLayout(2, 1));
        buttonPannel.add(sendButton);
        buttonPannel.add(quitButton);
        frame.add(buttonPannel, BorderLayout.EAST);
        input.addActionListener(new SendHandler());
        sendButton.addActionListener(new SendHandler());
       quitButton.addActionListener((ActionEvent e) -> {
           System.exit(0);
        });
      
        frame.pack();
        output.setEnabled(false);
        frame.setAlwaysOnTop(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
      
    }
    
    public static void main(String[] args) {
        ChatClient myChat = new  ChatClient();
        myChat.launchFrame();
    }
    private class SendHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = input.getText();
            output.append( message + "\n");
            input.setText("");
            
           
        }
        
    }
    
}
