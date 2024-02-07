package edu.mu.StudentManager;
import edu.mu.Student.Student;

public class StudentManager {
	private Student[] students;
	
	public void displayStudents() {
		//checking if student length 0 then tell user no student
		//else
		//iterates through the student data and prints student info by calling to 'toString'
		if(students.length == 0) {
			System.out.println("No student found");
		}else {
			for(int i = 0; i < students.length; i++) {
				Student student = students[i];
				System.out.println(student); //called toString method in Student.java file
			}
		}
	}
	
}
