package com.bridgelab.Assignment2;
/* author atik
 * prints the Euclidean distance
 */
public class Distance {
	public static void main(String[] args) {
		int x2 = Integer.parseInt(args[0]);
		int y2 = Integer.parseInt(args[1]);
		int x1 = 0;
		int y1 = 0;
		double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("Euclidean distance is " + distance);
	}
}
