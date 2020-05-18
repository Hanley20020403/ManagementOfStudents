/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package searchefficiencies;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Hanley
 */
public class SearchEfficiencies {

    private static int loopCounter =0;          //the number of times that a loop is executed
    private static int comparisonCounter = 0;   //the number of times that a comparison is made
     private static long processingTime;        //the actual time, in milliseconds, that it took to complete the sort
    /**
     * @param args the command line arguments
     */
    public static void main  (String[] args) throws Exception{
        String myInput;
        int length ;
        int num;   //the number to be searched
       
        int result;         //true/false, the result of search
        String title;
        String myOutput = "";
        
        myInput = JOptionPane.showInputDialog("How many random numbers do you wish to generate ? ");
        length = Integer.parseInt(myInput);
         
        //create the array which is not sorted
        //the elements in the array are random numbers from 0 to 1000
        int [] arr = new int[length];
        for(int i =0; i < length; i++)
        {
            arr[i] =  (int)(Math.random()* 1001 );
        }
        
         //output the unsorted array
        for(int i =0 ; i< length; i++)
        {
             System.out.println(arr[i]);
        }
        
        myInput = JOptionPane.showInputDialog("What number do you want to search for ? ");
        num = Integer.parseInt(myInput);
      
     
        //excute Linear Search (unsorted list)
       resetVariables();
       result  = linearSearch(arr, num);
       processingTime = System.currentTimeMillis() - processingTime;
       title = "Performing Linear Search (unsorted list) ";
       myOutput +=displayResult( title, result );
     
       //sort the list, before following search
      // for  binary search and sorted linear search , the list must be sorted
        insertionSort(arr);
       
       //excute Sorted Linear Search (sorted list)
       resetVariables();
       result  = sortedLinearSearch(arr, num);
       processingTime = System.currentTimeMillis() - processingTime;
       title = "Performing Linear Search (sorted list) ";
       myOutput +=displayResult( title, result );
     
        
       
       //excute Binary Search 
       resetVariables();
       result  = binarySearch(arr, num);
       processingTime = System.currentTimeMillis() - processingTime;
       title = "Performing Binary Search ";
       myOutput +=displayResult( title, result );
       
        System.out.println();
        System.out.println(myOutput);
    }
    
    private static String displayResult(String title, int result )
    { 
        boolean flag = true;
        if(result == -1)
        {
            flag = false;
        }
         
        String temp = "";
         
        temp = "_______________________________________________________________\n";
        temp += title + "\n";
        temp += "Search returned : " + flag + "\n";
        temp += "Processing Time : " + processingTime +"ms" + "\n";
        temp += "loopCounter =  " + loopCounter + "\n";
        temp += "comparisonCounter =  " + comparisonCounter + "\n";
         
        return temp;
        
    }

    private static int linearSearch(int[] arr, int number) {
         
        for(int i =0; i < arr.length; i++)
        {
            loopCounter++;
            comparisonCounter++;
            if(arr[i] == number)
            {
                return i; 
            }
           
        }
        
        return -1;
    }
    
 
    private static int sortedLinearSearch(int[] arr, int number) {
        
        
        for(int i =0; i < arr.length; i++)
        {
            loopCounter++;
            comparisonCounter++;
            if(arr[i] == number)
            {
                return i; 
            }
            
            //since the list is sorted , 
            //if current element in the list is bigger than key , no necessary to continue the search 
            //and not found key in the list
            comparisonCounter++;
            if(arr[i] > number)
            {
                break;
            }
        }
        
        return -1;
    }

   

    private static int binarySearch(int[] arr, int number ) {
         
        int low = 0;
        int high = arr.length - 1;
        while (low <= high)
        {
            loopCounter++;
            comparisonCounter++;
            int mid = (low + high) / 2;
            if (arr[mid] == number)
            { 
                
                return mid;
            }
            else if(arr[mid] < number)
            {
               comparisonCounter++;
                low = mid + 1;
            }
            else
            {
                comparisonCounter++;
                high = mid - 1;
            }
        }

      
         return -1;
    }

    private static void insertionSort(int[] arr) {
         for(int i = 1; i< arr.length; i++)
        {
            int curNumber = arr[i];
            int curIndex = i -1;
            
            while(curIndex >-1 && arr[curIndex] > curNumber)
            {
                arr[curIndex +1] = arr[curIndex];
                curIndex--;
            }
                
            arr[curIndex + 1] = curNumber;
          
        }
    }
  
    private static void resetVariables()
    {
        loopCounter = 0;
        comparisonCounter = 0;
        processingTime = System.currentTimeMillis();
       
    }
}