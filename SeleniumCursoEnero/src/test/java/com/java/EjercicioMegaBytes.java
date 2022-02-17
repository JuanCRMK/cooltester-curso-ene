package com.java;

public class EjercicioMegaBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		printMegaBytesAndKiloBytes(2500);
//		printMegaBytesAndKiloBytes(-1024);
		printMegaBytesAndKiloBytes(5000);
//		printMegaBytesAndKiloBytes(1000);



	}
	
	public static void printMegaBytesAndKiloBytes(int x){
		int y = 0;
		int resto = 0;
		
		
		if(x < 0){
			System.out.println("Invalid Value");
		}
		else{
			y = x / 1024;
			resto = x % 1024;
			System.out.println(x + " KB "+ "= "+ y + " MB " + "and "+resto + " KB");
		}
	}

}
