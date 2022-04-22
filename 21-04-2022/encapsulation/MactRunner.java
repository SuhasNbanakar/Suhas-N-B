package com.suhas.encapsulation;

public class MactRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Money money=new Money();
		
		money.setMaterial("Paper");
		money.setCurrency("Rupees");
		money.setCountry("India");
		money.setColor("Red");
		money.setDenomination(2000);
		
		System.out.println(money.getMaterial());
		System.out.println(money.getCurrency());
		System.out.println(money.getCountry());
		System.out.println(money.getColor());
		System.out.println(money.getDenomination());
		
		System.out.println("***************************************");
		
		Atm atm=new Atm();
		
		atm.setBankName("SBI");
		atm.setSecurityGuard(true);
		atm.setAc(true);
		atm.setMoneyAvailable(250000);
		atm.setHomeBranch("BTM");
		
		System.out.println(atm.getBankName());
		System.out.println(atm.isSecurityGuard());
		System.out.println(atm.isAc());
		System.out.println(atm.getMoneyAvailable());
		System.out.println(atm.getHomeBranch());
				
		System.out.println("***************************************");
		
		Cooker cook=new Cooker();
		
		cook.setCompanyName("Prestige");
		cook.setCapacity(5);
		cook.setPrice(1500);
		cook.setMaterial("Steel");
		cook.setWarranty(4);
		cook.setWeight(3);
		cook.setHeight(40);
		cook.setIsiMarked(true);
		cook.setManufacturedDate("Feb2020");
		cook.setDiscountPercentage(25);
		cook.setFreeItem(true);
		cook.setType(Type.GAS_COOKER);
		
		System.out.println(cook.getCompanyName());		
		System.out.println(cook.getCapacity());
		System.out.println(cook.getPrice());
		System.out.println(cook.getMaterial());
		System.out.println(cook.getWarranty());
		System.out.println(cook.getWeight());
		System.out.println(cook.getHeight());
		System.out.println(cook.isIsiMarked());
		System.out.println(cook.getManufacturedDate());
		System.out.println(cook.getDiscountPercentage());
		System.out.println(cook.isFreeItem());
		System.out.println(cook.getType());
				
				
				
				
				
				
	}

}
