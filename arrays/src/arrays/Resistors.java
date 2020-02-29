/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author Hanley
 */
public class Resistors {
     public static void main(String[] args) {
        String[] colours = {"BLACK", "BROWN", "RED","ORANGE","YELLOW","GREEN","BLUE","VIOLET","GREY","WHITE"};
        String myInput ;
        String[] colorBands = new String[3];
        Double value ;
        
        //get input from user
        myInput = JOptionPane.showInputDialog("What is your resistors colour code ? \n"
                + "Seperate each colour by hyphens\n"
                + "EX: Red-Orange-Black ");
        
       
        
        String tempStr = "";
        try
        {
            //get three colors from input
             myInput = myInput.trim();
             colorBands = myInput.split("-");
             
             //get color code
             for(int i = 0; i<colorBands.length; i++)
            {
                for(int j =0; j<colours.length; j++)
                {
                    if(colorBands[i].equalsIgnoreCase(colours[j]))
                    {
                         tempStr += j;
                         break;
                    }
                }
             }
                                                                                                                                                                
             //calculate the value of the resistor
             //The first two colours are used as ordinary numbers; the third is a power of 10.
            value = Double.parseDouble(tempStr.substring(0,2)) * Math.pow(10, Double.parseDouble(tempStr.substring(2)));
        }
        catch(Exception e)
        {
            return;
        }
       
       
        
        
        System.out.println("You entered " + myInput);
        System.out.println("the value of the resistor is " + value + " ohms");
        
    }
}