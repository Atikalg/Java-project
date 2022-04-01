package com.bridgelab.Assignment3;
import java.util.Scanner;
/* author atik
 * Finding smallest element of array
 */
public class SmallestElement {

	public static void main(String[] args) {
		System.out.println("Enter five elements of array");
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		for (int i=0; i<arr.length; i++) {
			arr[i]  = sc.nextInt();
		}
		int min = arr[0];
		for (int i =0; i<arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Smallest element of given array " + min);
	}
}
