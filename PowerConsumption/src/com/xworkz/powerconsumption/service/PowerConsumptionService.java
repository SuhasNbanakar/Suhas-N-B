package com.xworkz.powerconsumption.service;

import java.util.Optional;

import com.xworkz.powerconsumption.dto.PowerConsumptionDTO;
import com.xworkz.powerconsumption.exception.InvalidDataException;

public interface PowerConsumptionService {

	boolean validateAndSave(PowerConsumptionDTO dto) throws InvalidDataException;

	void validateAndSaveMultiple(PowerConsumptionDTO[] dto1) throws InvalidDataException;

	boolean save(PowerConsumptionDTO dto);

	void printDetails();

	Optional<PowerConsumptionDTO> findByName(String name);

	void saveMultiple(PowerConsumptionDTO[] dtos);

	void deleteByCustomerName(String name);// one element

	void deleteByDivision(String division);// many delete

	Double updateMinChargeByDivision(String division, double min);

	Double updateRatePerUnitByDivision(String division, double newRate);

	Optional<PowerConsumptionDTO[]> findByDivision(String division);

	Optional<PowerConsumptionDTO> findByCustomerNameAndDivision(String name, String division);

	Optional<Double> findRatePerUnitByDivision(String division);

	Optional<Double> findDueAmountByCustomerName(String customerName);

}
