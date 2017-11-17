package com.assignment_4.superclasses;

/***
 * Human - superclass that manages the name and age of the bank customer
 * 
 * @author Monika - mnk1910
 * @version 1.0
 */

public class Human {
	
	private String name = "";
	private int age;
	
	/***
	 * method that creates the name and age of the bank customer  
	 * @param name - a String that is the name of the bank customer
	 * @param age - an integer that is the age of the bank customer
	 */
	public Human(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	
	/***
	 * method that sets the name of the customer
	 * @param name - a String that is the name of the customer
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/***
	 * method that sets the age of the customer
	 * @param age - an integer that is the age of the customer
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/***
	 * method that gets the name of the customer
	 * @return name - a String that is the name of the customer
	 */
	public String getName() {
		return name;
	}
	
	/***
	 * method that gets the age of the customer
	 * @return age - a String that is the age of the customer
	 */
	public int getAge() {
		return age;
	}

}
