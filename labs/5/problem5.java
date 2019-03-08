// Steven Loughran  
// Lab 5 Problem 5
// 6 March 2019

//. Write a Java program to transpose a matrix. The transpose of a matrix is a new matrix
//whose rows are the columns of the original matrix.
//The transpose of matrix:
//1 2 3
//4 5 6
//7 8 9
//is
//1 4 7
//2 5 8
//3 6 9
//Your program should get the size of the matrix, e.g. 3 is for a 3x3 matrix, and the values
//for the matrix and should print out the transpose of the matrix. 

import java.util.Scanner;

public class problem5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of matrix: ");
		
		int size = input.nextInt();
		int mat[][]=new int[size][size];
		
		System.out.print("Enter numbers into the matrix: ");
		
		for(int i = 0; i < size; i++){   
			for(int j = 0; j < size; j++){
				mat[i][j] = input.nextInt();  
		}
	}
		System.out.println("Original matrix:");
		for(int i = 0; i < size; i++){   
			for(int j = 0; j < size; j++){
				System.out.print(mat[i][j] + " ");
	}
		System.out.println();
	}
		System.out.println("Transpose of the matrix:");
		for(int i = 0; i < size; i++){   
			for(int j=0;j<size;j++){
				System.out.print(mat[j][i] + " ");
		}
		System.out.println();
			}
		}
	}
	
