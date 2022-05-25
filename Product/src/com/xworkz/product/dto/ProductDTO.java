package com.xworkz.product.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO implements Serializable {

	private Integer id;
	private String name; 
	private String company;
	private Integer quantity;
	private Double price;
	private Float quality;
	
}
