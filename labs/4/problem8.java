// Steven Loughran   
// Lab 4 Problem 8
// 20 February 2019

// Write a program that will read a sequence of positive real numbers entered by the user
//and will print the same numbers in sorted order from smallest to largest. The user will
//input a zero to mark the end of the input. Assume that at most 100 positive numbers
//will be entered.

import java.util.Scanner;
import java.util.Arrays;

public class problem8 {

	public static void main(String[] args) {
		int n = 0;
		int input;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter sequence of positive real numbers and use 0 to mark end: ");
		input = scan.nextInt();
		
		int nums[] = new int[100]; 

		while(input != 0 && n < 100)	{
			nums[n] = input; 
			n++; 
			input = scan.nextInt();
}

		for (int i = 1; i < n; ++i)	{
			int cur = nums[i]; //current values
			int j = i-1;

		while (j >= 0 && nums[j] > cur)	{
			nums[j + 1] = nums[j];
			j = j - 1;
}

		nums[j + 1] = cur; 
}

		System.out.print("The sorted values are: ");

		for(int i = 0; i < n; i++)
			System.out.print(nums[i] + " ");
			System.out.println();

		scan.close();
	}
}

		