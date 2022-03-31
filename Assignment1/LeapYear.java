package com.bridgelabAssignment1;
/* author atik
 * Dipslay year is leap or not
 */
import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year greater or equal to 1582 in four digit");
		int year = sc.nextInt();	
		int length = String.valueOf(year).length();
		if (year >= 1582 && length == 4) {
			if (year % 400 == 0 || year % 4 ==0 && year % 100 != 0) {
				System.out.println(year + " is leap year");
			}
		else
			System.out.println(year + " is not leap year");
}
		else {
			System.out.println("Wrong year entered");
		}
		}
}
