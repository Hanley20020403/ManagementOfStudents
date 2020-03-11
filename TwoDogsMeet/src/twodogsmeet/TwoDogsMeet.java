/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodogsmeet;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer User
 */
public class TwoDogsMeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null,"This is program will creat two dogs!");
        
        String myInput = JOptionPane.showInputDialog("please enter the name and breed of the first dog, "
                + "\nSeperate the name and breed by a hyphen"
                + "\nExp: Ellen-Husky");
       
        int pos = myInput.indexOf("-");
        
        //creat the first dog
        Dog dog1 = new Dog(myInput.substring(0,pos), myInput.substring(pos+1));
        
        myInput = JOptionPane.showInputDialog("please enter the name and breed of the second dog, "
                + "\nSeperate the name and breed by a hyphen"
                + "\nExp: Ellen-Husky");
        pos = myInput.indexOf("-");
        //creat the second dog
        Dog dog2 = new Dog(myInput.substring(0,pos), myInput.substring(pos+1));
        
        //output all the infomation of two dogs
        System.out.println(dog1);
        System.out.println("---------------------------------");
        System.out.println(dog2);
        System.out.println("---------------------------------");
        
        //prompt the user to confirm or change the value of the aggression property for each dog
        myInput = JOptionPane.showInputDialog("Would you like to change the aggression for  two dogs? "
                +"if so ,enter the number (1-10), and seprate two numbers by a hyphen"
                 + "\nthe aggression of dog1 = "+ dog1.getAggression()
                + "\nthe aggression of dog2 = "+ dog2.getAggression());
        
        if(myInput != null) 
        { 
            pos = myInput.indexOf("-");
            try
            {
                dog1.setAggression(Integer.parseInt(myInput.substring(0,pos)));
                dog2.setAggression(Integer.parseInt(myInput.substring(pos+1)));
                System.out.println(dog1.getAggression());
            }
            catch(Exception e )
            {
               
            }
        }
        
          //prompt the user to confirm or change the value of the hunger property for each dog
        myInput = JOptionPane.showInputDialog("Would you like to change the hunger for  two dogs? "
                +"if so ,enter the number (1-10), and seprate two numbers by a hyphen"
                 + "\nthe hunger of dog1 = "+ dog1.getHunger()
                + "\nthe hunger of dog2 = "+ dog2.getHunger());
        
        if(myInput != null) 
        { 
            pos = myInput.indexOf("-");
           try
           {
               dog1.setHunger(Integer.parseInt(myInput.substring(0,pos)));
               dog2.setHunger(Integer.parseInt(myInput.substring(pos+1)));
           }
           catch(Exception e )
           {

           }
        }
        
        
        //two dogs meet
        if (dog1.getAggression() > 5 || dog2.getAggression() >5 )
        {
            //one dog is  aggressive
            System.out.print( "at least one dog : ");
            dog1.barkAngry();

            //what if dog is cranky from hunger?
            if (dog1.getHunger() > 7 || dog2.getHunger() >7  ) 
            {
                System.out.println("at least one  dog bares teeth...");
                System.out.println("They are fighting!");
            }
            else 
            {
                System.out.println("They are quarrelling !");
            }
        }
        else 
        {
            //dogs are friendly... so is the meeting
            System.out.print(dog1.getName() + " and  "+ dog2.getName());
            dog1.barkFriendly();
            System.out.println("Good doggies... ");
        }

    }
    
    }
    

