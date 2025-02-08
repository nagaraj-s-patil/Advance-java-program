package com.jsp.Hibernate_jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

	@Id
	private int carId;
	private String carModel;
	private String brand;
	private String color;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	private int Price;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carModel=" + carModel + ", brand=" + brand + ", color=" + color + ", Price="
				+ Price + "]";
	}

	
	
	
	
	
	
}
