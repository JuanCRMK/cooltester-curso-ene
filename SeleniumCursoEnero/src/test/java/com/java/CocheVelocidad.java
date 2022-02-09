package com.java;

public class CocheVelocidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int velocidadActual = 40; // KM*H
		String lugar = "carretera";

		velocidad(lugar, velocidadActual);

	}

	public static void velocidad(String lugar, int velocidadActual) {
		int zonaEscolar = 20;
		int calle = 40;
		int carretera = 80;
		String a = "Carretera";
		String b = "Calle";
		String c = "Escolar";

		if (c.equalsIgnoreCase(lugar) && velocidadActual <= zonaEscolar) {
			System.out.println("La velocidad en la que te encuentras es la permitida para: " + c);
		} else if (c.equalsIgnoreCase(lugar) && velocidadActual > zonaEscolar) {
			System.out.println("Exceso de velocidad para: " + c);

		} else {
			System.out.println("Vas muy lento para: " + lugar);

		}

		if (a.equalsIgnoreCase(lugar) && velocidadActual <= carretera) {
			System.out.println("La velocidad en la que te encuentras es la permitida para: " + a);
		} else if (a.equalsIgnoreCase(lugar) && velocidadActual > carretera) {
			System.out.println("Exceso de velocidad para: " + a);

		} else {
			System.out.println("Vas muy lento para: " + lugar);

		}

	}

}
