package com.java;

import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = 88;
		int codigoPostal = 0;
		double altura = 1.77;
		char genero = 'H';
		String nombre = "nombre";    
		int numeroDeHijos = 2;
		int iva = 16;
		int tallaCamisa = 38;
		double peso = 85.5;
		double precio = 55.4;
		boolean alumnoRepetidor = true;
		String mensaje = "mensaje texto";
		char letra = 'a';
		boolean mayorEdad = true;
		int minutos = 60;
		int dias = 365;
		String matriculaCoche = "RTY678";
		int contador = 1;
		List tallaCamiseta = new ArrayList();
		tallaCamiseta.add("S");
		tallaCamiseta.add("L");
		tallaCamiseta.add("XL");

		System.out.println(tallaCamiseta);
		System.out.println("edad "+edad+"CP "+codigoPostal+"Altura "+altura+"Genero "+genero+"Nombre "+nombre
				+"Hijos "+numeroDeHijos+"IVA "+iva+"Talla Camisa"+tallaCamisa+"Peso "+peso+"Precio "+precio
				+"Repartidor "+alumnoRepetidor+"Mensaje "+mensaje+"Letra "+letra+"Mayor de Edad "+mayorEdad
				+"Minutos "+minutos+"Días "+dias+"Matricula "+matriculaCoche+"Contador "+contador);
	}

}
