package com.jsp.servlet.Hibernate_MayToOne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Company {

	@Id
	private int companyId;
	private String companyName;
	
	@OneToMany
	private List<Employees> employee;
	
	public List<Employees> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employees> employee) {
		this.employee = employee;
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
