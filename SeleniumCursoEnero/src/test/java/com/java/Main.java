package com.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Person person = new Person();
//		person.setFirstName("");   // firstName is set to empty string
//		person.setLastName("");    // lastName is set to empty string
//		person.setAge(10);
//		System.out.println("fullName= " + person.getFullName());
//		System.out.println("teen= " + person.isTeen());
//		person.setFirstName("John");    // firstName is set to John
//		person.setAge(18);
//		System.out.println("fullName= " + person.getFullName());
//		System.out.println("teen= " + person.isTeen());
//		person.setLastName("Smith");    // lastName is set to Smith
//		System.out.println("fullName= " + person.getFullName());
//		System.out.println("Edad= "+ person.getAge());
//		
//		Person person2 = new Person();
//		person2.setFirstName("Juan");
//		person2.setLastName("Ramirez");
//		person2.setAge(100);
//		System.out.println("fullName= "+ person2.getFullName());
//		System.out.println("Teen = " + person2.isTeen());
//		System.out.println("edad " + person2.getAge());
		
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		System.out.println("add= " + calculator.getAdditionResult());
		System.out.println("subtract= " + calculator.getSubtractionResult());
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0);
		System.out.println("multiply= " + calculator.getMultiplicationResult());
		System.out.println("divide= " + calculator.getDivisionResult());

	}

}
