package com.yash.tdd;

public class Que_8_evenno {
	public static boolean checkEvenArray(int a[],int b) {
		boolean c=false;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b && b % 2 == 0) {
				c=true;

			} 
		}return c;
		
	}
}
