/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combolockdriver;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer User
 */
public class ComboLockDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int num1;
       int num2;
       int num3;
       
       
       ComboLock lock1 = new ComboLock ();
       String myInput = JOptionPane.showInputDialog("Enter three numbers to set the combination for a lock"
                            + "\nSeperate numbers with hyphens, numbers [1-60]"
                            + "\nExp: 23-45-9");
       try
       {
           num1 = Integer.parseInt(myInput.substring(0,myInput.indexOf("-")));
           System.out.println(num1);
           num2 = Integer.parseInt(myInput.substring(myInput.indexOf("-")+1,myInput.lastIndexOf("-") ));
           System.out.println(num2);
           num3 = Integer.parseInt(myInput.substring(myInput.lastIndexOf("-")+1));
           System.out.println(num3);
           
           lock1.setPasswords(num1, num2, num3);
           
           
           //ask user to input three numbers in combination
            myInput = JOptionPane.showInputDialog("Enter the first number[1-60] in combination"
                            + "\nTry to open the lock !");
            num1 = Integer.parseInt(myInput);
            
            myInput = JOptionPane.showInputDialog("Enter the second number[1-60] in combination"
                                + "\nTry to open the lock !");
            num2 = Integer.parseInt(myInput);
            
            myInput = JOptionPane.showInputDialog("Enter the third number[1-60] in combination"
                                + "\nTry to open the lock !");
            num3 = Integer.parseInt(myInput);
            
            lock1.open(num1, num2, num3);
           
       }
       catch(Exception e)
       {
           return;
       }
       
       ComboLock lock2 = new ComboLock();
       num1 = (int)(Math.random()*3) + 1;
       num2 = (int)(Math.random()*3) + 1;
       num3 = (int)(Math.random()*3) + 1;
       lock2.setPasswords(num1, num2, num3);
       System.out.println(num1 + "  " + num2 + "  "+ num3);
     
       
       
       int count = 1;
       while(lock2.getIsLocked() == true && count <=3)
       {
            myInput = JOptionPane.showInputDialog("guess the combination to open the lock"
                                 + "\nSeperate three numbers with hyphens, numbers [1-3]"
                                 + "\nExp: 3-2-1");
            
           num1 = Integer.parseInt(myInput.substring(0,myInput.indexOf("-")));
           num2 = Integer.parseInt(myInput.substring(myInput.indexOf("-")+1,myInput.lastIndexOf("-") ));
           num3 = Integer.parseInt(myInput.substring(myInput.lastIndexOf("-")+1));
           lock2.open(num1, num2, num3);
           count++;
           
       }
       
       //if  guess three times incoreectly, show the correct combination
       if(lock2.getIsLocked() == true)
       {
           num1 = lock2.getPasswords()[0];
           num2 = lock2.getPasswords()[1];
           num3 = lock2.getPasswords()[2];
           JOptionPane.showMessageDialog(null, "Incorrect three guesses."
                            +"\nthe correct combination of the lock is " 
                            + num1+" "+num2 +" " + num3);
       }
       
       
    }
        
    }
    

