package com.xworkz.customer.dto;

import java.io.Serializable;

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
public class AddressDTO implements Serializable {
	@NonNull
	private Integer id1;
	@NonNull
	private String street;
	@NonNull
	private String city;
	@NonNull
	private String state;
	@NonNull
	private Integer no;
	@NonNull
	private String landmark;
}
