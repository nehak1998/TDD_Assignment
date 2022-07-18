package com.yash.junit.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.Que_2_palindromestring;

public class Que_2_plindromstringTest {

	@Test
	public void test() {
		assertEquals(true,Que_2_palindromestring.isPalindrome("nitin"));
	}
	@Test
	public void test1() {
		assertEquals(false,Que_2_palindromestring.isPalindrome("Nitin"));
	}

}
