package com.xworkz.persondetail.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class AddressDTO implements Serializable, Comparable<AddressDTO> {
	private Integer id;
	private String street;
	private Integer doorNo;
	private String city;

	@Override
	public int compareTo(AddressDTO o) {
		if (o != null && id != null) {
			System.out.println("Comparing Id in AddressDTO");
			return this.id.compareTo(o.id);
		}
		throw new IllegalArgumentException("");
	}

}
