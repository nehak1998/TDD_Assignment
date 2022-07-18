package com.yash.tdd;

public class Que_5_pythagorasTemplate {
	public static boolean pythagoras(int a, int b,int c) {
		
		if (a * a + b * b == c * c ||
	            a * a + c * c == b * b ||
	            b * b + c * c == a * a)
			return true;
	           
	    else
	    	return false;
	}
}