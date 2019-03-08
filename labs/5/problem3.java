// Steven Loughran  
// Lab 5 Problem 3
// 6 March 2019

// Write a Java program that takes the number of students from the user, for each student
//it will take the name and the score. Print a sorted list of the students and the scores in
//ascending order by score.

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students followed");
		System.out.print("by their names and grades:");
		int numStudents = input.nextInt();
		
		int[] grades = new int[numStudents];
		String[] names = new String[numStudents];
		
		for (int i = 0; i < numStudents; i++) {
			String name = input.next();
			int grade = input.nextInt();
			
			names[i] = name;
			grades[i] = grade;
		}
		for (int i = grades.length - 1; i > 0; i--) {
			int currentMax = grades[0];
			int currentMaxIndex = 0;
		for (int j = 1; j <= i; j++) {
			if (currentMax < grades[j]) {
				currentMax = grades[j];
				currentMaxIndex = j;
		}
	}
		grades[currentMaxIndex] = grades[i];
		grades[i] = currentMax;
		String tempName = names[currentMaxIndex];
		names[currentMaxIndex] = names[i];
		names[i] = tempName;
	}
		for(int i = 0; i < grades.length; i++)
			System.out.println(names[i] + " " + grades[i]);
		}
}
