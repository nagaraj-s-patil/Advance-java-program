package com.jsp.hibernete.shopping_cast.entity;

import java.util.List;

public class Cart {

	private int cartId;
	
	
	private List<Product> products;


	public int getCartId() {
		return cartId;
	}


	public void setCartId(int castId) {
		this.cartId = castId;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
