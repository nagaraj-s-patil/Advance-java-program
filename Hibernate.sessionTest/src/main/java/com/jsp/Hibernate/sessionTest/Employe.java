package com.jsp.Hibernate.sessionTest;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employe {

	@Id
	private int employeId;
	private String employeName;
	private long employePhNo;
	
	
	
	public int getEmployeId() {
		return employeId;
	}
	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}
	public String getEmployeName() {
		return employeName;
	}
	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}
	public long getEmployePhNo() {
		return employePhNo;
	}
	public void setEmployePhNo(long employePhNo) {
		this.employePhNo = employePhNo;
	}
	
	
}
