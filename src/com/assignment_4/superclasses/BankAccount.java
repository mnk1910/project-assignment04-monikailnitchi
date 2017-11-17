package com.assignment_4.superclasses;
import java.util.UUID;

import com.assignment_4.interfaces.BankOperations;

/***
 * BankAccount - superclass that manages the bank customer's data,
 * such as account number, balance and account type.
 * It also implements an interface for bank operations.
 * 
 * @author Monika - mnk1910
 * @version 1.0
 */
public class BankAccount implements BankOperations {
	
	private String accountNumber = "";
	private String accountType = "";
	private double balance = 0.0;
	
	/***
	 * A constructor method that creates account data such as accountNumber, balance and accountType 
	 */
	public BankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0,6);
		this.balance=0;
		this.accountType = "Bank account";
	}
	
	/***
	 * Method that gets the account number
	 * @return accountNumber - a String that is the account number of the customer
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	
	/***
	 * Method that sets the account number
	 * @param accountNumber - a String that is the account number of the customer
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/***
	 * method that gets the account type
	 * @return accountType - a String that is the account type that the customer has
	 */
	public String getAccountType() {
		return accountType;
	}
	
	/***
	 * method that sets the account type
	 * @param accountType - a String that is the account type that the customer has
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	/***
	 * method that gets the balance of a customer's account
	 * @return balance - a double that is the amount of money that the customer has in an account
	 */
	public double getBalance() {
		return balance;
	}
	
	/***
	 * method that sets the balance of a customer's account
	 * @param balance - a double that is the amount of money that a customer has in an account
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/***
	 * method that returns a String with information about a specific account,
	 * such as the account number, its balance and the type of the account
	 * @return accountNumber - a String that is the number of the various types of accounts of the customer
	 * @return balance - a double that is the amount of money that the customer has in an account
	 * @return accountType - a String that is the account type that the customer has
	 */
	public String toString() {
		return "BankAccount [Account number = "+ accountNumber + ", Account balance = " +balance+ ", Account type: " + accountType + "]";
	}
	
	/***
	 * method that implements the bank operation method withdraw money
	 * @param amount - a double that is the amount of money withdrawn from a bank account
	 */
	public void withdrawMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() - amount);
		}else {
			System.out.println("You can not withdraw a negative amount!");
		}
	}
	
	/***
	 * method that implements the bank operation method deposit money
	 * @param amount - a double that is the amount of money deposited to a bank account 
	 */
	public void depositMoney(double amount) {
		if (amount >=0) {
			setBalance(getBalance() + amount);
		}else {
			System.out.println("You can not deposit a negative amount of money to the account!");
		}
	}

	
}
