/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cancer;

import java.io.*;

/**
 *
 * @author Acer User
 */
public class Cancer {

    /**
     * @param args the command line arguments
     */
    public static String grid[][];
    public static int blobSize;
    
    public static void main(String[] args) throws IOException {
        int row = 0;
        
         // create 2D array size 15 x 15
        grid = new String[15][15];
        
        
        FileReader file = new FileReader("cancerData.txt");
        BufferedReader buffer = new BufferedReader(file);
        
        String line;
        while((line = buffer.readLine()) != null)
        {
            for(int i = 0; i <= 14; i++)
            {
                grid[row][i] = String.valueOf(line.charAt(i));
            }
            row = row + 1;
        }
        buffer.close();
        
        //Print out the current grid
        displayGrid();
        
        blobSize = 0;
        
        for(row = 0; row <= 14; row++)
        {
            for (int col = 0; col <= 14; col++)
            {
                if(grid[row][col].equals("-"))
                {
                    floodFill(row, col);
                    blobSize++;
                }
            }
        }
        
        
        System.out.println("The file had " + blobSize + " cancer spots in it .");
        
        System.out.println("The new grid is ");
        //Print out the new grid 
        
        displayGrid();
    }

    private static void displayGrid() {
        String output = "";
        for (int row = 0; row <= 14; row++)
        {
           
            for(int col = 0; col <= 14; col++)
            {
                output += grid[row][col];
            }
            output += "\n";
        }
        System.out.println(output);
    }

    private static void floodFill(int row, int col) {
      if (grid[row][col].equals("-")) {
         grid[row][col] = " ";
        
        floodFill(row - 1, col - 1);
        floodFill(row - 1, col);
        floodFill(row - 1, col + 1);
        floodFill(row, col - 1);
        floodFill(row, col + 1);
        floodFill(row + 1, col - 1);
        floodFill(row + 1, col);
        floodFill(row + 1, col + 1);
    }
        
    }
    
}
