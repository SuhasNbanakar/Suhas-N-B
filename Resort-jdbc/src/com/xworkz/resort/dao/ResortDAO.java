package com.xworkz.resort.dao;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.resort.dto.ResortDTO;

public interface ResortDAO {
	int total_size=100;

	boolean save(ResortDTO dto);

	void save(ResortDTO[] dtos);

	void updatePriceByName(String name, double price);

	void updatePriceAndRatingByName(String name, int rating, double price);

	void updateReceptionistNameById(String name, int id);

	ResortDTO getById(int id);

	ResortDTO getByName(String name);

	ResortDTO getByNameAndLocation(String name, String location);

	ResortDTO getByNameAndLocationAndOwnerName(String name, String location, String ownerName);

	LocalTime getCheckInTimeByName(String name);

	int getTotalRows();

	ResortDTO getByMaxPrice();

	ResortDTO getByMinPrice();

}
