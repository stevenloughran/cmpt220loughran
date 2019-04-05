// Steven Loughran
// Lab 7 - Course
// April 3, 2019

class Course {
    String courseName;
    String[] students = new String[100];
    int numberOfStudents;

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] copy = new String [2 * students.length];
            for(int i = 0; i < students.length; ++i) {
                copy[i] = students[i];
            }
            students = copy;
        }
        students[numberOfStudents++] = student;
    }

    void clear() {
        numberOfStudents = 0;
    }

    String getCourseName() {
        return courseName;
    }

    String[] getStudents() {
        return students;
    }

    int getNumberOfStudents() {
        return numberOfStudents;
    }

    void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int j = i + 1; j < numberOfStudents; j++)
                    students[j - 1] = students[j];
                numberOfStudents--;
                return;
            }
        }
    }
}