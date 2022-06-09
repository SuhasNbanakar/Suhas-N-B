package com.xworkz.persondetail.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class PersonDTO implements Serializable, Comparable<PersonDTO> {
	private Integer id;
	private String name;
	private String email;
	private Integer mobile;

	@Override
	public int compareTo(PersonDTO o) {
		if (o != null && name != null) {
			return this.name.compareTo(o.name);
		}
		throw new IllegalArgumentException("Name Cannot Be Null");
	}

}
