package com.yash.junit.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.Que_4_armstrong;
import com.yash.tdd.Que_5_pythagorasTemplate;

public class Que_5_pythagorasTemplateTest {

	@Test
	public void test() {
		assertEquals(true,Que_5_pythagorasTemplate.pythagoras(6,8,10));
	}
	@Test
	public void test1() {
		assertEquals(true,Que_5_pythagorasTemplate.pythagoras(3,8,10));
	}

}
