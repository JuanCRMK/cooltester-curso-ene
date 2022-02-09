package com.java;

public class BarkingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
//		System.out.println(shouldWakeUp(true, 1));
//		System.out.println(shouldWakeUp(false, 2));
//		System.out.println(shouldWakeUp(true, 8));
//		System.out.println(shouldWakeUp(true, -1));
//		System.out.println(shouldWakeUp(true, 22));
//		System.out.println(shouldWakeUp(true, 23));
		System.out.println(shouldWakeUp(true, 22));


	}

	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		boolean x = false;
		if (barking == true && hourOfDay > 0 && hourOfDay <= 23) {
			x = true;
			if (barking == true && hourOfDay < 8 || hourOfDay >= 22) {
				x = true;
			} else {
				x = false;
			}

		}
		return x;
	}
}
