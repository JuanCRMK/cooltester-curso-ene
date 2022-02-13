package com.java;

public class EjercicioAnoBisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(isLeapYear(-1600));
//		System.out.println(isLeapYear(1600));
//		System.out.println(isLeapYear(2017));
//		System.out.println(isLeapYear(2000));
		System.out.println(isLeapYear(2088));
		
		System.out.println(getDaysInMonth(1, 2020));
		System.out.println(getDaysInMonth(2, 2020));
		System.out.println(getDaysInMonth(2, 2018));
		System.out.println(getDaysInMonth(-1, 2020));
		System.out.println(getDaysInMonth(1, -2020));

	}

	public static boolean isLeapYear(int year) {

		boolean x = year >= 1 && year <= 9999 ? true : false;

		if (x == true) {

			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				return x;
			} else {
				x = false;
				return x;
			}
		} else {
			return x;
		}
	}

	public static int getDaysInMonth(int month, int year) {
		boolean x = month < 1 || month > 12 || year < 1 || year > 9999 ? false : true;
		int r = -1;
		if (x == true) {
			switch (month) {

			case 1:
				r = 31;
				return r;
			case 2:
				if (isLeapYear(year) == true) {
					r = 29;
					return r;

				} else {
					r = 28;
					return r;
				}
			case 3:
				r = 31;
				return r;
			case 4:
				r = 30;
				return r;
			case 5:
				r = 31;
				return r;
			case 6:
				r = 30;
				return r;
			case 7:
				r = 31;
				return r;
			case 8:
				r = 31;
				return r;
			case 9:
				r = 30;
				return r;
			case 10:
				r = 31;
				return r;
			case 11:
				r = 30;
				return r;
			case 12:
				r = 31;
				return r;
			}
		} else {
			r = -1;
			return r;
			
		}
		return r;
	}

}
