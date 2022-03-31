package com.bridgelabAssignment1;

	public class Static {
	static int a = 10;
	static void display() {
		System.out.println("static method");
	}
	static {
	System.out.println("Static block");
	}
	public static void main(String args[]) {
	System.out.println("Main method");
	System.out.println(a);
	display();
}
}
