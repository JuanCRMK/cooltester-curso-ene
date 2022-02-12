package com.java;

public class EjercicioDecimales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(areEqualByThreeDecimalPlaces(1.23, 1.23));

	}

	public static boolean areEqualByThreeDecimalPlaces(double n1, double n2) {

		n1 = n1 * 1000;  // se multiplica por 1000 para recorerr los 3 decimales que necitamos evaluar

		n2 = n2 * 1000;

		n1 = (int) n1;  //

		n2 = (int) n2;

		// if(n1==n2) {

		// return true;

		// }else {

		// return false;

		// }

		return n1 == n2 ? true : false;  //obtenemos y retornamos el resultado con el operador "Ternary"

	}

}
