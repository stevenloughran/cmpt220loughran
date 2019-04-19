//Steven Loughran
//Lab 8
//April 19, 2019

import java.util.*;
	
public class CourseTest {
	
	public static void main(String[] args) {
		Course course1 = new Course("Math");
		Course course2 = new Course("Science");

		System.out.print("Math Course");
		course1.addStudent("Adam");
		course1.addStudent("Ann");
		course1.addStudent("Tom");

		System.out.print("Science Course");
		course2.addStudent("Jim");
		course2.addStudent("Marie");

		System.out.println("Number of students in course 1: " + course1.getNumberOfStudents());
			for (String student : course1.getStudents()) {
				System.out.print(student + ", ");
	}

	System.out.println();
	System.out.println("Number of students in course 2: " + course2.getNumberOfStudents());
		for (String student : course2.getStudents()) {
			System.out.print(student+", ");
		}
	}
}
