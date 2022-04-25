package com.suhas.overriding;

public class Task {

	protected Object clone() {
		System.out.println("running object");
		return null;
	}

	public boolean equals(Object obj) {
		System.out.println("running equals");
		return true;
	}

	protected void finalize() {
		System.out.println("running finalize");
	}
	
	public int hashCode() {
		System.out.println("running hashCode");
		return 12;
	}



	public String toString() {
		System.out.println("running tostring");
		return null;
	}

	
}
