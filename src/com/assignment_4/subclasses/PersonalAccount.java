package com.assignment_4.subclasses;
import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;

/***
 * This is a class that creates a personal bank account
 * 
 * @author Monika - mnk1910
 * @version 1.0
 */

public class PersonalAccount extends BankAccount {

	/***
	 * A constructor method that creates the account number and its corresponding balance for a customer's personal account
	 */
	public PersonalAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0,6));
		this.setBalance(0.0);
		this.setAccountType("Personal account");
	}
	
}

