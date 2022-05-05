package com.xworkz.account;

import com.xworkz.account.task.AbstractAccount;
import com.xworkz.account.task.Sbi;

public class AccountRunner {

	public static void main(String[] args) {

		AbstractAccount abstractAccount = new Sbi("suhas", "Savings");
		abstractAccount.credit(12000d, 32676364740l);
		abstractAccount.debit();
		abstractAccount.insurence();
		abstractAccount.loan();
		abstractAccount.payment();
		System.out.println(abstractAccount.getName());
		System.out.println(abstractAccount.getTypeOfAc());
		System.out.println(abstractAccount.getBalance());
		System.out.println(abstractAccount.getAcNumber());

		System.out.println("**********************************************");

		AbstractAccount abstractAccount1 = new Sbi("Pratheek", "corrent");
		abstractAccount1.credit(18000d, 32346364740l);
		abstractAccount1.debit();
		abstractAccount1.insurence();
		abstractAccount1.loan();
		abstractAccount1.payment();
		System.out.println(abstractAccount1.getName());
		System.out.println(abstractAccount1.getTypeOfAc());
		System.out.println(abstractAccount1.getBalance());
		System.out.println(abstractAccount1.getAcNumber());

		System.out.println("**********************************************");

		AbstractAccount abstractAccount2 = new Sbi("Laxmi K", "Savings");
		abstractAccount2.credit(25000d, 42356364740l);
		abstractAccount2.debit();
		abstractAccount2.insurence();
		abstractAccount2.loan();
		abstractAccount2.payment();
		System.out.println(abstractAccount2.getName());
		System.out.println(abstractAccount2.getTypeOfAc());
		System.out.println(abstractAccount2.getBalance());
		System.out.println(abstractAccount2.getAcNumber());
	}

}
