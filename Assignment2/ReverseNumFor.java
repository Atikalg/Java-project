package com.bridgelab.Assignment2;
/* author atik
 * print number in reverse order 
 */
import java.util.Scanner;
public class ReverseNumFor {
	public static void main(String[] args)   
    {  
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
    int reverse = 0;  
    for (;number!= 0; number=number/10)   
    {  
    int remainder = number % 10;  
    reverse = reverse * 10 + remainder;    
    }  
    System.out.println("The reverse of the given number is: " + reverse);  
    }  
}
