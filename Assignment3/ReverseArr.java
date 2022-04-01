package com.bridgelab.Assignment3;
/*author atik
 * Print Elements of array in reverse order
 */
public class ReverseArr {
	public static void main(String[] args) {
		 int [] arr = new int [] {1, 2, 3, 4, 5}; 
		System.out.println("Elements of array");
		for (int j=0; j<arr.length; j++ ) {
			System.out.println(arr[j] + " ");
		}
		System.out.println("Elements in reverse order");
		for (int j=arr.length-1; j>=0; j-- ) {
			System.out.println(arr[j] + " ");
		}}
	}
