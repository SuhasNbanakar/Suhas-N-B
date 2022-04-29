package com.eclipse.imp;

public class StringMethodOne {

	public static void main(String[] args) {

		String brand=" Maruthi Suzuki";
		String brand1=" Hyundai ";
		String brand2=" MaRUthi SUzUki";
		
		int	temp=brand.compareToIgnoreCase(brand1);
		System.out.println("running compare to ignore case = "+temp);
		
		boolean temp1=brand.contentEquals(" Maruthi Suzuki ");
		System.out.println("running content equals = "+temp1);
		
		char[] all= {'A','M','M','A'};
		String temp2=String.copyValueOf(all);
		System.out.println("running copy value of = "+temp2);
		
		String temp3=String.copyValueOf(all,0,4);
		System.out.println("running copy value = "+temp3);
		
		boolean temp4=brand.endsWith("i");
		System.out.println("running endswith = "+temp4);
		
		boolean temp5=brand.equals(brand1);
		System.out.println("running equals = "+temp5);
		
		boolean temp6=brand.equalsIgnoreCase(brand2);
		System.out.println("running equlas ignore case = "+temp6);
		
		byte[] temp7=brand.getBytes();
		for(int i=0;i<temp7.length;i++)
		System.out.println("running get byte = "+temp7[i]);
		
		String temp8=String.format("my car name= %s",brand);//
		System.out.println(temp8);
		
		String temp9=String.format("new brand car");//
		System.out.println(temp9);
		
		
	}

}
