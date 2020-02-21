                                                                                                                                                                                                                                                                                                                                                                                                                                              /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaoftriangle;

import javax.swing.JOptionPane;

/**
 *
 * @author Hanley
 */
public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myInput;
        
        double side1, side2, side3, angle;      
        double semiP;   // the semi-perimeter of a triangle
        double area;    //the area of a triangle
        
        //Print a warning message to the user about degrees
        System.out.println("When entering angle of a triangle , please using degrees! ");
        
        //get the length of the first side of a triangle
        myInput = JOptionPane.showInputDialog("What is the length of the first side of a triangle ?");
        side1 = Double.parseDouble(myInput);
        
         //get the length of the second side of a triangle
        myInput = JOptionPane.showInputDialog("What is the length of the second side of a triangle ?");
        side2 = Double.parseDouble(myInput);
		
         //get the length of the third side of a triangle
        myInput = JOptionPane.showInputDialog("What is the length of the third side of a triangle ?");
        side3 = Double.parseDouble(myInput);
        
         //get the angle between the first side and the second side 
        myInput = JOptionPane.showInputDialog("What is the angle between the first side and the second side  ?");
        angle = Double.parseDouble(myInput);
        
        semiP = (side1 + side2 + side3 ) / 2;
        area = Math.sqrt(semiP * (semiP - side1) * (semiP - side2) * (semiP - side3));
       
        //Display output, when using Heron's formula
        System.out.println("When using Heron's formula , the area of a triangle is " + area);
        
        //change degree to radian
        angle = angle / 180 * Math.PI;
        area = (side1 * side2 * Math.sin(angle)) / 2;
        
         //Display output, when using trigonometry
        System.out.println( "When using trigonometry, the area of a triangle is " + area);
  
    }
    
}
