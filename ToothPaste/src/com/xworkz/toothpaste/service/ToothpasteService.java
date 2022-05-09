package com.xworkz.toothpaste.service;

import com.xworkz.toothpaste.dao.ToothpasteDAO;
import com.xworkz.toothpaste.dto.ToothpasteDTO;

public class ToothpasteService {

	private ToothpasteDAO pasteDAO = new ToothpasteDAO();

	public boolean validateAndSave(ToothpasteDTO dto) {
		if (dto != null) {
			boolean saved = pasteDAO.save(dto);
			return true;
		} else {
			System.err.println("toothpaste is not valid ");
		}
		return false;
	}

}
