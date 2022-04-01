package com.bridgelab.Assignment3;

import java.util.Scanner;
/*author atik
 *Print the elements of an array present on odd position
 */
public class OddPosition {
	public static void main(String[] args) {
	System.out.println("Enter elements of array");
	Scanner sc = new Scanner(System.in);
	int [] arr = new int [5];
	for(int i=0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	for(int i=0; i<arr.length; i=i+2) {
		System.out.println(arr[i]);
	}
	}
}
