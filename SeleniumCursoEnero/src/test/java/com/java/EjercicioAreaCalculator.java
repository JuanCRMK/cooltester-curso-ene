package com.java;

public class EjercicioAreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(area(5.0));
		System.out.println(area(-1));
		System.out.println(area(5.0,4.0));
		System.out.println(area(-1,4.0));



	}
	
	public static double area(double radius) {
		boolean r = radius >= 0 ? true : false;
		double a;
		if(r == true) {
			a = radius * radius * Math.PI;
			return a;
		}else {
			a = -1.00;
			return a;
		}
	}
	
	public static double area(double x, double y) {
		boolean r = x >= 0 && y >=0 ? true : false;
		double a;
		if(r == true) {
			a = x * y;
			return a;
		}else {
			a = -1.00;
			return a;
		}
		
	}

}
