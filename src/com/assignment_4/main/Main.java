package com.assignment_4.main;

import com.assignment_4.subclasses.BankCustomer;
import com.assignment_4.subclasses.PersonalAccount;
import com.assignment_4.subclasses.SavingAccount;
import com.assignment_4.superclasses.BankAccount;

/***
 * This is an application used to manage bank accounts
 * 
 * @author Monika - mnk1910
 * @version 1.0
 */

public class Main {

	/***
	 * This is the main method that implements the system
	 * @param args
	 */
	public static void main(String[] args) {
		
		String account = "";
		BankCustomer bc = new BankCustomer("Rafael", 30);
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingAccount());
		System.out.println(bc.infoCustomerAccounts());
		
		account = bc.getCustomerAccounts().get(0).getAccountNumber();
		System.out.println("Depositing 30.0 to the bank account");
		bc.depositToAccount(account, 30.0);
		System.out.println(bc.infoCustomerAccounts());
		
		System.out.println("Withdrawing 200.0 from the personal account");
		account = bc.getCustomerAccounts().get(1).getAccountNumber();
		bc.withdrawFromAccount(account, 200.0);
		System.out.println(bc.infoCustomerAccounts());
		
		System.out.println("Depositing 200.0 to the savings account");
		account = bc.getCustomerAccounts().get(2).getAccountNumber();
		bc.depositToAccount(account, 200.0);
		System.out.println(bc.infoCustomerAccounts());
		
	}

}
