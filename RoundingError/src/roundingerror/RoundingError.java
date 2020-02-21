/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundingerror;

import javax.swing.JOptionPane;

/**
 *
 * @author Hanley
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myInput;
         double num;
         double square, squareRoot, roundError;
         
        myInput = JOptionPane.showInputDialog("please enter a number");
        num = Double.parseDouble(myInput);
        
       //get the square root of the number
        squareRoot = Math.sqrt(num);
        
        //get the square of the square root of the number
        square = Math.pow(squareRoot, 2);
        
        //compare the square and original number
        roundError = num - square;
        
      
        System.out.println("the number = " + num);
        System.out.println("the square  =  " + square);
        System.out.println("the round off error  = " + roundError);
        
    }
    
}
