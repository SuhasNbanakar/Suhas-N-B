package com.xworkz.toothpaste.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.xworkz.toothpaste.constants.Color;
import com.xworkz.toothpaste.constants.Quantity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ToothpasteDTO implements Serializable {

	private Integer id;
	private String brand;
	private Color color;
	private String mainIngredeient;
	private LocalDate mfgDate;
	private LocalDate expiryDate;
	private Double price;
	private Quantity quantity;

	public ToothpasteDTO() {
		System.out.println("running toothpaste Dto");
	}

}
