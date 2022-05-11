package com.xworkz.toothpaste.service;

import com.xworkz.toothpaste.dao.ToothpasteDAO;
import com.xworkz.toothpaste.dto.ToothpasteDTO;
import com.xworkz.toothpaste.exceptions.ToothpasteOutOfStock;

public class ToothpasteService {

	private ToothpasteDAO pasteDAO = new ToothpasteDAO();

	public boolean validateAndSave(ToothpasteDTO dto) throws ToothpasteOutOfStock {
		if (dto != null) {
			boolean saved = pasteDAO.save(dto);
			return true;
		} else {
			System.err.println("toothpaste is not valid ");
			ToothpasteOutOfStock paste = new ToothpasteOutOfStock("please extended the space");
			throw paste;
		}

	}

}
