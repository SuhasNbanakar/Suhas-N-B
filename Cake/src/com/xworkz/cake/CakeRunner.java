package com.xworkz.cake;

import com.xworkz.cake.dao.CakeDAO;
import com.xworkz.cake.dto.CakeDTO;
import com.xworkz.cake.dto.Flavour;
import com.xworkz.cake.dto.Shape;
import com.xworkz.cake.dto.Type;

public class CakeRunner {

	public static void main(String[] args) {

		CakeDTO cakeDTO = new CakeDTO();
		cakeDTO.setId(1);
		cakeDTO.setPrice(1000.0);
		cakeDTO.setFlavour(Flavour.BLACKFOREST);
		cakeDTO.setQuantity(1);
		cakeDTO.setShape(Shape.HEART);
		cakeDTO.setType(Type.PASTRY);

		CakeDAO cakeDAO = new CakeDAO();
		boolean addCake = cakeDAO.save(cakeDTO);
		System.out.println(addCake);

		CakeDTO cakeDTO1 = new CakeDTO();
		cakeDTO1.setId(2);
		cakeDTO1.setPrice(1500.0);
		cakeDTO1.setFlavour(Flavour.CHOCOLATE);
		cakeDTO1.setQuantity(2);
		cakeDTO1.setShape(Shape.RECTANGLE);
		cakeDTO1.setType(Type.EGGLESS);

		boolean addCake2 = cakeDAO.save(cakeDTO1);
		System.out.println(addCake2);

		CakeDTO cakeDTO2 = new CakeDTO();
		cakeDTO2.setId(3);
		cakeDTO2.setPrice(1700.0);
		cakeDTO2.setFlavour(Flavour.PINEAPPLE);
		cakeDTO2.setQuantity(3);
		cakeDTO2.setShape(Shape.ROUND);
		cakeDTO2.setType(Type.REGULAR);

		boolean addCake3 = cakeDAO.save(cakeDTO2);
		System.out.println(addCake3);

		CakeDTO cakeDTO3 = new CakeDTO();
		cakeDTO3.setId(4);
		cakeDTO3.setPrice(1800.0);
		cakeDTO3.setFlavour(Flavour.BUTTERSCOTCH);
		cakeDTO3.setQuantity(4);
		cakeDTO3.setShape(Shape.RECTANGLE);
		cakeDTO3.setType(Type.EGGLESS);

		boolean addCake4 = cakeDAO.save(cakeDTO3);
		System.out.println(addCake4);

		CakeDTO cakeDTO4 = new CakeDTO();
		cakeDTO4.setId(5);
		cakeDTO4.setPrice(1900.0);
		cakeDTO4.setFlavour(Flavour.BLACKFOREST);
		cakeDTO4.setQuantity(3);
		cakeDTO4.setShape(Shape.RECTANGLE);
		cakeDTO4.setType(Type.EGGLESS);

		boolean addCake5 = cakeDAO.save(cakeDTO4);
		System.out.println(addCake5);

		cakeDAO.updatePriceByFlavour(1200.0, Flavour.BLACKFOREST);
		System.out.println("****&&&&&&&&&&&&&&&&&&&&&*****");

		cakeDAO.updatePriceAndQuantityByFlavour(1500d, 3, Flavour.CHOCOLATE);
		System.out.println("****&&&&&&&&&&&&&&&*****");

		cakeDAO.updateShapeById(Shape.SQUARE, 3);
		System.out.println("****&&&&&&&&&&&&&&&&&&&&&&&*****");

		cakeDAO.updateTypeByIdAndFlavour(Type.REGULAR, 4, Flavour.BUTTERSCOTCH);
		System.out.println("*****&&&&&&&&&&&&&&&&&&&&&&****");

		cakeDAO.updatePriceAndShapeAndTypeByQuantity(3400d, Shape.HEART, Type.PASTRY, 4);
		System.out.println("****&&&&&&&&&&&&&&&&&&&&&&*****");

		cakeDAO.findById(5);
		System.out.println("****&&&&&&&&&&&&&&&&&&&&&&*****");

		cakeDAO.findByIdAndFlavour(3, Flavour.CHOCOLATE);
		System.out.println("****&&&&&&&&&&&&&&&&&&&&&&*****");

		cakeDAO.findPriceById(2);
		System.out.println("****&&&&&&&&&&&&&&&&&&&&&&*****");

		cakeDAO.findFlavourById(3);
		System.out.println("****&&&&&&&&&&&&&&&&&&&&&&*****");

		cakeDAO.findAll();
		System.out.println("****&&&&&&&&&&&&&&&&&&&&&&*****");

	}

}
