package com.assignment_4.interfaces;
/***
 * This is an interface for bank operations that has two methods:
 * withdrawMoney and depositMoney
 * 
 * @author Monika - mnk1910
 * @version 1.0
 */
public interface BankOperations {
	
	/***
	 * method for withdrawing money from an account
	 * @param amount of type double that is the amount of money withdrawn from an account
	 */
	public void withdrawMoney(double amount);
	
	/***
	 * method for depositing money to an account
	 * @param amount of type double that is the amount of money deposited to an account
	 */
	public void depositMoney(double amount);
	
}
