package com.yash.tdd;

public class Que_11_singletone {
	
	private static  Que_11_singletone singletonInstance = new Que_11_singletone();

    private Que_11_singletone() {

    }

	public static Que_11_singletone getInstance() {
		// TODO Auto-generated method stub
		return singletonInstance;
	}

}
