package com.java;

public class SimpleCalculator {
	double firstNumber;
	double secondNumber;
	
	public double getFirstNumber() {
		return firstNumber;
	}
	
	public double getSecondNumer() {
		return secondNumber;
		
	}
	
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public double getAdditionResult() {
		double x = firstNumber + secondNumber;
		return x;
	}
	
	public double getSubtractionResult() {
		double x = firstNumber - secondNumber;
		return x;
	}
	
	public double getMultiplicationResult() {
		double x = firstNumber * secondNumber;
		return x;
	}
	
	public double getDivisionResult() {
		double x = secondNumber == 0 ? 0 : firstNumber / secondNumber;
		return x;
	}

}
