package com.java;

public class EjercicioTeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(hasTeen(9, 99, 19));
		System.out.println(hasTeen(23, 15, 42));
		System.out.println(hasTeen(22, 23, 34));
		System.out.println(hasTeen(-19));
		

	}
	
	
	public static boolean hasTeen (int x, int y, int z) {
		boolean t = x >= 13 && x <= 19 || y >= 13 && y <= 19 || z >= 13 && z <= 19 ? true : false;
		return t;
		
	}
	
	
	public static boolean hasTeen (int x) {
		boolean t = x >= 13 && x <= 19 ?  true: false;
		return t;
		
	}
	

}
