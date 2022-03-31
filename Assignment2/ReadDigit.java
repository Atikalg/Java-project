package com.bridgelab.Assignment2;

import java.util.Scanner;

/* author atik
 * Read single digit and print in words
 */
	public class ReadDigit {
	public static void main(String[] args) {
		
		System.out.println("Enter single digit " );
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num == 0) {
			
			System.out.println("Number is zero");
		}
		else if (num ==1) {
			System.out.println("Number is one");
		}
		else if (num == 2) {
			System.out.println("number is two");
		}
		else if (num == 3) {
			System.out.println("number is three");
		}
		else if (num == 4) {
			System.out.println("number is four");
		}
		else if (num == 5) {
			System.out.println("number is five");
		}
		else if (num == 6) {
			System.out.println("number is six");
		}
		else if (num == 7) {
			System.out.println("number is seven");
		}
		else if (num == 8) {
			System.out.println("number is eight");
		}
		else if (num == 9) {
			System.out.println(("number is nine"));
		}
		else {
			System.out.println("Wrong number entered");
		}
	}

}
