package com.bridgelabAssignment1;
/* Author atik
 * Adding two numbers using command line
 */
	public class AddNum {
    public static void main(String [] values){
		int sum = 0, count=0;
		System.out.println("Calculates Sum for below Integers");
		
		for(int i=0;i<values.length;i++){
			System.out.println(values[i]);
			try {
			sum = sum + Integer.parseInt(values[i]);
			} catch (NumberFormatException e) {
			System.out.println("Invalid integer command line arguments: " + e.toString());
			count++;
			
			}
		}
		System.out.println("Sum :" + sum);
		System.out.println("Count of non integers is : "+ count);
}}
