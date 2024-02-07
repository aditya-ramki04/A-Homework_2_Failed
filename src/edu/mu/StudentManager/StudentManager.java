package edu.mu.StudentManager;
import edu.mu.Student.Student;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;

public class StudentManager {
	private Student[] students; //create student array
	
	public StudentManager() {
        this.students = new Student[5];
	}

	public void displayStudents() {
		//checking if student length 0 then tell user no student
		//else
		//iterates through the student data and prints student info by calling to 'toString'
		if(students.length == 0) {
			System.out.println("No student found");
		}else {
			for(int i = 0; i < students.length; i++) {
				Student student = students[i];
//				System.out.println(student); //called toString method in Student.java file
				if(students != null) {
					System.out.println(student);
				}
			}
		}
	}
	
	public boolean readFromFile(String fileName) {
		try {
			Scanner fileIn = new Scanner(new FileInputStream(fileName));
			
			while(fileIn.hasNextLine())
			{
				for(int i = 0; i < students.length; i++)
				{
					students[i].setId(fileIn.nextInt());
					students[i].setName(fileIn.next());
					students[i].setGrade(fileIn.nextDouble());
				}
			}
			return true;
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}
	
	}
	
}
