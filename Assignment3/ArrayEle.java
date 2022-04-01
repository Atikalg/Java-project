package com.bridgelab.Assignment3;
import java.util.Scanner;
/* author atik
 * Display elements of array
*/ 
public class ArrayEle {
	public static void main(String[] args) {
	        System.out.println("Enter five elements of array: "); 
	        int [] arr = new int [5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr [i] = sc.nextInt();
		}
		  System.out.println("Elements of given array: "); 
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        } 
	    }  
	}
