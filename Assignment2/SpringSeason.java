package com.bridgelab.Assignment2;
/* author atik
 * Spring season check
 */
public class SpringSeason {

	public static void main(String[] args) {
		int m,d;
		m = Integer.parseInt(args[0]);
		d = Integer.parseInt(args[1]);
		if (m == 3 && d>= 20 && d<= 31) {
			System.out.println("month and date is true");
		}
		else if (m == 4 && d>= 1 && d<= 30) {
			System.out.println("month and date is true");
		}
		else if (m == 5 && d >= 1 && d<= 31) {
			System.out.println("month and date is true");
		}
		else if (m == 6 && d >= 1 && d <= 20) {
			System.out.println("month and date is true");
		}
		else {
			System.out.println("month and date is false");
		}
	}

}
