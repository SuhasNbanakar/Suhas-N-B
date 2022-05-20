package com.xworkz.power.dao;

import com.xworkz.power.dto.PowerDTO;

public class PowerDAOImp implements PowerDAO {

	private PowerDTO[] ranju = new PowerDTO[TOTAL_SIZE];
	private int index;

	@Override
	public boolean save(PowerDTO dto) {
		System.out.println("storing " + dto);
		if (index < this.ranju.length) {
			this.ranju[index] = dto;
			index++;
			System.out.println("details added");
			return true;
		} else {
			System.err.println("details not added");
			return false;
		}

	}

	@Override
	public void updateMinimumChargeByDivision(String division, double min) {
		for (int i = 0; i < ranju.length; i++) {
			PowerDTO ranju1 = ranju[i];
			if (division.equals(ranju1.getDivisionName())) {
				ranju1.setMinCharge(min);
			}
		}

	}

	@Override
	public void printDetails() {
		for(int i=0;i<ranju.length;i++) {
			PowerDTO su=ranju[index];
			System.out.println(su);
		}
		
	}

	@Override
	public void saveMultiple(PowerDTO[] dto) {
		
	}
	
	
}
