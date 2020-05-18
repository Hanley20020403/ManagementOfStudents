/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortingefficiencies;


import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Hanley
 */
public class SortingEfficiencies {
   
    private static int loopCounter =0;           //the number of times that a loop is executed
    private static int comparisonCounter = 0;   //the number of times that a comparison is made
    private static int shiftCounter = 0;        //the number of times a value was shifted from one location to another
    private static long processingTime;         //the actual time, in milliseconds, that it took to complete the sort
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws Exception{
        String myInput;
        int length ;
       
        String title;
        String myOutput = "";
        
        myInput = JOptionPane.showInputDialog("How many random numbers do you wish to generate ? ");
        length = Integer.parseInt(myInput);
         
        //create the array which is not sorted
        //the elements in the array are random numbers from 0 to 1000
        int [] oriArr = new int[length];
        int [] arr = new int[length];
        for(int i =0; i < length; i++)
        {
            oriArr[i] =  (int)(Math.random()* 1001 );
        }
   
      //excute Selection Sort
       arr = Arrays.copyOf(oriArr, length);     //use original unsorted numbers before sorting
       resetVariables();
       selectionSort(arr);;
       processingTime = System.currentTimeMillis() - processingTime;
       title = "Performing Selection Sort ";
       myOutput += displayResult( title );
       
       
    
       //excute Insertion Sort
       arr = Arrays.copyOf(oriArr, length); 
       resetVariables();
       insertionSort(arr);
       processingTime = System.currentTimeMillis() - processingTime;
       title = "Performing Insertion Sort ";
       myOutput += displayResult( title );
     
             
       //excute Merge Sort
        arr = Arrays.copyOf(oriArr, length);
        resetVariables();
        mergeSort(arr);
        processingTime = System.currentTimeMillis() - processingTime;
        title = "Performing Merge Sort ";
        myOutput += displayResult( title );


       //output the sorted array
       for(int i =0 ; i< length; i++)
       {
            System.out.println(arr[i]);
       }
         
        System.out.println();
        System.out.println(myOutput);
    }
    
    private static void resetVariables()
    {
        loopCounter = 0;
        comparisonCounter = 0;
        shiftCounter = 0;
        processingTime = System.currentTimeMillis();
       
    }
    
     private static String displayResult( String title )
    { 
         String temp = "";
         
         temp = "_______________________________________________________________\n";
         temp += title + "\n";
         temp += "Processing Time : " + processingTime +"ms" + "\n";
         temp += "loopCounter =  " + loopCounter + "\n";
         temp += "comparisonCounter =  " + comparisonCounter + "\n";
         temp += "shiftCounter =  " + shiftCounter + "\n";
        
         return temp;
        
    }
     
      private static void insertionSort(int[] arr) {
        
         for(int i = 1; i< arr.length; i++)
        {
            loopCounter++;
            
            int curNumber = arr[i];
            int curIndex = i -1;
            
            
//            while(curIndex >-1 && arr[curIndex] > curNumber)
//            {
//                arr[curIndex +1] = arr[curIndex];
//                curIndex--;
//                
//                loopCounter++;
//              //  comparisonCounter++;
//                shiftCounter++;
//            }
            
            //inorder to counte the number of times of comparison, 
            //change the while loop above to the below
             while(curIndex >-1 )
            {
                comparisonCounter++;
                if(arr[curIndex] > curNumber)
                {
                    arr[curIndex +1] = arr[curIndex];
                    curIndex--;
                    loopCounter++;
                    shiftCounter++;
                }
                else
                {
                    break;
                }
            }
                
            arr[curIndex + 1] = curNumber;
       }
    }
      
      private static int findMin(int[] arr, int startingIndex) {
        int minIndex = startingIndex;
        for(int i= minIndex +1 ; i < arr.length; i++)
        {
            loopCounter++;
            comparisonCounter++;
            if(arr[i] < arr[minIndex])
            {
                minIndex = i;
            }
        }
        return minIndex;
    }

      
      
    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y]= temp;
       
    }
    
   

    private static void selectionSort(int[] arr) {
         
        for(int curIndex = 0; curIndex < arr.length -1; curIndex++)
        {
            loopCounter++;
            int minIndex = findMin(arr, curIndex);
            
            swap(arr, curIndex, minIndex);
            shiftCounter++;
           
        }
    }
    
    
    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSortHelper(arr, 0, arr.length - 1, temp);
    }
    
    private static void mergeSortHelper(int[] arr, int from, int to, int[] temp) {
         // If the array length is greater than 1
        if(to - from >= 1)
        {
            int mid = (from + to) / 2;
            mergeSortHelper(arr, from, mid, temp);
            mergeSortHelper(arr, mid + 1, to, temp);
            merge(arr, from, mid, to, temp);
        }
    }
    
     private static void merge(int[] arr, int from, int mid, int to, int[] temp){
         int i = from;      //track left array position
         int j = mid + 1;   //track right array position
         int k = from;      //track temp position
         
         while(i <= mid && j<= to)
         {
             loopCounter++;
            comparisonCounter++;
             
             //if th element in the left subarray is less
             //than the element in the right subarray 
             //it is next in the merged list
             if(arr[i] < arr[j])
             {
                 temp[k] = arr[i];
                 i++;
              }
             else 
             {
                 temp[k] = arr[j];
                 j++;
                 shiftCounter++;
             }
             k++;
         }
             
        //we may have missed elements from either list
        while(i <= mid)
        {
            loopCounter++;
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= to)
        {
            loopCounter++;
            temp[k] = arr[j];
            j++;
            k++;
        }

        //copy over from temp to elements
        for(k = from; k <= to; k++)
        {
           arr[k] = temp[k];
           loopCounter++;
         }
             
         
     }
        

    
}