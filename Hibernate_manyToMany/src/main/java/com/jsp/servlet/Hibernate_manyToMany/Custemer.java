package com.jsp.servlet.Hibernate_manyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Custemer {
	@Id
	private int CustemerId;
	private String CustemerName;

	@ManyToMany
	private List<Product> products;

	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public int getCustemerId() {
		return CustemerId;
	}
	public void setCustemerId(int custemerId) {
		CustemerId = custemerId;
	}
	public String getCustemerName() {
		return CustemerName;
	}
	public void setCustemerName(String custemerName) {
		CustemerName = custemerName;
	}
	
	@Override
	public String toString() {
		return "Consumer [CustemerId=" + CustemerId + ", CustemerName=" + CustemerName + ", products=" + products + "]";
	}


}
