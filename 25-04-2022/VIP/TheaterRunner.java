package com.xwork.method;

public class TheaterRunner {

	public static void main(String[] args) {
		
		
		Theater theater=new Theater();
		
		int obj1=theater.hashCode();
		System.out.println(obj1);
		
		String obj2=theater.toString();
		System.out.println(obj2);
		
		theater.setName("PVR");
		theater.setMovieName("KGF2");
		theater.setLocation("BTM");
		theater.setTicketPrice(500);
		
		
		Theater theater1=new Theater();
		theater1.setName("PVR");
		theater1.setMovieName("KGF2");
		theater1.setLocation("jp");
		theater1.setTicketPrice(600);
		
		boolean thea= theater.equals(theater1);
		System.out.println(thea);
		

	}

}
