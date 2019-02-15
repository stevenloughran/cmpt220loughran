// Steven Loughran 
// Lab 3 problem 6
// 2 February 2019

// Write a Java program to count the vowels in a string given as input. It 
// should use a method that takes the string and returns the count of the vowels.

import java.util.Scanner;

public class problem6 {

	public static void main(String[] args) {
		// tells user what program is about
		System.out.println("This program will show number of vowels in string");
		
		// gets the string from user 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string:");
		String vowels = input.nextLine();
		
		// displays the results from return
		System.out.print("The number of vowels in your string is: " + count_vowels(vowels)+ "\n" ); }
		
	// counts the vowels from strings from user 
	public static int count_vowels(String vowels) {
		// initializes counter
		int count = 0;
		
		// tests to check all characters is strings 
        for (int i = 0; i < vowels.length(); i++) {
           
        	// checks if each character is either a, e, i, o, or u
        	if (vowels.charAt(i) == 'a' || vowels.charAt(i) == 'e' || vowels.charAt(i) == 'i'
                    || vowels.charAt(i) == 'o' || vowels.charAt(i) == 'u') {
        		// counts the number of vowels 
                count++;
                
            }
        }
        return count;
	}

}
