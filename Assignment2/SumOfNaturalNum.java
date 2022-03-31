package com.bridgelab.Assignment2;
/*author atik
 * print sum of n natural number
 */
import java.util.Scanner;
public class SumOfNaturalNum {
	public static void main (String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i<=num) {
			sum = sum + i;
			i++;
		}
		System.out.println("sum of natural numbers is " + sum);
	}
}
