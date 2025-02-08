package com.jsp.servlet.HibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int studentId;
	 private String  studentName;
	 private String studdebtEmail;
	 private int StudentAge;
	 private int studentMarks;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStuddebtEmail() {
		return studdebtEmail;
	}
	public void setStuddebtEmail(String studdebtMail) {
		this.studdebtEmail = studdebtMail;
	}
	public int getStudentAge() {
		return StudentAge;
	}
	public void setStudentAge(int studentAge) {
		StudentAge = studentAge;
	}
	public int getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studdebtEmail=" + studdebtEmail
				+ ", StudentAge=" + StudentAge + ", studentMarks=" + studentMarks + "]";
	}
	 
	
	 
	 
	
}
