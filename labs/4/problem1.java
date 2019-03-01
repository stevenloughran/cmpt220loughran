// Steven Loughran 
// Lab 4 Problem 1
// 20 February 2019

// Write a Java program that show a table of with the conversion from inches to
//centimeters and from centimeters to inches. In50 rows increment the inches by 1 and
//the centimeters by 5.

import java.text.DecimalFormat;

public class problem1 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("00.00");
			System.out.print("\n  in   cm   |   cm   in");
			System.out.print("\n---------------------------");
			for (int i = 1,j = 1; i <= 50;) {
				System.out.printf("\n%3d ",i);
				System.out.print(df.format(i * 2.54));
				System.out.printf("   |  %3d ",j);
				System.out.print(df.format(j * 0.393701));
					i= i + 1; 
					j= j + 5; 
		}
	}
}
