package com.xworkz.resort;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;

public class ResortCalling {

	public static void main(String[] args) {

		ResortDTO resortDTO2 = new ResortDTO(3, "Loving-star", "Sanju", "Birur", 1000D, 5, LocalTime.of(9, 30),
				LocalTime.of(10, 00), 11, "Shweta", 17, 6, false, 20, 6, 5, 8, true, "Karanatak", "India", 40D, 5, 400D,
				false, 5, 15, true, true, true, "Aracanut", 19, true, true, "Cricket", "2013GST82503kf", true, false,
				true, false, LocalDate.of(2022, 6, 20), "sandeep", LocalDate.of(2022, 6, 21), "KKKKK");

		ResortDTO resortDTO3 = new ResortDTO(2, "Hill Resort", "Kiran", "Mudigere", 900D, 4, LocalTime.of(8, 30),
				LocalTime.of(11, 30), 3, "Arpitha", 22, 4, true, 23, 12, 5, 7, true, "Karnataka", "India", 150D, 3,
				900D, true, 4, 40, true, true, true, "Cofee & Rubber & mango", 14, true, true, "Kabadi,Cycling",
				"GST2022KR12345", true, true, true, false, LocalDate.of(2022, 6, 25), "KiranRaj",
				LocalDate.of(2022, 6, 28), "RRRR");

		ResortDTO resortDTO1 = new ResortDTO(1, "King Resort", "Raj", "Chikkmagalur", 1000D, 5, LocalTime.of(9, 30),
				LocalTime.of(10, 30), 2, "Rohini", 20, 5, true, 20, 10, 4, 6, true, "Karnataka", "India", 100D, 4,
				1000D, true, 5, 50, true, true, true, "Coconut & Mango", 15, true, true, "cricket,vollyball",
				"GST2022RJ12345", true, true, true, false, LocalDate.of(2022, 6, 24), "Rajshekar",
				LocalDate.of(2022, 6, 28), "YYYY");
		ResortDAO resortDAO = new ResortDAOImpl();

//		boolean temp = resortDAO.save(resortDTO3);
//		System.out.println(temp);

		// resortDAO.updatePriceByName("Hill Resort", 999D);

		// resortDAO.updatePriceAndRatingByName("King Resort", 4, 850D);

//		resortDAO.updateReceptionistNameById("Suma", 2);
//		ResortDTO temp=resortDAO.getByName("Loving-star");
//		System.out.println(temp);
//		ResortDTO temp1=resortDAO.getByNameAndLocation("King Resort", "Chikkmagalur");
//		System.out.println(temp1);
//		ResortDTO temp2=resortDAO.getByNameAndLocationAndOwnerName("Hill Resort", "Mudigere", "Kiran");
//		System.out.println(temp2);

		// resortDAO.save(resortDTO1);

		int count = resortDAO.getTotalRows();
		System.out.println(count);
		ResortDTO temp3 = resortDAO.getById(4);
		System.out.println(temp3);
		ResortDTO temp4 = resortDAO.getByMaxPrice();
		System.out.println(temp4);
		ResortDTO temp5 = resortDAO.getByMinPrice();
		System.out.println(temp5);

	}

}
