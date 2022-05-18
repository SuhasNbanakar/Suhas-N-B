package com.xworkz.powerconsumption.service;

import java.time.LocalDate;
import java.util.Optional;

import com.xworkz.powerconsumption.dao.PowerConsumptionDAO;
import com.xworkz.powerconsumption.dto.PowerConsumptionDTO;
import com.xworkz.powerconsumption.exception.InvalidDataException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PowerConsumptionServiceImpl implements PowerConsumptionService {

	private PowerConsumptionDAO powerDAO;

	@Override
	public boolean validateAndSave(PowerConsumptionDTO dto) throws InvalidDataException {
		if (dto != null) {
			Integer id = dto.getId();

			Double unitConsumed = dto.getUnitConsumed();

			Double ratePerUnit = dto.getRatePerUnit();

			LocalDate dueDate = dto.getDueDate();

			Double minCharge = dto.getMinCharge();

			String customerName = dto.getCustomerName();

			String division = dto.getDivision();

			if (id != null & id > 0) {
				System.out.println("valid Id");
			} else {
				System.err.println("Invalid Id");
				throw new InvalidDataException("add the correct valid data");
			}
			if (unitConsumed != null & unitConsumed > 0) {
				System.out.println("Valid unit");
			} else {
				System.err.println("Invalid unit");
				throw new InvalidDataException("add the correct valid data");
			}
			if (minCharge != null & minCharge >= 150) {
				System.out.println("Valid Min Charge");
			} else {
				System.err.println("Invalid Min Charge");
				throw new InvalidDataException("add the correct valid data");
			}
			if (ratePerUnit != null & ratePerUnit >= 4 & ratePerUnit <= 12) {
				System.out.println("Valid Rate Per Unit");
			} else {
				System.err.println("Invalid Rate Per Unit");
				throw new InvalidDataException("add the correct valid data");
			}
			if (customerName != null && customerName.equalsIgnoreCase(customerName)) {
				System.out.println("Valid Name");
			} else {
				System.err.println("Invalid Name");
				throw new InvalidDataException("add the correct valid data");
			}
			if (division != null) {
				System.out.println("Valid Division");
			} else {
				System.err.println("Invalid Division");
				throw new InvalidDataException("add the correct valid data");
			}
			if (dueDate != null) {
				System.out.println("Valid Due Date");
			} else {
				System.err.println("Invalid Due Date");
				throw new InvalidDataException("add the correct valid data");
			}

			double dueAmount = ratePerUnit * unitConsumed;
			dto.setDueAmount(dueAmount);

			boolean saved = powerDAO.save(dto);
		}
		return false;
	}

	@Override
	public void validateAndSaveMultiple(PowerConsumptionDTO[] dto1) throws InvalidDataException {
		for (int i = 0; i < dto1.length; i++) {
			PowerConsumptionDTO power = dto1[i];
			this.validateAndSave(power);
		}
	}

	@Override
	public boolean save(PowerConsumptionDTO dto) {
		this.powerDAO.save(dto);
		return false;
	}

	@Override
	public void printDetails() {
		this.powerDAO.printDetails();

	}

	@Override
	public Optional<PowerConsumptionDTO> findByName(String name) {
		this.powerDAO.findByName(name);
		return Optional.empty();
	}

	@Override
	public void saveMultiple(PowerConsumptionDTO[] dtos) {
		this.powerDAO.saveMultiple(dtos);

	}

	@Override
	public void deleteByCustomerName(String name) {
		this.powerDAO.deleteByCustomerName(name);

	}

	@Override
	public void deleteByDivision(String division) {
		this.powerDAO.deleteByDivision(division);

	}

	@Override
	public Double updateMinChargeByDivision(String division, double min) {
		this.powerDAO.updateMinChargeByDivision(division, min);
		return min;
	}

	@Override
	public Double updateRatePerUnitByDivision(String division, double newRate) {
		this.powerDAO.updateRatePerUnitByDivision(division, newRate);
		return newRate;
	}

	@Override
	public Optional<PowerConsumptionDTO[]> findByDivision(String division) {
		this.powerDAO.findByDivision(division);
		return Optional.empty();
	}

	@Override
	public Optional<PowerConsumptionDTO> findByCustomerNameAndDivision(String name, String division) {
		this.powerDAO.findByCustomerNameAndDivision(name, division);
		return Optional.empty();
	}

	@Override
	public Optional<Double> findRatePerUnitByDivision(String division) {
		this.powerDAO.findRatePerUnitByDivision(division);
		return Optional.empty();
	}

	@Override
	public Optional<Double> findDueAmountByCustomerName(String customerName) {
		this.powerDAO.findDueAmountByCustomerName(customerName);
		return Optional.empty();
	}

}
