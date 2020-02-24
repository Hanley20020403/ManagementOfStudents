/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringdatatypes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer User
 */
public class MorseCode {
         public static void main(String[] args) {
         String myInput;
         String[] letters = new String[36];
         String[] morseCodes = new String[36];
         String origMessage, finalMessage = "";
         
         myInput = JOptionPane.showInputDialog("Please enter a message");
         myInput = myInput.trim();
         origMessage = myInput.toUpperCase();
         
         //read the morsecode table from the data file
         try{
             FileReader file = new FileReader("MorseCode.txt");
             BufferedReader buffer = new BufferedReader(file);
             
              //the first line: Letter; the second line : Morse Code
             buffer.readLine();
             buffer.readLine();
             
             for(int i = 0; i<36; i++)
             {
                
                 letters[i] = buffer.readLine();
                 morseCodes[i] = buffer.readLine();
             }
             
             file.close();
             buffer.close();
         }
         catch(IOException e )
         {
             System.out.println("Problem reading the data file");
             System.out.println("IOException: " + e.getMessage());
             return;
         }
         
     
         String tempStr;
         for(int i = 0; i < origMessage.length(); i++)
         {
             tempStr = Character.toString(origMessage.charAt(i));
           
            for(int j = 0; j < 36; j++)
            {
             
                  if(letters[j].equals(tempStr))
                  {
                     
                      finalMessage += morseCodes[j] + "  ";
                  }
            }
         }
         
         System.out.println(myInput + " in  morse code is  " + finalMessage);
         
     }
    
}
