// Steven Loughran 
// Lab 4 Problem 7
// 20 February 2019

// Write a Java program to remove duplicate values from an array. Get a list of numbers
//from the user, store them into an array remove the duplicates and print the contents of
//the array.

import java.util.Scanner;

public class problem7 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int i = 0;
        int j = 0;

        System.out.print("Enter size of array: ");
        size = input.nextInt();

        int[] array = new int[size+1];
        array[size] = -1;

        System.out.println("Enter elements: ");

       while (i < size)	{
    	   array[i] = input.nextInt();
    	   i++;		}

        System.out.print("Array before filter:");
        	i = 0;

        while (array[i] != -1)	{
        	System.out.print(" "+array[i]);
        	i++;	 }
        
        i = 0; j = 0;

        while (array[i] != -1)	{
        	j = 0;
        	
        while (array[j] != -1) {
        	if (array[i] == array[j] && i != j)	{
        		int k = j;
        	while (array[k] != -1)
        		array[k] = array[++k];
        		array[k-1]=-1;	}
        		j++;	}
        		i++;	}

        System.out.println("");
        System.out.print("Array after filter: ");
        	i = 0;

        while (array[i] != -1)	{
        	System.out.print(" "+array[i]);
        	i++ ;
        }
	}
}