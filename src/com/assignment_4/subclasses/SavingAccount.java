package com.assignment_4.subclasses;
import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;

/***
 * This is a class that creates a saving bank account
 *  
 * @author Monika - mnk1910
 * @version 1.0
 */
public class SavingAccount extends BankAccount{

	/***
	 * A constructor method that creates the account number and its corresponding balance for a customer's saving account
	 */
	public SavingAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0,6));
		this.setBalance(0.0);
		this.setAccountType("Saving account");
	}
}
