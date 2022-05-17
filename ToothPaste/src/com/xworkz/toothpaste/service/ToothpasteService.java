package com.xworkz.toothpaste.service;

import java.time.LocalDate;

import com.xworkz.toothpaste.constants.Color;
import com.xworkz.toothpaste.constants.Quantity;
import com.xworkz.toothpaste.dao.ToothpasteDAO;
import com.xworkz.toothpaste.dto.ToothpasteDTO;
import com.xworkz.toothpaste.exceptions.ToothpasteOutOfStock;

public class ToothpasteService {

	private ToothpasteDAO pasteDAO = new ToothpasteDAO();

	public boolean validateAndSave(ToothpasteDTO dto) throws ToothpasteOutOfStock {
		if (dto != null) {
			System.out.println("Dto not null");
			Integer id=dto.getId();
			String brand=dto.getBrand();
			Color color=dto.getColor();
			String mainIngredient=dto.getMainIngredeient();
			LocalDate mfgDate=dto.getMfgDate();
			LocalDate expiryDate=dto.getExpiryDate();
			Double price=dto.getPrice();
			Quantity quantityInGms=dto.getQuantity();
			
			if(id !=null & id>0)
			{
				System.out.println("valid id");
			}else {
				System.out.println("invalid id");
				throw new 
			}
			
			
		}

	}

}
