package com.yash.junit.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.Que_8_evenno;

public class Que_8_evenTest {

	@Test
	public void test() {
		assertTrue(Que_8_evenno.checkEvenArray(new int[] {12,2,3,45,6},2));
	}

}
