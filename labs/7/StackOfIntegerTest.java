// Steven Loughran
// Lab 7 - Stack of Integers Test
// April 3, 2019

import java.util.Scanner;

public class StackOfIntegerTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int num = input.nextInt();
		
		StackOfIntegers stack = new StackOfIntegers();
		
		for (int i = 2; i <= num; i++)
			while (num % i == 0) {
				stack.push(i);
				num = num / i;
			}
		int size = stack.getSize();
		
		for(int i = 0; i < size; i++)
			System.out.print(stack.pop()+ " ");
	}
}