package com.bridgelabAssignment1;
/* author atik
 * check two strings are equal or not
 */
import java.util.Scanner;
public class StringCheck {
	public static void main(String[] args) {
			String str1, str2;
        Scanner scan = new Scanner(System.in);
         System.out.println("Enter first String");
        str1 = scan.nextLine();
         System.out.println("Enter second String");
        str2 = scan.nextLine();
         if (str1.equals(str2)) 
            System.out.print("Equal strings");
      
            else
            System.out.print("Not equal strings");

	}

}
