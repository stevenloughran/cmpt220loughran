// Steven Loughran  
// Lab 4 Problem 3
// 20 February 2019

//Create a Java class called MyString that has two methods with the following signatures:
//public static String reverse(String s)
//public static boolean isPalindrome(String s)
//The reverse method reverses a string. Use reverse to implement isPalindrome. A string
//is palindrome if the reverse is equal to the original string.
//Write a program that asks the user for a string and print sif the string is a palindrome or not.

import java.util.*;

public class problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word to check if it's a Palindrome: ");
		String word = input.nextLine();
		
		if(isPalindrome(word)) {
		System.out.println("The word is not a Palindrome."); }
		else {
		System.out.println("The word is a Palindrome.");
		}
	}
		
	public static String reverse(String word) {
		String temp = " ";
		for (int i= word.length() - 1 ; i >= 0 ;i--) {
			temp = temp + word.charAt(i); }
		return temp;
	}
		
	public static boolean isPalindrome(String word) {
		int flag = 1;
		String S_reversed = reverse(word);
		for	(int i = 0 ; i < word.length(); i++) {
			if (word.charAt(i) != S_reversed.charAt(i)) {
				flag = 0;
				break; }
		}	
		if (flag == 0) {
		return false;
		} else {
		return true;
				}
		}
}