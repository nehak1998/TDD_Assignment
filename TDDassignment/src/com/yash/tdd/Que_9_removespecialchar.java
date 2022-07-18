package com.yash.tdd;

public class Que_9_removespecialchar {
	public static String removeChar(String str) {  
		str = str.replaceAll("[@$]", " "); 
		str = str.replaceAll("[-]", ""); 
		return str;
	}
}
