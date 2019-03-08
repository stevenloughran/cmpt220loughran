// Steven Loughran    
// Lab 5 Problem 6
// 6 March 2019

//Write a Java program that computes the average of the values of a column in a two dimensional array.
//You should create a method with the following header:
//public static double averageRow(double[][] array, int column)
//Write a test program that reads a matrix from the user and a column index to calculate
//the average on. Print the result.

import java.util.Scanner;

public class problem6 {
	  
	   public static void main(String[] args) {
	       Scanner input = new Scanner(System.in);
	       System.out.print("Enter rows for 2D array dimensions: ");
	       int row = input.nextInt();
	       
	       System.out.print("Enter columns for 2D array dimensions: ");
	       int col = input.nextInt();
	      
	       double [][]arr = new double[row][col];
	       int i;
	       int j;
	       
	       for(i = 0; i < row; i++){
	    	   for(j = 0; j < col; j++) {
	    		   System.out.println("Enter elements with a space between each number: ");
	    		   arr[i][j] = input.nextInt();
	    		   }
	       }
	       for(i = 0; i < row; i++){
	    	   for(j = 0; j < col; j++){
	    		   System.out.print(" "+arr[i][j]);
	       }
	       System.out.println();
	       }
	       
	       int numOfColumn;
	       
	       System.out.println("Enter the column number: ");
	       numOfColumn = input.nextInt();
	       
	       double avg = averageRow(arr,numOfColumn);
	       System.out.println("Average of the matrix is: " + avg);
	   }
	

	public static double averageRow(double[][]array,int column) {
		int i;
		double sum = 0;
		
		for(i = 0; i < array[0].length; i++) {
			sum += array[i][0];
		}
		return (double)sum / array[0].length;
		}
}