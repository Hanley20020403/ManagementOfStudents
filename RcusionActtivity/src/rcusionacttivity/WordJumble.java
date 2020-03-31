/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcusionacttivity;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer User
 */
public class WordJumble {
    public static void main(String[] args) {
        String word ;
        word = JOptionPane.showInputDialog("Please enter a word ");
        jumbleWords(word, "");
    }

    private static void jumbleWords(String word, String jumbLet) {
        String remainedLet;
        if(word.length() == 1)
        {
            System.out.println(jumbLet + word);
        }
        else
        {
            for(int i = 0;i < word.length(); i++)
            {
                remainedLet = word.substring(0,i) + word.substring(i+1,word.length());
                jumbleWords(remainedLet, jumbLet + word.charAt(i));  
            }
            
        }
    }
}
