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
class Car {
     private String carMake, carModel;
    private int carYear;
    private int carPrice;
    private String carColor ;
    private int carMaxSpeed;
    
    public Car()
    {
        carMake = "BMW";
        carModel = "X5";
        carYear = 2020;
        carPrice = 30000;
        carColor = "BLUE";
        carMaxSpeed = 250;   //250km/h
    }
    
     public Car(String crMake, String crModel, int crYear, int crPrice, String crColor, int crMaxSpeed)
    {
        carMake = crMake;
        carModel = crModel;
        carYear = crYear;
        carPrice = crPrice;
        carColor = crColor;
        carMaxSpeed = crMaxSpeed;  
    }
     
      public Car(String crMake, String crModel, int crYear, int crPrice)
    {
        carMake = crMake;
        carModel = crModel;
        carYear = crYear;
        carPrice = crPrice;
        carColor = "BLACK";
        carMaxSpeed = (int)(Math.random()*200+50);  
    }
    
      
     //method to display all info of the car
    public String toString() {
        String output = "Make: " + carMake + "\n";
        output += "Model: " + carModel + "\n";
        output += "Year: " + carYear + "\n";
        output += "Price: " + carPrice + "\n";
        output += "Color: " + carColor + "\n";
        output += "MaxSpeed: " + carMaxSpeed ;
        
        //output string is complete, return it
        return output;
    }

    

    public void horkHorn(boolean flag) {
        if(flag == false)
        {
             System.out.println("Silence! ");
        }
        else 
        {
          System.out.println("Hork the horn ! ");
        }
    }
}
     