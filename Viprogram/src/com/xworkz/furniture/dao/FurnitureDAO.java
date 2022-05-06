package com.xworkz.furniture.dao;

import com.xworkz.furniture.dto.FurnitureDTO;
import com.xworkz.furniture.exceptions.FurnitureOverspilledExceptions;

public class FurnitureDAO {

	FurnitureDTO[] furnitureDTO = new FurnitureDTO[5];
	private int index;

	public boolean save(FurnitureDTO dto) {
		if (this.index < this.furnitureDTO.length) {
			this.furnitureDTO[index] = dto;
			index++;
			System.out.println("furniture is added " + dto + "at index" + index);
			return true;
		} else {
			System.err.println("furniture is not available");
			FurnitureOverspilledExceptions over = new FurnitureOverspilledExceptions(
					"nana add madola guru enadru madoko hoga ");
			throw over;
		}

	}

}
