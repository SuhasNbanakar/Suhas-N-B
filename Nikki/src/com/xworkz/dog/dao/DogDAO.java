package com.xworkz.dog.dao;

import java.util.Collection;

import com.xworkz.dog.dto.DogDTO;

public interface DogDAO {

	boolean save(DogDTO dogDTO);

	default void save(Collection<DogDTO> dto) {

	}

}
