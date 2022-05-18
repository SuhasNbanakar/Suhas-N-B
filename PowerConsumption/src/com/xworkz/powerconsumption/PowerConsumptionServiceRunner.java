package com.xworkz.powerconsumption;

import java.time.LocalDate;

import com.xworkz.powerconsumption.dao.PowerConsumptionDAO;
import com.xworkz.powerconsumption.dao.PowerConsumptionDAOImpl;
import com.xworkz.powerconsumption.dto.PowerConsumptionDTO;
import com.xworkz.powerconsumption.exception.InvalidDataException;
import com.xworkz.powerconsumption.service.PowerConsumptionService;
import com.xworkz.powerconsumption.service.PowerConsumptionServiceImpl;

public class PowerConsumptionServiceRunner {

	public static void main(String[] args) {

		PowerConsumptionDTO powe = new PowerConsumptionDTO();

		PowerConsumptionDAO cons = new PowerConsumptionDAOImpl();

		PowerConsumptionService serv = new PowerConsumptionServiceImpl(cons);

		try {
			serv.validateAndSave(
					new PowerConsumptionDTO(1, 75D, 4.5D, LocalDate.of(2022, 05, 24), 150D, "Gururaj", "MESCOM"));
			serv.validateAndSave(
					new PowerConsumptionDTO(2, 76D, 4.6D, LocalDate.of(2022, 05, 24), 155D, "Suhas", "BESCOM"));
			serv.validateAndSave(
					new PowerConsumptionDTO(3, 77D, 4.7D, LocalDate.of(2022, 05, 24), 150D, "Pratheek", "HESCOM"));
			serv.validateAndSave(
					new PowerConsumptionDTO(4, 78D, 4.8D, LocalDate.of(2022, 05, 24), 155D, "Ranjuu", "GESCOM"));
			serv.validateAndSave(
					new PowerConsumptionDTO(5, 79D, 4.9D, LocalDate.of(2022, 05, 24), 150D, "Prabhu", "MESCOM"));
			serv.validateAndSave(
					new PowerConsumptionDTO(6, 80.1D, 5D, LocalDate.of(2022, 05, 24), 155D, "Raju", "BESCOM"));
			serv.validateAndSave(
					new PowerConsumptionDTO(7, 80.5D, 5.1D, LocalDate.of(2022, 05, 24), 150D, "Sandeep", "GESCOM"));
			serv.validateAndSave(
					new PowerConsumptionDTO(8, 80.7D, 5.2D, LocalDate.of(2022, 05, 24), 155D, "Shweta", "HESCOM"));
			serv.validateAndSave(
					new PowerConsumptionDTO(9, 81.2D, 5.3D, LocalDate.of(2022, 05, 24), 156D, "Laxmi", "BESCOM"));
			serv.validateAndSave(
					new PowerConsumptionDTO(10, 81.4D, 5.4D, LocalDate.of(2022, 05, 24), 157D, "Ramesh", "MESCOM"));
			serv.validateAndSave(
					new PowerConsumptionDTO(11, 81.7D, 5.5D, LocalDate.of(2022, 05, 24), 155D, "Rakesh", "GESCOM"));
			serv.validateAndSave(
					new PowerConsumptionDTO(12, 82D, 5.6D, LocalDate.of(2022, 05, 24), 157D, "Nikhil", "HESCOM"));
			serv.validateAndSave(
					new PowerConsumptionDTO(13, 82.1D, 5.7D, LocalDate.of(2022, 05, 24), 151D, "Rajshekar", "MESCOM"));
			serv.validateAndSave(
					new PowerConsumptionDTO(14, 82.4D, 5.8D, LocalDate.of(2022, 05, 24), 155D, "Ravi", "GESCOM"));
			PowerConsumptionDTO consu15 = new PowerConsumptionDTO(15, 82.5D, 5.9D, LocalDate.of(2022, 05, 24), 153D,
					"Basavaraj", "BESCOM");
			PowerConsumptionDTO consu16 = new PowerConsumptionDTO(16, 82.8D, 6D, LocalDate.of(2022, 05, 24), 152D,
					"Giri", "HESCOM");
			PowerConsumptionDTO consu17 = new PowerConsumptionDTO(17, 82.1D, 6.1D, LocalDate.of(2022, 05, 24), 150D,
					"Sundra", "BESCOM");
			PowerConsumptionDTO consu18 = new PowerConsumptionDTO(18, 80D, 6.2D, LocalDate.of(2022, 05, 24), 150D,
					"Sanju", "GESCOM");
			PowerConsumptionDTO consu19 = new PowerConsumptionDTO(19, 76.5D, 6.3D, LocalDate.of(2022, 05, 24), 150D,
					"Kiran", "HESCOM");
			PowerConsumptionDTO consu20 = new PowerConsumptionDTO(20, 75.4D, 6.4D, LocalDate.of(2022, 05, 24), 150D,
					"Anil", "MESCOM");
			PowerConsumptionDTO consu21 = new PowerConsumptionDTO(21, 74.1D, 6.5D, LocalDate.of(2022, 05, 24), 150D,
					"Uma", "BESCOM");
			PowerConsumptionDTO consu22 = new PowerConsumptionDTO(22, 76.8D, 6.6D, LocalDate.of(2022, 05, 24), 150D,
					"Shivakumar", "GESCOM");
			PowerConsumptionDTO consu23 = new PowerConsumptionDTO(23, 77.3D, 6.7D, LocalDate.of(2022, 05, 24), 150D,
					"Sanjana", "HESCOM");
			PowerConsumptionDTO consu24 = new PowerConsumptionDTO(24, 74.1D, 6.8D, LocalDate.of(2022, 05, 24), 150D,
					"Manoja", "MESCOM");
			PowerConsumptionDTO consu25 = new PowerConsumptionDTO(25, 73.1D, 6.9D, LocalDate.of(2022, 05, 24), 150D,
					"Sataya", "BESCOM");

			PowerConsumptionDTO[] name = { consu15, consu16, consu17, consu18, consu19, consu20, consu21, consu22,
					consu23, consu24, consu25 };
			serv.validateAndSaveMultiple(name);

			serv.findByName("Kiran");

			// serv.saveMultiple([5]);

			// serv.deleteByCustomerName("Sanjana");

			// serv.deleteByDivision("HESCOM");

			serv.updateMinChargeByDivision("BESCOM", 151D);

			serv.updateRatePerUnitByDivision("MESCOM", 5.9D);

			serv.findByDivision("GESCOM");

			serv.findByCustomerNameAndDivision("Rajshekar", "MESCOM");

			serv.findRatePerUnitByDivision("HESCOM");

			serv.findDueAmountByCustomerName("Raju");

			serv.printDetails();

		} catch (InvalidDataException e) {
			System.out.println("message" + e.getMessage());
		}
	}

}
