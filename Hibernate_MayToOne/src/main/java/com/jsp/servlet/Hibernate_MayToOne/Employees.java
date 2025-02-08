package com.jsp.servlet.Hibernate_MayToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employees {

	@Id
	private int EmployeId;
	private String EmployeName;
	private int Salary;
	
	@ManyToOne()
	private Company company;
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
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
