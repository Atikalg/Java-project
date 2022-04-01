package com.bridgelab.Assignment3;
/*author atik
 * Finding largest  element of array
 */
import java.util.Scanner;
	public class LargestElement {
	public static void main(String[] args) {
        System.out.println("Enter five elements of array: "); 
        int [] arr = new int [5];
        int max = arr[0];
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<5;i++) {
		arr [i] = sc.nextInt();
	}
	  for (int i = 0; i < arr.length; i++) {  
          //Compare elements of array with max  
         if(arr[i] > max)  
             max = arr[i];  
      }  
      System.out.println("Largest element in given array: " + max);  
  }  
}
