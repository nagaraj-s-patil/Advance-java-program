package com.jsp.TutHibernetCodeForCompany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {

	@Id
	private int companyId;
	private String companyName;
	
	@OneToMany(mappedBy = "company")
	List<Employe>employees;

	
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

	

	public List<Employe> getEmployess() {
		return employees;
	}

	public void setEmployess(List<Employe> employess) {
		this.employees = employess;
	}

	@Override
	public String toString() {
		return "company [companyId=" + companyId + ", companyName=" + companyName + ", employs=" + employees + "]";
	}
	
	
	
}
