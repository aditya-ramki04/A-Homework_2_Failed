package edu.mu.Student;

import java.util.Objects;

public class Student {
	//variables
	private int id;
	private String name;
	private double grade;
	
	//constructors
	public Student(int id, String name, double grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public Student() {
		super();
	}

	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id: " + id + ", name: " + name + ", grade: " + grade + "]";
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id;
	}

//	public boolean equals(Object obj, int id) 
//	{
//		Student s1 = ((Student)obj);
//		if(id == s1.getId())
//		{
//			return true;
//		}
//		return false;
//	}
}
