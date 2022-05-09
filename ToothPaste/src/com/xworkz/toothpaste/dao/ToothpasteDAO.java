package com.xworkz.toothpaste.dao;

import com.xworkz.toothpaste.dto.ToothpasteDTO;
import com.xworkz.toothpaste.exceptions.ToothpasteNotFound;

public class ToothpasteDAO {

	private ToothpasteDTO[] pasteDTO = new ToothpasteDTO[5];

	private int index;

	public boolean save(ToothpasteDTO dto) {
		if (this.index < this.pasteDTO.length) {
			this.pasteDTO[index] = dto;
			index++;
			System.out.println("save the toothpaste details" + dto);
			return true;
		} else {
			System.err.println("toothpaste details not save");
			ToothpasteNotFound found = new ToothpasteNotFound("toothpaste details not add");
			throw found;
		}
	}

}
