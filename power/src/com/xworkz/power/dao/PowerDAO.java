package com.xworkz.power.dao;

import java.util.Optional;

import com.xworkz.power.dto.PowerDTO;

public interface PowerDAO {
	int TOTAL_SIZE = 25;// by default variable public static final

	boolean save(PowerDTO dto);

	void updateMinimumChargeByDivision(String division, double min);

	void printDetails();
	
	void saveMultiple(PowerDTO[] dto);
	
	Optional<PowerDTO> findByName(String name);

}
