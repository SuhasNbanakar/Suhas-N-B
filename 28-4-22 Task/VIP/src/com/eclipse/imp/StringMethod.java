package com.eclipse.imp;

public class StringMethod {

	public static void main(String[] args) {

		String area="Rajajinagara";
		
		String obj=area.toLowerCase();
		System.out.println("to lowercase= "+obj);
		
		char obj1=area.charAt(3);
		System.out.println("running chart at= "+obj1);
				
		String obj2=area.concat("1");
		System.out.println("running concat= "+obj2);
		
		String all ="SUHAS" ;
		String obj3=all.toLowerCase();
		System.out.println("running to lowercase= "+obj3);
		
		String obj4=area.toUpperCase();
		System.out.println("running to uppercase= "+obj4);
		
		boolean obj5=area.contains("aj");
		System.out.println("running contains = "+obj5);
		
		int	obj6=area.compareTo(all);
		System.out.println("running comparer to = "+obj6);
		
		int obj7=area.codePointAt(3);
		System.out.println("running code point at = "+obj7);
		
		int obj8=area.codePointBefore(5);
		System.out.println("running code point before = "+obj8);
		
		int obj9=area.codePointCount(1,4);
		System.out.println("running code point count = "+obj9);
				
	}

}