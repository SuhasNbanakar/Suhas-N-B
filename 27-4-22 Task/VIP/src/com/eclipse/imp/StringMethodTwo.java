package com.eclipse.imp;

public class StringMethodTwo {

	public static void main(String[] args) {

		String dis="Shivamogga";
		
		int suh=dis.hashCode();
		System.out.println("running hash code = "+suh);
		
		int suh1=dis.indexOf("A");
		System.out.println("running index of = "+suh1);
		
		int suh2=dis.indexOf("a",9);
		System.out.println("running index = "+suh2);
		
		 int suh3=dis.indexOf("amo");//first letter index
		 System.out.println("running index of = "+suh3);
		 
		 int suh4=dis.indexOf("am",3);
		 System.out.println("running in of = "+suh4);
		 
		 String dis1=new String("Shivamogga");
		 String dis2=dis.intern();
				 System.out.println(dis==dis1);
		 System.out.println(dis==dis2);
		 
		 String dis3="";
		 boolean suh5=dis3.isEmpty();
		 boolean suh6=dis.isEmpty();
		 System.out.println("running is empty = "+suh5);
		 System.out.println("running is empty = "+suh6);
		 

		 int suh7=dis.lastIndexOf("");//a is last ch an op=9
		 System.out.println("running last index = "+suh7);
		 
		 int suh8=dis.lastIndexOf("i",3);//i is the last index op=2
		 System.out.println("running index of = "+suh8);
		 
		 int suh9=dis.lastIndexOf("mo");// mo is last string index op=5
		 System.out.println("running last index of string = "+suh9);
		 
	}

}
