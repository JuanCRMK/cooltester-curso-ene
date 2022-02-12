package com.java;

public class EjercicioSumOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isOdd(9));
		System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(100, 100));
		System.out.println(sumOdd(13, 13));
		System.out.println(sumOdd(100, -100));
		System.out.println(sumOdd(100, 1000));

	}

	public static boolean isOdd(int numero) {

		if (numero > 0 && numero % 2 == 1) {
			return true;
		} else {
			return false;
		}

	}

	public static int sumOdd(int start, int end) {
		int sum = 0;

		if (start > 0 && end > 0 && end >= start) {

			for (int i = start; i <= end; i++) {
				if (isOdd(i) == true) {
					sum = sum + i;
				}

			}
		} else {
			sum = -1;
		}

		return sum;
	}

}
