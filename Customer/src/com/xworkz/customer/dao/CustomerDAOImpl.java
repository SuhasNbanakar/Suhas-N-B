package com.xworkz.customer.dao;

import com.xworkz.customer.dto.CustomerDTO;

public class CustomerDAOImpl implements CustomerDAO {

	private CustomerDTO[] cust = new CustomerDTO[TOTAL_SIZE];
	int index;

	@Override
	public boolean save(CustomerDTO dto) {
		if (this.index < this.cust.length) {
			this.cust[index] = dto;
			this.index++;
			System.out.println("dto save = " + dto);
			return true;
		} else {
			System.out.println("dto is not save");
			return false;
		}
	}

}
