package com.xworkz.customer.service;

import java.time.LocalDate;

import com.xworkz.customer.constants.Gender;
import com.xworkz.customer.dao.CustomerDAO;
import com.xworkz.customer.dto.AddressDTO;
import com.xworkz.customer.dto.CustomerDTO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

	private CustomerDAO stom;

	@Override
	public boolean validateAndSave(CustomerDTO dto) {
		if (dto != null) {
			Integer id = dto.getId();
			String name = dto.getName();
			String email = dto.getEmail();
			LocalDate dob = dto.getDob();
			Gender gender = dto.getGender();
			String occupation = dto.getOccupation();

			if (!(id != null && id > 0)) {
				System.out.println("id is valid");
				return false;
			}

			if (!(name != null && name.length() > 3 && name.length() < 20
					&& !name.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*"))) {
				System.out.println("name is valid ");
				return false;
			}

			if (!(email != null && email.length() > 3 && name.length() < 30 && email.endsWith(".com")
					&& email.matches(".*[@].*"))) {
				System.out.println("email is valid");

			}

			if (dob != null && dob.isBefore(LocalDate.now())) {
				System.out.println("dob is valid ");
			} else {
				System.err.println("dob is invalid");
			}
			if (gender != null) {
				System.out.println("gender is valid");
			} else {
				System.err.println("gender is invalid");
			}

			if (!(occupation != null && occupation.length() > 3 && occupation.length() < 30
					&& !occupation.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*"))) {
				System.err.println("occupation is invalid");
				return false;
			}

			AddressDTO addressDTO = dto.getAddressDTO();
			Integer id1 = addressDTO.getId1();
			String street = addressDTO.getStreet();
			String city = addressDTO.getCity();
			String state = addressDTO.getState();
			Integer no = addressDTO.getNo();
			String landmark = addressDTO.getLandmark();

			if (addressDTO != null) {
				System.out.println("addressdto is valid");
			} else {
				System.err.println("addressdto is invalid");
			}
			if (id1 != null && id1 > 0) {
				System.out.println("id1 is valid");
			} else {
				System.err.println("id1 is invalid");
			}

			if (street != null && street.length() > 3 && street.length() < 30
					&& !street.matches(".*[!@#$%^&*()_+{}><.;,<>].*")) {
				System.out.println("street is valid");
			} else {
				System.err.println("street is invalid");
			}

			if (city != null && city.length() > 3 && city.length() < 30
					&& !city.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*")) {
				System.out.println("city is valid");
			} else {
				System.err.println("city is invalid");
			}

			if (state != null && state.length() > 3 && state.length() < 30
					&& !state.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*")) {
				System.out.println("state is valid");
			} else {
				System.out.println("state is invalid");
			}

			if (no != null && no > 0) {
				System.out.println("no is valid");
			} else {
				System.err.println("no is valid");
			}

			if (landmark != null && landmark.length() > 3 && landmark.length() < 30
					&& !landmark.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*")) {
				System.out.println("landmark is valid");
			} else {
				System.err.println("landmark is invalid");
			}

		}
		return this.stom.save(dto);
	}
}
