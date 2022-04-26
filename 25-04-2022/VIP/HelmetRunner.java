package com.xwork.method;

public class HelmetRunner {

	public static void main(String[] args) {
		
		Helmet helmet=new Helmet();
		int temp=helmet.hashCode();
		System.out.println(temp);
		
		String temp1=helmet.toString();
		System.out.println(temp1);
		
		helmet.setCompany("Vega");
		helmet.setIsiCertified(true);
		helmet.setPrice(999);
		helmet.setRating(4.5);
		helmet.setType(Type.MODUlAR_HELMET);
		
		Helmet helmet1=new Helmet();
		helmet1.setCompany("Vega");
		helmet1.setIsiCertified(true);
		helmet1.setPrice(999);
		helmet1.setRating(4.5);
		helmet1.setType(Type.MODUlAR_HELMET);
		
		boolean hel=helmet.equals(helmet1);
		System.out.println(hel);
	}

}
