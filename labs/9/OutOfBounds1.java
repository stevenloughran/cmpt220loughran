// Steven Loughran
// Exception Out of Bounds
// April 24, 2019

import java.util.Random;
import java.util.Scanner;

public class OutOfBounds1 {

	public static void main(String[] args) {
		final int Size = 100;
		
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[Size];
		
		for(int i = 0; i < Size; i++) {
			array[i] = 1 + rand.nextInt(100);
		}
		
		System.out.print("Enter the index of the array: ");
		int index = input.nextInt();
		
		try {
			int value = array[index];
			System.out.println("The corresponding value at index " + index + " is " + value);
		}
		
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");
		}
	}
}
