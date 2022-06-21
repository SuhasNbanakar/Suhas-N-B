package com.xworkz.dog.service;

import java.time.LocalDate;

import com.xworkz.dog.constants.Gender;
import com.xworkz.dog.dao.DogDAO;
import com.xworkz.dog.dto.DogDTO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DogServiceImpl implements DogService {

	private DogDAO dao;

	@Override
	public boolean validateAndSave(DogDTO dto) {

		if (dto != null) {

			Integer id = dto.getId();
			String breed = dto.getBreed();
			String color = dto.getColor();
			Double price = dto.getPrice();
			String name = dto.getName();
			Double height = dto.getHeight();
			Double weight = dto.getWeight();
			Gender gender = dto.getGender();
			LocalDate birth = dto.getBirthDate();

			if (id > 0) {
				System.out.println("id is valid");
			} else {
				System.out.println("id is invalid");
			}
			if (breed != null && !breed.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*") && breed.length() > 3
					&& breed.length() < 30) {
				System.out.println("breed is valid");
			} else {
				System.out.println("breed is invalid");
			}
			if (color != null && !color.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*") && color.length() > 3
					&& color.length() < 30) {
				System.out.println("color is valid");
			} else {
				System.out.println("color is invalid");
			}
			if (price > 0) {
				System.out.println("price is valid ");
			} else {
				System.out.println("price is invalid");
			}
			if (name != null && !name.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*") && name.length() > 3
					&& name.length() < 30) {
				System.out.println("name is valid");
			} else {
				System.out.println("name is invalid");
			}
			if (height > 0 && height < 300) {
				System.out.println("height is valid");
			} else {
				System.out.println("height is invalid");
			}
			if (weight > 0 && weight < 100) {
				System.out.println("weight is valid");
			} else {
				System.out.println("weight is invalid");
			}
			if (gender != null) {
				System.out.println("gender is valid");
			} else {
				System.out.println("gender is invalid");
			}
			if (birth != null && birth.isBefore(LocalDate.now())) {
				System.out.println("birth is valid ");
			} else {
				System.out.println("birth is invalid ");
			}

		}

		return this.dao.save(dto);
	}

}
