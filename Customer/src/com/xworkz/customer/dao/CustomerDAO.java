package com.xworkz.customer.dao;

import com.xworkz.customer.dto.CustomerDTO;

public interface CustomerDAO {
	int TOTAL_SIZE=10;
	
	boolean save(CustomerDTO dto);
}
