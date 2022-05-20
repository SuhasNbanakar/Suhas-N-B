package com.xworkz.powerconsumption.service;

import java.time.LocalDate;
import java.util.Optional;

import com.xworkz.powerconsumption.dao.PowerConsumptionDAO;
import com.xworkz.powerconsumption.dto.PowerConsumptionDTO;
import com.xworkz.powerconsumption.exception.CustomerAlreadyExistsException;
import com.xworkz.powerconsumption.exception.InvalidDataException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PowerConsumptionServiceImpl implements PowerConsumptionService {

	private PowerConsumptionDAO powerDAO;

	@Override
	public boolean validateAndSave(PowerConsumptionDTO dto)
			throws InvalidDataException, CustomerAlreadyExistsException {
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
			for (int j = 0; j < customerName.length(); j++) {
				if (customerName != null && customerName.length() > 4 && customerName.length() < 25
						&& !Character.isDigit(customerName.charAt(j))) {
					System.out.println("Valid Name");
				} else {
					System.err.println("Invalid Name");
					throw new InvalidDataException("add the correct valid data");
				}
			}
			for (int i = 0; i < division.length(); i++) {
				if (division != null && division.length() > 4 && division.length() < 25
						&& !Character.isDigit(division.charAt(i))) {
					System.out.println("Valid Division");
				} else {
					System.err.println("Invalid Division");
					throw new InvalidDataException("add the correct valid data");
				}
			}
			if (dueDate != null) {
				System.out.println("Valid Due Date");
			} else {
				System.err.println("Invalid Due Date");
				throw new InvalidDataException("add the correct valid data");
			}
			Optional<PowerConsumptionDTO> temp = this.powerDAO.findByName(customerName);
			if (temp.isPresent()) {
				throw new CustomerAlreadyExistsException(customerName + "alredy found");
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
		if (dto != null) {
			System.out.println(" dto save");
		} else {
			System.out.println("dto not save");
		}
		return this.powerDAO.save(dto);

	}

	@Override
	public void printDetails() {
		this.powerDAO.printDetails();

	}

	@Override
	public Optional<PowerConsumptionDTO> findByName(String name) {
		for (int j1 = 0; j1 < name.length(); j1++) {
			if (name != null && name.length() > 4 && name.length() < 25 && !Character.isDigit(name.charAt(j1)))
				return this.powerDAO.findByName(name);
		}

		System.out.println("service not findbyname");
		return Optional.empty();
	}

	@Override
	public void saveMultiple(PowerConsumptionDTO[] dtos) {
		this.powerDAO.saveMultiple(dtos);

	}

	@Override
	public void deleteByCustomerName(String name) {
		for (int j2 = 0; j2 < name.length(); j2++) {
			if (name != null && name.length() > 4 && name.length() < 25 && !Character.isDigit(name.charAt(j2)))
				this.powerDAO.deleteByCustomerName(name);
		}
	}

	@Override
	public void deleteByDivision(String division) {
		for (int i1 = 0; i1 < division.length(); i1++) {
			if (division != null && division.length() > 4 && division.length() < 25
					&& !Character.isDigit(division.charAt(i1)))
				this.powerDAO.deleteByDivision(division);
		}
	}

	@Override
	public void updateMinChargeByDivision(String division, Double min) {
		for (int i2 = 0; i2 < division.length(); i2++) {
			if (division != null && division.length() > 4 && division.length() < 25
					&& !Character.isDigit(division.charAt(i2)) && min != null && min >= 150)
				System.out.println("service valid min charge");
			this.powerDAO.updateMinChargeByDivision(division, min);

		}

	}

	@Override
	public void updateRatePerUnitByDivision(String division, Double newRate) {
		for (int i3 = 0; i3 < division.length(); i3++) {
			if (division != null && division.length() > 4 && division.length() < 25
					&& !Character.isDigit(division.charAt(i3)) && newRate != null & newRate >= 4 & newRate <= 12)
				this.powerDAO.updateRatePerUnitByDivision(division, newRate);
		}
	}

	@Override
	public Optional<PowerConsumptionDTO[]> findByDivision(String division) {
		for (int i4 = 0; i4 < division.length(); i4++) {
			if (division != null && division.length() > 4 && division.length() < 25
					&& !Character.isDigit(division.charAt(i4))) {
				System.out.println("division is valid");
			}
		}
		return this.powerDAO.findByDivision(division);
	}

	@Override
	public Optional<PowerConsumptionDTO> findByCustomerNameAndDivision(String name, String division) {
		for (int i6 = 0; i6 < division.length(); i6++) {
			for (int j3 = 0; j3 < name.length(); j3++) {
				if (division != null && division.length() > 4 && division.length() < 25
						&& !Character.isDigit(division.charAt(i6)) && name != null && name.length() > 4
						&& name.length() < 25 && !Character.isDigit(name.charAt(j3))) {
					System.out.println("customername and division is valid ");
				}
			}

		}

		return this.powerDAO.findByCustomerNameAndDivision(name, division);

	}

	@Override
	public Optional<Double> findRatePerUnitByDivision(String division) {
		for (int i5 = 0; i5 < division.length(); i5++) {
			if (division != null && division.length() > 4 && division.length() < 25
					&& !Character.isDigit(division.charAt(i5))) {
				System.out.println("rateperunit and division is valid");
			}
		}
		return this.powerDAO.findRatePerUnitByDivision(division);

	}

	@Override
	public Optional<Double> findDueAmountByCustomerName(String customerName) {
		for (int j4 = 0; j4 < customerName.length(); j4++) {
			if (customerName != null && customerName.length() > 4 && customerName.length() < 25
					&& !Character.isDigit(customerName.charAt(j4))) {
				System.out.println("due amount and customername is valid");
			}
		}
		return this.powerDAO.findDueAmountByCustomerName(customerName);
	}
}
