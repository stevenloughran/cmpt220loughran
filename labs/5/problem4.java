// Steven Loughran   
// Lab 5 Problem 4
// 6 March 2019

//Write a Java program that takes two arrays of integers and says if the arrays are
//identical. The two arrays are identical if they have the same elements, even if they are
//not in the same order. It should use the following method:
//public static boolean equal(int[] x, int[] y)
//Ask the user to enter two sets of values and print the result. The first value indicates the
//number of elements for each array.

import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first array: ");
		int first = input.nextInt();
		
		// JA: You need to read each element of the arrays
		int [] x  = new int [first];
		
		System.out.print("Enter second array: ");
		int second = input.nextInt();
		int [] y = new int [second];

		if (equal(x, y)) {
		System.out.println("The arrays are identical."); }
		else {
		System.out.println("The arrays are not identical.");
		}
	}

	// JA: The values might not be in the same order
	public static boolean equal(int[] x, int[] y) {
	 	if(x == y){
	        return true;
	       }
		if(null == x || null == y){
	        return false;
	    }

	    if(x.length != y.length){
	        return false;
	    }
	    for(int i = 0; i < x.length ; i++){
	        if (x[i] != y[i]){
	            return false;
	        }
	     }
	    return true;
	}
}
