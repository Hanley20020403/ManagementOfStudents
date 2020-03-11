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
public class ComboLock {
     private int[] passwords = new int[3];
    private boolean isLocked = false;
    
    //default constructor
    public ComboLock()
    {
        
    }
    
    //alternate constructor
     public ComboLock(int num1, int num2, int num3)
    {
        passwords[0]= num1;
        passwords[1] = num2;
        passwords[2] = num3;
        
    }
    
     
     //Accessor Methods
    public void setPasswords(int num1, int num2, int num3)
    {
        passwords[0]= num1;
        passwords[1] = num2;
        passwords[2] = num3;
        isLocked = true;
    }
    
     public int[] getPasswords()
    {
        return passwords;
    }
     
     public void setIsLocked(boolean lockedOrNot)
     {
         isLocked = lockedOrNot;
     }
     
     public boolean getIsLocked()
     {
         return isLocked;
     }
     
     /**
      * if three numbers match the combination , then  open the lock
      * @param num1
      * @param num2
      * @param num3 
      */
     public void open( int num1, int num2, int num3)
     {
         if(passwords[0] == num1  && passwords[1] == num2 && passwords[2] == num3)
         {
             
              isLocked = false;
              JOptionPane.showMessageDialog(null, "The lock is opened ! "
                      + "\nWell done !");
         }
         else 
         {
             isLocked = true;
             JOptionPane.showMessageDialog(null, "Error combination ! "
                     +"\nThe lock is not opened ! ");
         }
        
     }
     
    
}
