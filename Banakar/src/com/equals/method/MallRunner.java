package com.equals.method;

public class MallRunner {

	public static void main(String[] args) {

		
		
		Mall mall=new Mall();
		mall.setMallNumber(20);
		mall.setName("Central mall");
		mall.setOwnerName("shivu");
		mall.setPincode(577413);
		mall.setPvr(true);
		
		
		Mall mall1=new Mall();
		mall1.setMallNumber(20);
		mall1.setName("Central mall");
		mall1.setOwnerName("shivu");
		mall1.setPincode(577413);
		mall1.setPvr(true);
		
		boolean ma=mall.equals(mall1);
		System.out.println(ma);
	}

}
