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
public class WordPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Please enter a word ");
        pyramidWord(word);
    }

    private static void pyramidWord(String word) {
        
        System.out.println(word);
        if(word.length()>=3)
        {   
           
            word = word.substring(1,word.length()-1);
            pyramidWord(word);
           
            
        }
         
    }
     
}
