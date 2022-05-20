package com.xworkz.customer;

import java.time.LocalDate;

import com.xworkz.customer.constants.Gender;
import com.xworkz.customer.dao.CustomerDAO;
import com.xworkz.customer.dao.CustomerDAOImpl;
import com.xworkz.customer.dto.AddressDTO;
import com.xworkz.customer.dto.CustomerDTO;
import com.xworkz.customer.service.CustomerService;
import com.xworkz.customer.service.CustomerServiceImpl;

import lombok.NonNull;

public class CustomerServiceRunner {

	public static void main(String[] args) {
		
		AddressDTO address=new AddressDTO(1, "1stcross", "bengalur", "karanatak", 101, "krishanpg");
		CustomerDTO cusDTO =new CustomerDTO(1, "suhas", "suhas@gmail.com", LocalDate.of(2022, 02, 23), Gender.MALE, "Developer", address);


		CustomerDAO cusDAO = new CustomerDAOImpl();

		CustomerService serv = new CustomerServiceImpl(cusDAO);

 	    
		serv.validateAndSave(cusDTO);
				
	}

}
