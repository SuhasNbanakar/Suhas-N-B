package com.xwork.watertank.dto;

import java.io.Serializable;

public class WaterTankDTO implements Serializable {
	
	private String brand;
	private String color;
	private Integer capacity;
	private Double price;
	private Integer warrantyPeriod;
	
	
	public WaterTankDTO()
	{
	System.out.println("calling defult constructor from water tank DTO");
	}

		@Override
		public String toString() {
			return this.brand;
}
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Integer getCapacity() {
		return capacity;
	}


	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Integer getWarrantyPeriod() {
		return warrantyPeriod;
	}


	public void setWarrantyPeriod(Integer warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}
		
	

}
