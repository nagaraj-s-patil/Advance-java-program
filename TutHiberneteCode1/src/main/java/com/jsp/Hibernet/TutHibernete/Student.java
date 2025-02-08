package com.jsp.Hibernet.TutHibernete;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int StudentId;
	private String StudentName;
	private String city;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studentId, String studentName, String city) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		this.city = city;
	}

	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", city=" + city + "]";
	}
	
	
	
}
