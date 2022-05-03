package com.xworkz.cake.dto;

import java.io.Serializable;

public class CakeDTO implements Serializable {

	private Integer id;
	private Flavour flavour;
	private Double price;
	private Shape shape;
	private Type type;
	private Integer quantity;

	public CakeDTO() {
		System.out.println("Running cake shop ");
	}

	@Override
	public String toString() {
		return "CakeDTO [id=" + id + ", flavour=" + flavour + ", price=" + price + ", shape=" + shape + ", type=" + type
				+ ", quantity=" + quantity + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Flavour getFlavour() {
		return flavour;
	}

	public void setFlavour(Flavour flavour) {
		this.flavour = flavour;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
