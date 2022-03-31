package com.bridgelab.Assignment2;
/* author atik
 * Read number and display units in words
 */
import java.util.Scanner;
public class ReadUnit {
	public static void main(String[] args) {	
		System.out.println("Enter a number in unit " );
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num ==1) {
	System.out.println("Number is one");
	}
		else if (num == 10) {
			System.out.println("Number is ten");
	}
	else if (num == 100) {
			System.out.println("Number is hundred");
	}
	else if (num == 1000) {
	System.out.println("Number is thousand");
	}
	else if (num == 10000) {
		System.out.println("Number is ten thousand");
	}
	else if (num == 100000) {
		System.out.println("Number is one lakh");
	}
	else if (num == 10000000) {
		System.out.println("Number is ten lakh");
	}
	else {
		System.out.println("Wrong number entered");
	}
}
}
