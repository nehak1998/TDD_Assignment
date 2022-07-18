package com.yash.junit.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.Que_7_palindromnumber;

public class Que_7_palindromenumberTest {

	@Test
	public void test() {
		assertEquals(true,Que_7_palindromnumber.ispalidrome(121));  
	}
	@Test
	public void test1() {
		assertEquals(true,Que_7_palindromnumber.ispalidrome(100));  
	}
}
