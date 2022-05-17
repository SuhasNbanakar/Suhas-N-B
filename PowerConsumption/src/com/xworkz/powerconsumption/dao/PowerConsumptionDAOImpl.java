package com.xworkz.powerconsumption.dao;

import java.util.Optional;

import com.xworkz.powerconsumption.dto.PowerConsumptionDTO;

public class PowerConsumptionDAOImpl implements PowerConsumptionDAO {

	private PowerConsumptionDTO[] power = new PowerConsumptionDTO[5];
	private int index;

	@Override
	public boolean save(PowerConsumptionDTO dto) {
		if (this.index < this.power.length) {
			this.power[index] = dto;
			index++;
			System.out.println("powerconsumption list is saved " + dto);
			return true;
		}
		System.out.println("powerconsumption list is not saved");
		return false;
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
}
