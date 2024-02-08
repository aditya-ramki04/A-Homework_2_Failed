package edu.mu.StudentManager;
import edu.mu.Student.Student;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentManager {
	//private student field
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
	
	public boolean searchStudentById(int id)
	{
		//runs through the student array with the length
		//uses an if statement to determine if the student's id is 
		//equal to the id in the parameter
		//if it does match, it prints out the information of the student
		//and if it doesn't, prints an error message.
		for(int i=0; i<students.length; i++)
		{
			if(students[i].getId() == id)
			{
				System.out.println
				("Student was found! Student ID: " + students[i].getId() 
				+ ". Stud ent Name: " + students[i].getName()
				+ ". Student Grade: " + students[i].getGrade());
				return true;
			}
			
		}
			System.out.println("The student was not found. Please try again!");
			return false;
	}
	
	public boolean updateStudentGradeById(int id, double grade) {
		
		if(searchStudentById(id)) {
			for(int i=0; i<students.length; i++)
			{
				if(students[i].getId() == id)
				{
					students[i].setGrade(grade);
				}	
			}
		}
		else {
			return false;
		}
		
		return true;
	}
}
