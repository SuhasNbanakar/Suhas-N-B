package com.xworkz.dog.dto;

import java.time.LocalDate;

import com.xworkz.dog.constants.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DogDTO {

	private int id;
	private String breed;
	private String color;
	private double price;
	private String name;
	private double height;
	private double weight;
	private Gender gender;
	private LocalDate birthDate;
}
