package com.assignment_4.subclasses;

import java.util.ArrayList;

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;

/***
 * BankCustomer - subclass to class Human, that adds a customer account
 * and returns customer account information from BankAccount
 * 
 * @author Monika - mnk1910
 * @version 1.0
 */
public class BankCustomer extends Human {

	ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

	/***
	 * constructor method used to create new customer identification parameters
	 * @param name - a String that is the name of the new bank customer
	 * @param age - an integer that is the age of the new bank customer
	 */
	public BankCustomer(String name, int age) {
		super(name, age);
	}

	/**
	 * method used to set customer accounts data
	 * @param customerAccounts - an ArrayList containing data about all the accounts of a customer 
	 */
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}

	/**
	 * method used to get customer accounts data
	 * @return customerAccounts - an ArrayList containing data about all the accounts of a customer
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}

	/**
	 * method that adds a bank account for a customer
	 * @param bankAccount - an ArrayList containing the account number and type and its balance
	 */
	public void addAccount(BankAccount bankAccount) {
		customerAccounts.add(bankAccount);	
	}

	/**
	 * method for depositing an amount of money to a specific account
	 * @param accountNumber - a String that is the account in which the amount is deposited 
	 * @param amount - a double that is the amount of money deposited
	 */
	public void depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).depositMoney(amount);
			}
		}
	}

	/**
	 * method for withdrawing an amount of money from a specific account
	 * @param accountNumber - a String representing the account number from which the amount is withdrawn
	 * @param amount - a double that is the amount of money withdrawn
	 */
	public void withdrawFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}
	}

	/***
	 * method that returns a String with customer account information
	 * @param  none
	 * @return info - a String that represents the customer's various accounts information
	 */
	public String infoCustomerAccounts() {
		 String info = "Customer: "+ getName() + ", Age: " +getAge() + "\n"; {
		  	for (int i=0; i < customerAccounts.size(); i++) { 
		  		info += customerAccounts.get(i).toString() + "\n";
		 	} 
		 return info;
		 }
	}
}
