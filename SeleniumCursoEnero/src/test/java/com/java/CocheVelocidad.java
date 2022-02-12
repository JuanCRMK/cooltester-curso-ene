package com.java;

public class CocheVelocidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int velocidadActual = 20; // KM*H
		String lugar = "escolar";

		velocidad(lugar, velocidadActual);

	}

	public static void velocidad(String lugar, int velocidadActual) {
		int zonaEscolar = 20; // 0 a 20 km * hr
		int calle = 40; // 21 a 40 km * hr
		int carretera = 80; // 41 a 80 km * hr
		String a = "Escolar";
		String b = "Calle";
		String c = "Carretera";

		if (c.equalsIgnoreCase(lugar) && velocidadActual > 0 && velocidadActual <= calle) {
			System.out.println("La velocidad en la que te encuentras es muy lenta para : " + c);
		} else if (c.equalsIgnoreCase(lugar) && velocidadActual >= calle && velocidadActual <= carretera) {
			System.out.println("La velocidad en la que te encuentras es la permitida para: " + c);

		} else if (c.equalsIgnoreCase(lugar) && velocidadActual >= carretera) {
			System.out.println("Exceso de velocidad para: " + lugar);

		}

		if (b.equalsIgnoreCase(lugar) && velocidadActual > 0 && velocidadActual <= zonaEscolar) {
			System.out.println("La velocidad en la que te encuentras es muy lenta para: " + b);
		} else if (b.equalsIgnoreCase(lugar) && velocidadActual > zonaEscolar && velocidadActual <= calle) {
			System.out.println("La velocidad en la que te encuentras es la permitida para: " + b);

		} else if (b.equalsIgnoreCase(lugar) && velocidadActual > calle) {
			System.out.println("Exceso de velocidad para: " + lugar);

		}

		if (a.equalsIgnoreCase(lugar) && velocidadActual > 0 && velocidadActual <= zonaEscolar) {
			System.out.println("La velocidad en la que te encuentras es la permitida para: " + a);
		} else if (a.equalsIgnoreCase(lugar) && velocidadActual > zonaEscolar) {
			System.out.println("Exceso de velocidad para: " + a);

		}

	}

}
