package com.xworkz.toothpaste;

import java.time.LocalDate;

import com.xworkz.toothpaste.constants.Color;
import com.xworkz.toothpaste.constants.Quantity;
import com.xworkz.toothpaste.dto.ToothpasteDTO;
import com.xworkz.toothpaste.service.ToothpasteService;

public class ToothpasteRunner {

	public static void main(String[] args) {

		ToothpasteDTO tooth = new ToothpasteDTO();
		tooth.setId(1);
		tooth.setBrand("Colgate");
		tooth.setColor(Color.BLACK);
		tooth.setQuantity(Quantity.HUNDRAND_GMS);
		tooth.setPrice(85.0);
		tooth.setMainIngredeient("Cooling Crystals");
		tooth.setMfgDate(LocalDate.of(2022, 6, 02));
		tooth.setExpiryDate(LocalDate.of(2023, 5, 18));

		ToothpasteDTO tooth1 = new ToothpasteDTO();
		tooth1.setId(2);
		tooth1.setBrand("Pepsodent");
		tooth1.setColor(Color.WHITE);
		tooth1.setQuantity(Quantity.SEVENTY_GMS);
		tooth1.setPrice(150.0);
		tooth1.setMainIngredeient("Strong Teeth");
		tooth1.setMfgDate(LocalDate.of(2021, 3, 14));
		tooth1.setExpiryDate(LocalDate.of(2022, 2, 12));

		ToothpasteDTO tooth2 = new ToothpasteDTO();
		tooth2.setId(3);
		tooth2.setBrand("Dabur");
		tooth2.setColor(Color.RED);
		tooth2.setQuantity(Quantity.TWENTYFIVE_GMS);
		tooth2.setPrice(30.0);
		tooth2.setMainIngredeient("Ayurvedic");
		tooth2.setMfgDate(LocalDate.of(2020, 4, 19));
		tooth2.setExpiryDate(LocalDate.of(2021, 3, 11));

		ToothpasteDTO tooth3 = new ToothpasteDTO();
		tooth3.setId(4);
		tooth3.setBrand("Sensodyne");
		tooth3.setColor(Color.WHITE);
		tooth3.setQuantity(Quantity.TWOHUNDRAND_GMS);
		tooth3.setPrice(230.0);
		tooth3.setMainIngredeient("Cool Menthol");
		tooth3.setMfgDate(LocalDate.of(2021, 2, 20));
		tooth3.setExpiryDate(LocalDate.of(2022, 12, 3));

		ToothpasteDTO tooth4 = new ToothpasteDTO();
		tooth4.setId(5);
		tooth4.setBrand("CloseUp");
		tooth4.setColor(Color.RED);
		tooth4.setQuantity(Quantity.TWENTYFIVE_GMS);
		tooth4.setPrice(12.0);
		tooth4.setMainIngredeient("Cooling Crystals");
		tooth4.setMfgDate(LocalDate.of(2022, 3, 14));
		tooth4.setExpiryDate(LocalDate.of(2023, 5, 15));

		ToothpasteDTO tooth5 = new ToothpasteDTO();
		tooth5.setId(6);
		tooth5.setBrand("SenosForm");
		tooth5.setColor(Color.GREY);
		tooth5.setQuantity(Quantity.FIFTY_GMS);
		tooth5.setPrice(120.0);
		tooth5.setMainIngredeient("Pudina");
		tooth5.setMfgDate(LocalDate.of(2022, 8, 27));
		tooth5.setExpiryDate(LocalDate.of(2023, 7, 22));

		ToothpasteService service = new ToothpasteService();
		boolean saved = service.validateAndSave(tooth);
		System.out.println(saved);

		saved = service.validateAndSave(tooth1);
		System.out.println(saved);
		saved = service.validateAndSave(tooth2);
		System.out.println(saved);
		saved = service.validateAndSave(tooth3);
		System.out.println(saved);
		saved = service.validateAndSave(tooth4);
		System.out.println(saved);
		saved = service.validateAndSave(tooth2);
		System.out.println(saved);

	}

}
