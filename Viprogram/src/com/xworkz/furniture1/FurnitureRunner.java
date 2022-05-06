package com.xworkz.furniture1;

import com.xworkz.furniture.constants.Material;
import com.xworkz.furniture.dao.FurnitureDAO;
import com.xworkz.furniture.dto.FurnitureDTO;

public class FurnitureRunner {

	public static void main(String[] args) {

		FurnitureDTO fun = new FurnitureDTO();
		fun.setId(1);
		fun.setName("Sofa");
		fun.setPrice(17000d);
		fun.setBrand("American Signature");
		fun.setWeight(12.1f);
		fun.setMaterial(Material.STEEL);

		FurnitureDTO fun1 = new FurnitureDTO();
		fun1.setId(2);
		fun1.setName("Chair");
		fun1.setPrice(8000d);
		fun1.setBrand("Restoration Hardware");
		fun1.setWeight(5.7f);
		fun1.setMaterial(Material.IRON);

		FurnitureDTO fun2 = new FurnitureDTO();
		fun2.setId(3);
		fun2.setName("Bookcase");
		fun2.setPrice(1500d);
		fun2.setBrand("City Furniture");
		fun2.setWeight(14.2f);
		fun2.setMaterial(Material.FIBRE);

		FurnitureDTO fun3 = new FurnitureDTO();
		fun3.setId(4);
		fun3.setName("Bed");
		fun3.setPrice(25000d);
		fun3.setBrand("Star Furniture");
		fun3.setWeight(17.5f);
		fun3.setMaterial(Material.WOOD);

		FurnitureDTO fun4 = new FurnitureDTO();
		fun4.setId(5);
		fun4.setName("Wardrobe");
		fun4.setPrice(34000d);
		fun4.setBrand("Ethan Allen");
		fun4.setWeight(10.4f);
		fun4.setMaterial(Material.ALLUMINIUM);

		FurnitureDTO fun5 = new FurnitureDTO();
		fun5.setId(6);
		fun5.setName("Wardrobe");
		fun5.setPrice(34000d);
		fun5.setBrand("Ethan Allen");
		fun5.setWeight(10.4f);
		fun5.setMaterial(Material.ALLUMINIUM);

		FurnitureDAO dao = new FurnitureDAO();
		boolean save = dao.save(fun);
		System.out.println(save);

		save = dao.save(fun1);
		System.out.println(save);

		save = dao.save(fun2);
		System.out.println(save);

		save = dao.save(fun3);
		System.out.println(save);

		save = dao.save(fun4);
		System.out.println(save);

		save = dao.save(fun5);
		System.out.println(save);
	}

}
