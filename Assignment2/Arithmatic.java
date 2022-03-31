package com.bridgelab.Assignment2;

import java.util.Scanner;

/*author atik
 * Arithmatic opertions
 */
public class Arithmatic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		System.out.println("Enter the value of c");
		int c = sc.nextInt();
		int num1 = a+b*c;
		int num2 = c+a/b;
		int num3 = a%b+c;
		int num4 = a*b+c;
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 );
		if (num1 > num2 && num1 > num3 && num1 > num4)
			System.out.println(num1 + " is greatest number");
		else if (num2 > num1 && num2 > num3 && num2 > num4)
			System.out.println(num2 + " is greatest number");
		else if (num3 > num1 && num3 > num2 && num3 > num4)
			System.out.println(num3 + " is greatest number");
		else if (num4 > num1 && num4 > num2 && num4 > num3)
			System.out.println(num4 + " is greatest number");
	}

}
