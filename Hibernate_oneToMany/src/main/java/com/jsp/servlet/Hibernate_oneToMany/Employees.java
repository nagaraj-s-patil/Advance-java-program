package com.jsp.servlet.Hibernate_oneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.cfg.Configuration;

@Entity
public class Employees {

	@Id
	private int EmployeId;
	private String EmployeName;
	private int Salary;
	
	
	public int getEmployeId() {
		return EmployeId;
	}
	public void setEmployeId(int employeId) {
		EmployeId = employeId;
	}
	public String getEmployeName() {
		return EmployeName;
	}
	public void setEmployeName(String employeName) {
		EmployeName = employeName;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [EmployeId=" + EmployeId + ", EmployeName=" + EmployeName + ", Salary=" + Salary + "]";
	}


	
}
