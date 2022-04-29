package com.xwork.watertank;

import com.xwork.watertank.dao.WaterTankDAO;
import com.xwork.watertank.dto.WaterTankDTO;

public class WaterTankRunner {

	public static void main(String[] args) {
		
		WaterTankDTO waterTank=new WaterTankDTO();
		
		waterTank.setBrand("Avon Plast");
		waterTank.setColor("White");
		waterTank.setCapacity(800);
		waterTank.setPrice(3500D);
		waterTank.setWarrantyPeriod(10);
		
		System.out.println("first hash code = "+waterTank.hashCode());
		
		WaterTankDAO tank=new WaterTankDAO();
		boolean saved=tank.save(waterTank);
		System.out.println(saved);
		
		System.out.println("--------------**********--------------");
		
		WaterTankDTO waterTank1=new WaterTankDTO();
		
		waterTank1.setBrand("Sintax");
		waterTank1.setColor("Yellow");
		waterTank1.setCapacity(1000);
		waterTank1.setPrice(4500D);
		waterTank1.setWarrantyPeriod(12);

		System.out.println("second hash code = "+waterTank1.hashCode());

		saved=tank.save(waterTank1);
		System.out.println(saved);

		System.out.println("--------------**********--------------");

		WaterTankDTO waterTank2=new WaterTankDTO();
		
		waterTank2.setBrand("Plasto");
		waterTank2.setColor("Blue");
		waterTank2.setCapacity(2000);
		waterTank2.setPrice(7000D);
		waterTank2.setWarrantyPeriod(14);

		System.out.println("Threed hash code = "+waterTank2.hashCode());

		saved=tank.save(waterTank2);
		System.out.println(saved);

		System.out.println("--------------**********--------------");

		WaterTankDTO waterTank3=new WaterTankDTO();
		
		waterTank3.setBrand("Supreme");
		waterTank3.setColor("White");
		waterTank3.setCapacity(500);
		waterTank3.setPrice(1700D);
		waterTank3.setWarrantyPeriod(8);

		System.out.println("second hash code = "+waterTank3.hashCode());

		saved=tank.save(waterTank3);
		System.out.println(saved);
		
		System.out.println("--------------**********--------------");

		WaterTankDTO waterTank4=new WaterTankDTO();
		
		waterTank4.setBrand("Storewel");
		waterTank4.setColor("Yellow");
		waterTank4.setCapacity(1200);
		waterTank4.setPrice(2200D);
		waterTank4.setWarrantyPeriod(15);

		System.out.println("second hash code = "+waterTank4.hashCode());

		saved=tank.save(waterTank4);
		System.out.println(saved);
		
		System.out.println("--------------**********--------------");

		WaterTankDTO waterTank5=new WaterTankDTO();
		
		waterTank5.setBrand("Vectusl");
		waterTank5.setColor("blue");
		waterTank5.setCapacity(1800);
		waterTank5.setPrice(4000D);
		waterTank5.setWarrantyPeriod(5);

		System.out.println("second hash code = "+waterTank5.hashCode());

		saved=tank.save(waterTank5);
		System.out.println(saved);
		
		System.out.println("--------------**********--------------");
	}

}
