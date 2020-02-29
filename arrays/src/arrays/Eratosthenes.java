/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Hanley
 */
public class Eratosthenes {
    public static void main(String[] args) {
         final int MAX = 1000;
        boolean[] flags = new boolean[MAX +1];  //from 0-1000; the initial values are false
        
        for(int i =2; i<flags.length;i++)
        {
            flags[i] = true;
        }
        
        
        int prime = 2;      //the first prime is two
        while(prime <= MAX)
        {
           //elimate all multiples of the prime
            crossOff(flags, prime);
            
            //get next prime
            prime = getNextPrime(flags, prime);
           
        }
        
        //output all the primes between 1 - 1000
        //output 10 numbers in one line
        int count = 0;
        System.out.println("The prime numbers from 1 - 1000 are: ");
        for(int i= 2; i< flags.length; i++)
        {
           if(flags[i] == true)
           {
               System.out.print(i + " ");
               count++;
           }
           
          //if numbers in one line are greater than 10, start  a new line
           //and recount numbers
           if(count == 10)
           {
               System.out.println();
               count = 0;
           }
        }
        
      		
}
/**
 * eliminate all multiples of the prime
 * @param flags
 * @param prime 
 */
    private static void crossOff(boolean[] flags, int prime) {
       
        //find all the multiples of the prime, and set the value false
        for (int i = prime * prime; i < flags.length; i = i + prime)
        {
            flags[i] = false;
	}

    }

    /**
     * 
     * @param flags
     * @param prime
     * @return 
     */
    private static int getNextPrime(boolean[] flags, int prime) {
        int next = prime + 1;
        
        //since boolean values of all the multiples of the prime has been set false
        //if boolean value is true, it is the next prime
	while (next < flags.length )
        {
            if(flags[next] == false)
            {
		next++;
            }
            else
            {
                break;
            }
	}
        
	return next;	

    }   
}
