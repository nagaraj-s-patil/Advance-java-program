package com.jsp.servlet.Hibernate_oneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Company {

	@Id
	int companyId;
	String companyName;
	
	private List<Employees> employees;
	
	public List<Employees> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "company [companyId=" + companyId + ", companyName=" + companyName + "]";
	}
	
	
}
