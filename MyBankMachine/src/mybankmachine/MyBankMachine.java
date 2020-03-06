/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybankmachine;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer User
 */
public class MyBankMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ATM customer = new ATM("TD", "03394527", 11500);
        
        //get customer's choice
        String choice = JOptionPane.showInputDialog("Welcome to the ATM Bank : \n"
                + "1 - deposit\n"
                + "2 - withdraw\n"
                 + "3 - add daily interest");
        
        if(choice == null)
        {
            return;
        }
        
        double money = 0;
        
         if (choice.equals("1"))
        {
            try
            {
                money =  Double.parseDouble(JOptionPane.showInputDialog("please enter the amount of money to deposit !"));
                
            }
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(null, "error amount of money "
                    + "\n Thank you! ");
                 return;
            }
             customer.deposit(money);
            
        } 
        else if (choice.equals("2")) {
             try
            {
                money =  Double.parseDouble(JOptionPane.showInputDialog("please enter the amount of money to withdraw !"));
            }
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(null, "error amount of money ! "
                    + "\n Thank you! ");
                 return;
            }
            customer.withdraw(money);
            
        } 
        else if (choice.equals("3")) {
            double rate = 0;   // annual interest rate
            int days = 0;   //the number of days to leave the balance invested
            
            try
            {
                rate =  Double.parseDouble(JOptionPane.showInputDialog("please enter the annual interest rate (0-10)"));
                if(rate <0 || rate >10)
                {
                    JOptionPane.showMessageDialog(null, "annual interest rate should be between 0 and 10 ! "
                                         + "\n Thank you! ");
                    return;
                  
                }
                 days =  Integer.parseInt(JOptionPane.showInputDialog("please enter the number of days to leave the balance invested !"));
            }
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(null, "error amount of money ! "
                    + "\n Thank you! ");
                 return;
            }
            customer.addInterest(rate, days);
            
        } 
        else {
            JOptionPane.showMessageDialog(null, "Thank you for using ATM.");
            return;
            
        }
         
        JOptionPane.showMessageDialog(null, customer.toString());
    }
    }
    

