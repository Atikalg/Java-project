package com.bridgelab.Assignment3;
/*author atik
 * print the elements of an array present on an even position
 */
import java.util.Scanner;
	public class EvenPosition_arr {
	public static void main(String[] args) {
		System.out.println("Enter five elements of array");
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[7];
		for (int i=0; i<arr.length; i++) {
			arr[i]  = sc.nextInt();
		}
		for(int i=1; i<arr.length; i=i+2) {
			System.out.println(arr[i]);
		}
}}
