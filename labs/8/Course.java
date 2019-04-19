//Steven Loughran
//Lab 8
//April 19, 2019

import java.util.ArrayList;

public class Course {
	private String courseName;
	private ArrayList<String> students = new ArrayList<>();
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students.add(student);
	}

	public String[] getStudents() {
		String[] result = new String[students.size()];
		students.toArray(result);
		return result;
	}

	public int getNumberOfStudents() {
		return students.size();
	}
}
