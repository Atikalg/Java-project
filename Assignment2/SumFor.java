package com.bridgelab.Assignment2;
/* author atik
 * sum of natural number
 */
import java.util.Scanner;

public class SumFor {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
		for (i=1; i<=num; i++) {
			
			sum = sum + i;
		}
		System.out.println("sum of natural numbers is " + sum);
	}

}
