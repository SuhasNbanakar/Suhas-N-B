package com.xworkz.dog;

import java.time.LocalDate;

import com.xworkz.dog.constants.Gender;
import com.xworkz.dog.dao.DogDAO;
import com.xworkz.dog.dao.DogDAOImpl;
import com.xworkz.dog.dto.DogDTO;
import com.xworkz.dog.service.DogService;
import com.xworkz.dog.service.DogServiceImpl;

public class DogRunner {

	public static void main(String[] args) {

		DogDTO dto = new DogDTO(1, "Bull dog", "Brown", 15D, "Rum", 5.5D, 60D, Gender.MALE, LocalDate.of(2021, 3, 21));

		DogDAO dao = new DogDAOImpl();

		DogService serv = new DogServiceImpl(dao);

		serv.validateAndSave(dto);
	}

}
