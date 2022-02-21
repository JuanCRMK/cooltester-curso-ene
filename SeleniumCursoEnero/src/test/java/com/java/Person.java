package com.java;

public class Person {
	
	String firstName;
	String lastName;
	int age;
	
//	public Person (String firsName, String lastname) {
//		this.firstName = firsName;
//		this.lastName = lastname;
//		
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		int x = age > 0 && age < 100 ? age : 0;
		this.age = x;
	}
	
	public boolean isTeen () {
		boolean a = age > 12 && age < 20 ? true : false;
		return a;
	}
	
	public String getFullName() {
		String s = firstName + " " + lastName;
		return s;
	
	}

}
