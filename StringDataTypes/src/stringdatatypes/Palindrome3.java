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
public class Palindrome3 {
    public static void main(String[] args) {
        
        String origStr, reverseStr;
        String origTemp, reverseTemp;
        
        //get a phrase from user
        origStr = JOptionPane.showInputDialog("Wrods are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a word is a palindrome.\n\n"
                + "Enter a phrase (please do not include any punctuation mark):");
        
        origStr = origStr.trim();
       
        //get the phrase in reverse
        reverseStr = getRevStr(origStr);
        
        // remove all the whitespace in strings before comparing
         origTemp = origStr.replaceAll( "\\s+", "");
         reverseTemp = reverseStr.replaceAll( "\\s+", "");
         
         
        //treat  uppercase letters and lowercase letters as the same, and then compare the words
        if(origTemp.equalsIgnoreCase(reverseTemp))
        {
            JOptionPane.showMessageDialog(null, origStr + "  IS a palindrome.");
           
        }
        else
        {
              JOptionPane.showMessageDialog(null, origStr + "  is  NOT a palindrome.");
        }
    }

  

   private static String getRevStr(String origStr) {
        String revStr = "";
        for(int i = origStr.length() - 1; i>= 0; i--)
        {
            revStr = revStr + origStr.charAt(i);
                
        }
        
        return revStr;
    }
}
