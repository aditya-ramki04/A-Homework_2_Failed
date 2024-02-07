package edu.mu.StudentManager;
import edu.mu.Student.Student;

public class StudentManager {
	//private student field
	private Student[] students;
	
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
				System.out.println(student); //called toString method in Student.java file
			}
		}
	}
	
	public boolean searchStudentById(int id)
	{
		//runs through the student array with the length
		//determines if the s
		for(int i=0; i<students.length; i++)
		{
			//if(students[i].getId() == id)
			if(equals(students))
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



	public static void main(String[] args) {
		//Instance of StudentManager construct
		StudentManager Manager = new StudentManager();
		//Student data
		Manager.students[0] = new Student(101, "John Doe", 85.5);
		Manager.students[1] = new Student(102, "Jane Smith", 92.0);
		Manager.students[2] = new Student(103, "Bob Johnson", 78.5);
		Manager.students[3] = new Student(104, "Alice Brown", 88.0);
		Manager.students[4] = new Student(105, "Mike Davis", 95.5);
		
		//allows us to display student details & initializes the students array
		Manager.displayStudents();
		
		
	}
}
