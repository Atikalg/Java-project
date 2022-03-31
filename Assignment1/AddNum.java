package com.bridgelabAssignment1;
/* Author atik
 * Adding two numbers using command line
 */
    public class AddNum {
	public static void main(String args[]) {
		int a,b,c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = a+b;
		System.out.println(c);
	}
}
