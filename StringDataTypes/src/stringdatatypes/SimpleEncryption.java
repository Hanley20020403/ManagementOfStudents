/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringdatatypes;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer User
 */
public class SimpleEncryption {
    public static void main(String[] args) {
         String myInput ;
         int rotation = 0;
         int encryOrDecry = 1;
         String origMessage, finalMessage = "";
         
        
          //get an original message from user
        myInput = JOptionPane.showInputDialog("This program will encrypt or decrypt a phrase using the \n"
                + " simple encrypt method of rotating the letters.\n\n"
                + "Please enter a phrase: ");
        origMessage  = myInput.trim();
       
        
        //get rotaion amount
        while(true)
        {
            myInput = JOptionPane.showInputDialog("Enter the rotation amount (1 - 25)");
            try{
                 rotation = Integer.parseInt(myInput);
                 if(rotation > 25 || rotation < 1)
                 {
                     JOptionPane.showMessageDialog(null, "rotation amount should be an integer between 1 and 25");
                     continue;
                 }
                 else 
                 {
                      break;
                 }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "rotation amount should be an integer between 1 and 25");
            }
        }
       
        
        //get encryption or decryption
          while(true)
        {
           myInput = JOptionPane.showInputDialog("1 - Encryption \n"
                     + "2 - Decrytion");
            try{
                 encryOrDecry = Integer.parseInt(myInput);
                 if(encryOrDecry !=1 && encryOrDecry !=2)
                 {
                    continue;
                 }
                 else 
                 {
                      break;
                 }
            }
            catch(Exception e)
            {
               continue;
            }
        }
          origMessage = origMessage.toUpperCase();
          
          if(encryOrDecry == 1)
          {
               finalMessage = encryptMessage(origMessage, rotation);
          }
          else if(encryOrDecry == 2)
          {
               finalMessage = decryptMessage(origMessage, rotation);
          }
          
        //output the original message and encrypted message 
        System.out.println("The original phrase is " + origMessage);
        System.out.println("The encrypted phrase is " + finalMessage);
          
          
     }

     /**
      * 
      * @param origMessage
      * @param rotation
      * @return 
      */
    private static String encryptMessage(String origMessage, int rotation) {
       char tempChar;
       int tempAscii;
      
       String finalMessage = "";
        for(int i =0 ; i < origMessage.length(); i++)
         {
             tempChar = origMessage.charAt(i);
             tempAscii = (int)tempChar;
             
             //if char is not from A to Z, do not change the char
             if(tempAscii>90 || tempAscii <65)
             {
                 
                 finalMessage += tempChar;
                 continue;
             
             }
           
             if((tempAscii >= (90-rotation +1) && tempAscii <=90) )
             {
                 tempAscii = tempAscii -26;
             }
             
             tempAscii = tempAscii + rotation;
             tempChar = (char)tempAscii;
             finalMessage += tempChar;
         }
        return finalMessage;
    }
    
    
    /**
     * 
     * @param origMessage
     * @param rotation
     * @return 
     */
    private static String decryptMessage(String origMessage, int rotation) {
       char tempChar;
       int tempAscii;
      
       String finalMessage = "";
        for(int i =0 ; i < origMessage.length(); i++)
         {
             tempChar = origMessage.charAt(i);
             tempAscii = (int)tempChar;
             
              //if char is not from A to Z, do not change the char
              if(tempAscii>90 || tempAscii <65)
             {
                  finalMessage += tempChar;
                 continue;
             }
             
             if((tempAscii <= (65 + rotation -1) && tempAscii >=65) )
             {
                 tempAscii = tempAscii + 26;
             }
             
             tempAscii = tempAscii - rotation;
             tempChar = (char)tempAscii;
             finalMessage += tempChar;
         }
        return finalMessage;
    }
}
