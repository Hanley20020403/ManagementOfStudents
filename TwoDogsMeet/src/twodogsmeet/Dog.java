/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodogsmeet;

/**
 *
 * @author Acer User
 */
class Dog {

    //variables for characteristics
    private String dogName, dogBreed;
    private int dogAge;
    private int aggression, hunger;

    //constructors
    public Dog(String dgName, String dgBreed,int dgAge,  int agg, int hung){
      dogName = dgName;
      dogBreed = dgBreed;
      dogAge = dgAge;
      aggression = agg;
      hunger = hung;
    }

    //Alternate constructor
    public Dog(String dgName, String dgBreed){
      //This constructor only uses the name and breed
      //Set the aggression and hunger to random #s

        dogName = dgName;
        dogBreed = dgBreed;
        dogAge = (int)(Math.random()*18) +1;
        aggression = (int)(Math.random()*10) + 1;
        hunger = (int)(Math.random()*10) + 1;
      }

  //Accessor Methods
  public String getName() {
    return dogName;
  }

  public void setName(String dgName){
    dogName = dgName;
  }

  public String getBreed() {
    return dogBreed;
  }

  public void setBreed(String dgBreed){
    dogBreed = dgBreed;
  }
  
    public int getAge() {
    return dogAge;
  }

  public void setAge(int dgAge){
    dogAge = dgAge;
  }

  public int getAggression() {
    return aggression;
  }

  public void setAggression(int dogAgg){
    aggression = dogAgg;
  }

  public int getHunger() {
    return hunger;
  }

  public void setHunger(int dogHung){
    hunger = dogHung;
  }

  public void barkFriendly() {
    System.out.println("Arf! Arf!");
  }

  public void barkAngry() {
    System.out.println("GRR! RRRFFF!");
  }

  //method to display all info of the Dog
  public String toString() {
    String output = "Name: " + dogName + "\n";
    output += "Breed: " + dogBreed + "\n";
    output += "Age: " + dogAge + "\n";
    output += "Aggression: " + aggression + "\n";
    output += "Hunger: " + hunger;
    //output string is complete, return it
    return output;
  }

    }
    

