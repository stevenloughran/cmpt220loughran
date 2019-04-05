// Steven Loughran
// Lab 7 - Course Test
// April 3, 2019

public class CourseTest {

	public static void main(String[] args) {
		Course course = new Course("English");
        
        	course.addStudent("Mike");
        	course.addStudent("Paul");
        	course.addStudent("Sam");
        
        	course.dropStudent("Andy");
       
        		System.out.println("Students in the course are");
        
        for(int i = 0; i < course.getNumberOfStudents(); ++i) {
            System.out.println(course.getStudents()[i]);
        }
    }

}