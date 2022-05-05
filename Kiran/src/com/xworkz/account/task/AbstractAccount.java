package com.xworkz.account.task;

public abstract class AbstractAccount {

	private String name;
	private String typeOfAc;
	private Double balance;
	private Long acNumber;

	public AbstractAccount(String name, String typeOfAc) {

		this.name = name;
		this.typeOfAc = typeOfAc;
	}
    /**
     * 
     * @param balance
     * @param acNumber
     */
	public void credit(Double balance, Long acNumber) {
		System.out.println("running credit method  ");
		this.acNumber = acNumber;
		this.balance = balance;
	}

	public abstract void debit();

	public abstract void loan();

	public void payment() {
		System.out.println("running payment");
	}

	public void insurence() {
		System.out.println("running insurence");
	}

	public String getName() {
		return name;
	}

	public String getTypeOfAc() {
		return typeOfAc;
	}

	public Double getBalance() {
		return balance;
	}

	public Long getAcNumber() {
		return acNumber;
	}

}
