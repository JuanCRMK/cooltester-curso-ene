package com.java;

public class EjercicioGato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isCatPlaying(true, 10));
		System.out.println(isCatPlaying(false, 36));
		System.out.println(isCatPlaying(false, 35));
		System.out.println(isCatPlaying(true, 45));

	}

	public static boolean isCatPlaying(boolean verano, int temperatura) {
		boolean x = false;
		if (verano == true && temperatura >= 25 && temperatura <= 45) {
			x = true;
		} else if (verano == false && temperatura >= 25 && temperatura <= 35) {
			x = true;
		} else {
			x = false;
		}

		return x;
	}

}
