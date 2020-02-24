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
public class Palindrome2 {
    public static void main(String[] args) {
        String myInput;
      
        String[] origStrs;
        int count = 0;
        String palindromes = "";
        String tempReverse;
        
         //get a sentence from user
        myInput = JOptionPane.showInputDialog("Wrods are the same forwards and backwards are called palindromes.\n"
                + "This program determines if words are palindromes.\n\n"
                + "Enter a sentence (please do not include any punctuation mark):");
        
        //treat the input
        myInput = myInput.trim();       //cut the whitespace from begining and ending 
        myInput = myInput.replaceAll( "\\s+", " ");     // replace a series of space with  a single space
        origStrs = myInput.split(" ");                     //get the words in the sentence
        
        
        
        for(int i = 0; i < origStrs.length; i++)
        {
           tempReverse = getRevStr(origStrs[i]);
         //  System.out.println(origStrs[i]);
           
           //treat  uppercase letters and lowercase letters as the same, and compare the words
           if(origStrs[i].equalsIgnoreCase(tempReverse))
            {
                count++;
                palindromes += origStrs[i] +", ";
           
            }
        }
        
      
        
        if(count > 0)
        {
            JOptionPane.showMessageDialog(null, "There are "+ count + " palindromes in the sentence. ");
            JOptionPane.showMessageDialog(null, "The palindromes are \n" + palindromes.substring(0,palindromes.length() -2));
           
        }
        else
        {
              JOptionPane.showMessageDialog(null, "There are no palindromes in the sentence. ");
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
