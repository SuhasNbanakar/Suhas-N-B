package com.xworkz.account.task;

public class Sbi extends AbstractAccount {

	public Sbi(String name, String typeOfAc) {
		super(name, typeOfAc);
	}

	@Override
	public void debit() {
		System.out.println("running sbi debit");
	}

	@Override
	public void loan() {
		System.out.println("running sbi loan");

	}

}
