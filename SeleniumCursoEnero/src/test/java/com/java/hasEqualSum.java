package com.java;

public class hasEqualSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(hasEqualSum2(1,2,1));
		System.out.println(hasEqualSum2(2,3,5));
		

	}
	
	public static boolean hasEqualSum2(int x, int y, int z){
		boolean a = false;
		
		if(z == (x+y)){
			a = true;
		}else{
			a = false;
		}
		
		return a; 
		
	}

}
