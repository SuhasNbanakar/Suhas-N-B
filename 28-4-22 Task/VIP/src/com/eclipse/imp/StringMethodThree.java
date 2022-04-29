package com.eclipse.imp;

public class StringMethodThree {

	public static void main(String[] args) {
		
		String country="I Love My India";
		
		int coun=country.lastIndexOf("ve",6);//ve is last index of string op=4
		System.out.println("running last index is = "+coun);
		
		int coun1=country.length();//total length op=15
		System.out.println("running length = "+coun1);
		
		String coun2=country.replace("I","i");// I is replace i op=i Love My india
		System.out.println("running replace = "+coun2);
		
		String coun3=country.replace("India","Indians");// op=I Love My Indians
		System.out.println("running replace of ch seq = "+coun3);
		
		String coun4=country.replaceAll("\\s","");// op=ILoveMyIndia
		System.out.println("running replace all = "+coun4);
		
		String coun5=country.replaceFirst("Love","Payar");// op= I Payar My India
		System.out.println("running replace first = "+coun5);
		
		boolean	coun6=country.startsWith("I");// op=true
		System.out.println("running start with prefix = "+coun6);
		
		boolean	coun7=country.startsWith("L",2);// op=true
		System.out.println("running prefix and offset = "+coun7);
		
		CharSequence coun8=country.subSequence(3,8);// op=ove M
		System.out.println("running sub siquence = "+coun8);
	
		String coun9=country.substring(4);// op= ve My India
		System.out.println("running sub string = "+coun9);
		
	}

}
