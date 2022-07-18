package com.yash.junit.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.Que_11_singletone;

public class Que_11_singletoneTest {

	@Test
	public void test() {
		Que_11_singletone instance1 = Que_11_singletone.getInstance();
		Que_11_singletone instance2 = Que_11_singletone.getInstance();
	     System.out.println("checking singleton objects equality");
	     assertEquals(true, instance1==instance2);

	}

}
