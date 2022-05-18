package com.xworkz.powerconsumption.dao;

import java.util.Optional;

import com.xworkz.powerconsumption.dto.PowerConsumptionDTO;
import com.xworkz.powerconsumption.exception.IndexIsFullException;

public class PowerConsumptionDAOImpl implements PowerConsumptionDAO {

	private PowerConsumptionDTO[] power = new PowerConsumptionDTO[TOTAL_SIZE];
	private int index;

	@Override
	public boolean save(PowerConsumptionDTO dto) {
		if (this.index < this.power.length) {
			this.power[index] = dto;
			index++;
			System.out.println("powerconsumption list is saved " + dto);
			return true;
		}
		System.err.println("powerconsumption list is not saved");
		IndexIsFullException full = new IndexIsFullException("index is full please add the index");
		throw full;
	}

	@Override
	public void printDetails() {
		for (int index = 0; index < power.length; index++) {
			PowerConsumptionDTO list = power[index];
			System.out.println(list);
		}
	}

	@Override
	public Optional<PowerConsumptionDTO> findByName(String name) {
		for (int index = 0; index < power.length; index++) {
			PowerConsumptionDTO list1 = power[index];
			if (name.equals(list1.getCustomerName())) {
				System.out.println("dto is found the name " + name);
				return Optional.of(list1);
			}
		}
		return Optional.empty();
	}

	@Override
	public void saveMultiple(PowerConsumptionDTO[] power) {
		for (int index = 0; index < power.length; index++) {
			PowerConsumptionDTO consumption = power[index];
			this.save(consumption);
		}

	}

	@Override
	public void deleteByCustomerName(String name) {
		for (int index = 0; index < power.length; index++) {
			PowerConsumptionDTO consu1 = power[index];
			if (name.equals(consu1.getCustomerName())) {
				consu1.setCustomerName(null);
			}

		}
	}

	@Override
	public void deleteByDivision(String division) {
		for (int index = 0; index < power.length; index++) {
			PowerConsumptionDTO consu2 = power[index];
			if (division.equals(consu2.getDivision())) {
				consu2.setDivision(null);
			}
		}
	}

	@Override
	public Double updateMinChargeByDivision(String division, double min) {
		for (int i = 0; i < power.length; i++) {
			PowerConsumptionDTO power3 = power[i];
			if (division.equals(power3.getDivision())) {
				power3.setMinCharge(min);
				System.out.println("The new Rate is " + power3.getMinCharge());
				return min;
			}

		}
		return null;
	}

	@Override
	public Double updateRatePerUnitByDivision(String division, double newRate) {
		for (int i = 0; i < power.length; i++) {
			PowerConsumptionDTO power4 = power[i];
			if (division.equals(power4.getDivision())) {
				power4.setRatePerUnit(newRate);
				System.out.println("The new Rate is " + power4.getRatePerUnit());
				return newRate;
			}
		}
		return null;
	}

	@Override
	public Optional<PowerConsumptionDTO[]> findByDivision(String division) {
		for (int i = 0; i < power.length; i++) {
			PowerConsumptionDTO power5 = power[i];
			if (division.equals(power5.getDivision())) {
				System.out.println("Dto is found for " + division);
				return Optional.of(power);
			}
		}
		return Optional.empty();

	}

	@Override
	public Optional<PowerConsumptionDTO> findByCustomerNameAndDivision(String name, String division) {
		for (int i = 0; i < power.length; i++) {
			PowerConsumptionDTO power6 = power[i];
			if (name.equals(power6.getCustomerName()) & division.equals(power6.getDivision())) {
				System.out.println("dto is found by name and division" + power6);
				return Optional.of(power6);

			}

		}
		return Optional.empty();
	}

	@Override
	public Optional<Double> findRatePerUnitByDivision(String division) {
		for (int i = 0; i < power.length; i++) {
			PowerConsumptionDTO power7 = power[i];
			if (division.equals(power7.getDivision())) {
				System.out.println("found rate by division = " + power7.getRatePerUnit());
				return Optional.of(power7.getRatePerUnit());
			}
		}
		return Optional.empty();
	}

	@Override
	public Optional<Double> findDueAmountByCustomerName(String name) {
		for (int i = 0; i < power.length; i++) {
			PowerConsumptionDTO power8 = power[i];
			if (name.equals(power8.getCustomerName())) {
				System.out.println("find due amount by customer name = " + power8.getDueAmount());
				return Optional.of(power8.getDueAmount());

			}
		}
		return Optional.empty();
	}

}
