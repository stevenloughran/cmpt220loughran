// Steven Loughran
// Lab 2
// 6 February 2019

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		// Ask for a number for the month
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for a month (1-12): ");
		int number = input.nextInt();
		
		// calculates the number from the user to corresponding month 
		if (number == 1) {
			System.out.println("Number 1 for January");
		} else 
			if (number == 2) {
			System.out.print("Number 2 for February");
		} else 
			if (number == 3) {
			System.out.print("Number 3 for March");
		} else 
			if (number == 4) {
			System.out.print("Number 4 for April");
		} else 
			if (number == 5) {
			System.out.print("Number 5 for May");
		} else 
			if (number == 6) {
			System.out.print("Number 6 for June");
		} else 
			if (number == 7) {
			System.out.print("Number 7 for July");
		} else 
			if (number == 8) {
			System.out.print("Number 8 for August");
		} else 
			if (number == 9) {
			System.out.print("Number 9 for September");
		} else 
			if (number == 10) {
			System.out.print("Number 10 for October");
		} else 
			if (number == 11) {
			System.out.print("Number 11 for November");
		} else 
			if (number == 12) {
			System.out.print("Number 12 for December");
			}
	}

}
