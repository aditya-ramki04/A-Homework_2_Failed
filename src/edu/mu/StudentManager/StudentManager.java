package edu.mu.StudentManager;
import edu.mu.Student.Student;

public class StudentManager {
	//private student field
	private Student[] students;
		
	public boolean searchStudentById(int id)
	{
		//runs through the student array with the length
		//uses an if statement to determine if the student's id is 
		//equal to the id in the parameter
		//if it does match, it prints out the information of the student
		//and if it doesn't, prints an error message.
		//Matthew Robison wrote this function
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

 
}
