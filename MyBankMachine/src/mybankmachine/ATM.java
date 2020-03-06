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
class ATM {
     private String bankName;
    private String accountID;
    private double balance;
    private double interest = 0;
    
    public ATM(){
        bankName = "RBC";
        
    }
    
    public ATM(String bkName, String customerID, double customerBalance){
        bankName = bkName;
        accountID = customerID;
        balance = customerBalance;
    } 
    
    
    public String getAccountID(){
        return accountID;
    }
    
    /**
     * This method allows the user to set the account id
     * pre: needs an account id value
     * post: sets account id value
     */
    public void setAccountID(String id){
        accountID = id;
    }
    
    
  /**
   * deposit money
   * @param money 
   */
   public void deposit(double money){
        if(money<=0){
            JOptionPane.showMessageDialog(null, "error amount of money"
                    + "\n Thank you! ");
            return;
        }
        this.balance+=money;
       
        JOptionPane.showMessageDialog(null, "deposit  = " + money
                + "\n balance = " + balance
                    + "\n deposit successfully !");
    }
   
   /**
   * withdraw money
   * @param money 
   */
   public void withdraw(double money){
        if(money<=0){
           JOptionPane.showMessageDialog(null, "error amount of money"
                    + "\n Thank you! ");
            return;
        }
        this.balance-=money;
       
       JOptionPane.showMessageDialog(null, "withdraw =  " + money
               +"\n balance = " + balance
                    + "\ndeposit successfully !");
    }
   
   /**
    * calculate daily interest , and then add to the balance
    * @param rate
    * @param days 
    */
    public void addInterest(double rate, int days) {
        balance = balance * Math.pow(1 + rate/100 , days/365.0 );
        balance = balance * 100;
        balance = Math.round(balance);
        balance = balance / 100;
        JOptionPane.showMessageDialog(null, "the annual interset rate  = " + rate
                +"\n the number of days to leave the balance invested   = " + days
                +"\n balance = " + balance);
        
    }
   
   //method to display all info of an account
    public String toString() {
        String output = "bank name: " + bankName + "\n";
        output += "account id : " + accountID + "\n";
        output += "balance: " + balance + "\n";
        output += "interest: " +interest;
        
        //output string is complete, return it
        return output;
    }
}
