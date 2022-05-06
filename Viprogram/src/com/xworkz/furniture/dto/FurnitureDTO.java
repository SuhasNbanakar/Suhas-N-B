package com.xworkz.furniture.dto;

import java.io.Serializable;

import com.xworkz.furniture.constants.Material;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FurnitureDTO implements Serializable {

	private Integer id;
	private String name;
	private Double price;
	private String brand;
	private Float weight;
	private Material material;

	public FurnitureDTO() {
		System.out.println("running furniture");
	}

}
