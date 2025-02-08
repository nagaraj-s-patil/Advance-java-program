package com.jsp.Hibernate_HQL;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Acter {

	@Id
	private int acterId;
	private String acterName;
	private int acterAge;
	private String inderstry;
	private String acterNatinality;
	
	
	public int getActerId() {
		return acterId;
	}
	public void setActerId(int acterId) {
		this.acterId = acterId;
	}
	public String getActerName() {
		return acterName;
	}
	public void setActerName(String acterName) {
		this.acterName = acterName;
	}
	
	public int getActerAge() {
		return acterAge;
	}
	public void setActerAge(int acterAge) {
		this.acterAge = acterAge;
	}
	public String getInderstry() {
		return inderstry;
	}
	public void setInderstry(String inderstry) {
		this.inderstry = inderstry;
	}
	public String getActerNatinality() {
		return acterNatinality;
	}
	public void setActerNatinality(String acterNatinality) {
		this.acterNatinality = acterNatinality;
	}
	@Override
	public String toString() {
		return "Acter [acterId=" + acterId + ", acterName=" + acterName + ", acterAge=" + acterAge + ", inderstry="
				+ inderstry + ", acterNatinality=" + acterNatinality + "]";
	}
	
	


	

}
