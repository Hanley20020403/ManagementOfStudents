/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

/**
 *
 * @author Acer User
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("VOLVO", "s90", 1985, 10000,"RED", 180);
        Car car3 = new Car("HONDA", "X-RV", 2010, 8000);
        
        
        //Print the details of each car
        System.out.println(car1.toString());
        System.out.println("--------------------------");
        
        System.out.println(car2.toString());
        System.out.println("--------------------------");
        
        //toString is called by default, no need to write it!
        System.out.println(car3);
        System.out.println("--------------------------");
        
         //car keeps silence, car2 horks the horn
        System.out.println("car1");
         car1.horkHorn(false);
        System.out.println("car2");
         car2.horkHorn(true);

    }
    }
    

