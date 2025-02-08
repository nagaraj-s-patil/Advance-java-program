package com.jsp.TutHibernetCodeForCompany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employe {
	@Id
	private int EmployeId;
	private String EmployeName;
	
	@ManyToOne
	Company company;

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

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employe [EmployeId=" + EmployeId + ", EmployeName=" + EmployeName + ", company=" + company + "]";
	}
	
	
	
}
