package com.yash.junit.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.Que_1_HCF;

public class Que_1_HCFTest {

	@Test
	public void test() {
		assertEquals(4,Que_1_HCF.HCF(12,16));
	}

}
