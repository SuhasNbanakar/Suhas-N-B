package com.xworkz.customer.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.xworkz.customer.constants.Gender;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class CustomerDTO implements Serializable {
	@NonNull
	private Integer id;
	@NonNull
	private String name;
	@NonNull
	private String email;
	@NonNull
	private LocalDate dob;
	@NonNull
	private Gender gender;
	@NonNull
	private String occupation;
	@NonNull
	private AddressDTO addressDTO;

}
