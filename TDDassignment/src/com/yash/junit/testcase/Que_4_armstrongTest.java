package com.yash.junit.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.Que_4_armstrong;

public class Que_4_armstrongTest {

	@Test
	public void test() {
		 assertEquals(true,Que_4_armstrong.armnumber(153));
	}
	@Test
	public void test1() {
		assertEquals(true,Que_4_armstrong.armnumber(23));
	}
}


