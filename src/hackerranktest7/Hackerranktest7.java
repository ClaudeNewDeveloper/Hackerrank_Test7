/*
Task: 
Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.

Input Format

The first line contains an integer, N (the size of our array). 
The second line contains N space-separated integers describing array A's elements.

Constraints
    1 <= N <= 1000
    1 <=Ai <= N, where i is the ith integer in the array.
 */

package hackerranktest7;

import java.util.Scanner;

/**
 *
 * @author besthon1
 */
public class Hackerranktest7 {

    /**
     * @param args the command line arguments
     */
    
    public static void printInReverseOrder(int[] arrayOfIntegers)
    {
          for (int i = arrayOfIntegers.length - 1; i >= 0; i--)
          { 
              System.out.print(arrayOfIntegers[i]);
              System.out.print(" ");

          }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
         
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please, enter the size of the array: ");
        int n = sc.nextInt();
        
        System.out.print("Please, enter the values separarted by space into the array: ");
        
        int[] arr_temp = new int[n] ;
        for(int i = 0; i < n; i++)
        {   
            arr_temp[i] = sc.nextInt();
        
        }
        sc.close();
         
       System.out.print("Elements in reverse order: ");
       printInReverseOrder(arr_temp);
       
       System.out.println();
    }
    
}
