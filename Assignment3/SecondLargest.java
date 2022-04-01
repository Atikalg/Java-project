package com.bridgelab.Assignment3;
/*author atik
 * Find 2nd Largest Number in an Array
 */
import java.util.Scanner;
public class SecondLargest {
	public static void main(String[] args) {
		System.out.println("Enter elements of array");
		int [] arr = new int [5];
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		  for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
		  System.out.println(arr[3]);
}
}