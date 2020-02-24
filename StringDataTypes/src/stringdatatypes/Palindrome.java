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
public class Palindrome {
     public static void main(String[] args) {
        String origStr, reverseStr;
        
        //get a word from user
        origStr = JOptionPane.showInputDialog("Wrods are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a word is a palindrome.\n\n"
                + "Enter a word: ");
        
        origStr = origStr.trim();
        //get the word in reverse
        reverseStr = getRevStr(origStr);
        
        //treat  uppercase letters and lowercase letters as the same, and  compare the words
         if(origStr.equalsIgnoreCase(reverseStr))
        {
            JOptionPane.showMessageDialog(null, origStr + " in reverse is "+ reverseStr + ".\n"
                                + "Tt is a palindrome.");
           
        }
        else
        {
              JOptionPane.showMessageDialog(null, origStr + " in reverse is "+ reverseStr + ".\n"
                                + "Tt is NOT a palindrome.");
        }
    }

  
/**
 * 
 * @param origStr
 * @return string
 */
   private static String getRevStr(String origStr) {
        String revStr = "";
        for(int i = origStr.length() - 1; i>= 0; i--)
        {
            revStr = revStr + origStr.charAt(i);
                
        }
        
        return revStr;
    }
    
}
