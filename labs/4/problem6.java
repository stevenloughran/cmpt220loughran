// Steven Loughran 
// Lab 4 Problem 6
// 20 February 2019

// Write a Java program that stores a list of positive numbers into an array. The end of the
//list is represented by the value -1. Write two methods, one to add a number at the end
//of the list and another one to add a number in a specific position in the list. Insert
//numbers 1 through 10 (in that order) into the array using the first method, print the
//values in the array and the insert 10 in position 3 and 100 in position 7 using the second
//method and print the array again.

public class problem6 {

	public static void main(String[] args) {
        int[] array = new int[100];
        	array[0] = -1;
        	int i = 0;
        	
        	insert_end(array, 1);
        	insert_end(array, 2);
        	insert_end(array, 3);
        	insert_end(array, 4);
        	insert_end(array, 5);
        	insert_end(array, 6);
        	insert_end(array, 7);
        	insert_end(array, 8);
        	insert_end(array, 9);
        	insert_end(array, 10);

        System.out.println("Array after inserting 1 to 10: ");

        while(array[i] != -1) {
        	System.out.print("  " + array[i] );
        		i++;	}

        insert_index(array, 10, 3);
        insert_index(array, 100, 7);
        
        System.out.println("");
        System.out.println("Array after inserting 10 at 3 and 100 at 7: ");
        	i = 0;
        	
        while(array[i] != -1) {
        	System.out.print("  " + array[i]);
        		i++;
    }
}
		
	public static void insert_end(int[] array , int value) {
			int i = 0;

			while (array[i] != -1)	{
				i++;	}
			
			if (i == 100) {
				System.out.println(" "); }
			else {
				array[i] = value;
				array[i+1] = -1;   
	}
}

	public static void insert_index(int[] array,int value,int position) {
		int length = 0, i = 0;

		while (array[length] != -1) {
			length++;
		}

		if (length == 100) {
			System.out.println("");	}
		else	{
			array[length + 1] = -1;
			for (i = length; i > position; i--)	{
				array[i] = array[i-1];	}
				array[i] = value;
		}
	}
}
