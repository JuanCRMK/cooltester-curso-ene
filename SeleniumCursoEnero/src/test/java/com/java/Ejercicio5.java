package com.java;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Ingresa un número: ");
		
		num = reader.nextInt();
		
		//evaluamos el número
		if (num < 0) {
			System.out.println("El número ingresado es negativo");
		} else if( num == 0){
			System.out.println("El número es cero");
		}else {
			System.out.println("El número ingresado es positivo");
		}
		
		if (num % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
		
		

	}

}
