// Steven Loughran
// Problem 18.17
// May 7, 2019

import java.util.Scanner;

public class Problem18_17 {
	  
public static int count(char[] chars, char ch){
	int count = 0;
	for(int i = 0; i < chars.length; i++){
		if(chars[i] == ch){
			count++;
		}
	}
			return count;
		}

public static int count(char[] chars, char ch, int high){
	if(high == chars.length){
		return 0;
	}
	else {
		if(chars[high]==ch){
			return 1+ count(chars,ch,high+1);
		}
		else {
			return count(chars,ch,high+1);
		}
	}
}

public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a string: ");
	String str = input.nextLine();
	System.out.print("Enter a character from the string: ");
	char ch = input.next().charAt(0);

	System.out.println(ch +" appears " + count(str.toCharArray(), ch) + " times");

	System.out.println(ch +" appears " + count(str.toCharArray(), ch, 0) + " times");
	}
}

