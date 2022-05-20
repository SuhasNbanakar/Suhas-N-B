package com.xworkz.customer.service;

import com.xworkz.customer.dto.AddressDTO;
import com.xworkz.customer.dto.CustomerDTO;

public interface CustomerService {

	boolean validateAndSave(CustomerDTO dto);
}
