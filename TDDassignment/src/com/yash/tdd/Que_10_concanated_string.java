package com.yash.tdd;

public class Que_10_concanated_string {
	public static String concatString(String s[]) {
		String s1="";
		
		int a = s.length-1;
		for(int i = 0;i<s.length;i++) {
			if(i==a)
				s1 =s1+s[i];
			else
				s1 =s1+s[i]+"-";
		}
		return s1;
	}
}
