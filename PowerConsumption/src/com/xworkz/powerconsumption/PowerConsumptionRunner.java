package com.xworkz.powerconsumption;

import java.time.LocalDate;
import java.util.Optional;

import com.xworkz.powerconsumption.dao.PowerConsumptionDAO;
import com.xworkz.powerconsumption.dao.PowerConsumptionDAOImpl;
import com.xworkz.powerconsumption.dto.PowerConsumptionDTO;

public class PowerConsumptionRunner {

	public static void main(String[] args) {

		PowerConsumptionDTO power1 = new PowerConsumptionDTO(1, 75D, 4.5D, LocalDate.of(2022, 06, 20), 150D, "Gururaj",
				"MESCOM");

		PowerConsumptionDTO power2 = new PowerConsumptionDTO(2, 75D, 4.5D, LocalDate.of(2022, 06, 20), 150D, "Ravi",
				"BESCOM");

		PowerConsumptionDTO power3 = new PowerConsumptionDTO(3, 75D, 4.5D, LocalDate.of(2022, 06, 20), 150D,
				"Rajshekar", "GESCOM");

		PowerConsumptionDTO power4 = new PowerConsumptionDTO(4, 75D, 4.5D, LocalDate.of(2022, 06, 20), 150D, "sowmya",
				"DESCOM");

		PowerConsumptionDTO power5 = new PowerConsumptionDTO(5, 75D, 4.5D, LocalDate.of(2022, 06, 20), 150D,
				"laxmi mallapa karki", "HESCOM");

		PowerConsumptionDAO pow = new PowerConsumptionDAOImpl();
		boolean saved = pow.save(power1);
		System.out.println(saved);
		saved = pow.save(power2);
		System.out.println(saved);
		saved = pow.save(power3);
		System.out.println(saved);
		saved = pow.save(power4);
		System.out.println(saved);
		saved = pow.save(power5);
		System.out.println(saved);

		pow.printDetails();

		Optional<PowerConsumptionDTO> temp = pow.findByName("Rajshekar");
		if (temp.isPresent()) {
			PowerConsumptionDTO consu = temp.get();
			System.out.println(consu);
		}
	}

}
