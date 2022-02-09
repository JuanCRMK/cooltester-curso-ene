package com.java;

public class VerificadorNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		verificadorNumeros(1, 1, 1);
		verificadorNumeros(1, 1, 2);
		verificadorNumeros(-1, -1, -1);
		verificadorNumeros(1, 2, 3);


	}
	
	public static void verificadorNumeros(int x, int y, int z){
		if(x < 0 || y < 0 || z<0){
			System.out.println("Valor no válido");
		}else if(x == y && y == z){
			System.out.println("Todos los números son iguales");
		}else if(x!= y && y!= z && x!=z){
			System.out.println("Todos los números son diferentes");
		}else{
			System.out.println("Ni todos son iguales ni diferentes");
		}
	}

}
