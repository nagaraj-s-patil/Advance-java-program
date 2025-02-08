package com.jsp.servlet.Hibernate_manyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int productId;
	private String ProductName;
	
	
	private int productPrice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", ProductName=" + ProductName + ", productPrice=" + productPrice
				+ "]";
	}

}
