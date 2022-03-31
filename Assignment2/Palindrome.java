package com.bridgelab.Assignment2;
/* author atik
 * Palindrome number
 */
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args)   
    {  
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	int temp = number;
    int reverse = 0;  
    for (;number!= 0; number=number/10)   
    {  
    int remainder = number % 10;  
    reverse = reverse * 10 + remainder;    
    }  
    System.out.println(reverse);
    if(temp == reverse) {
    System.out.println("Number is palindrome");  
    } 
    else {
    	System.out.println("Number is not palindrome");
}}}
