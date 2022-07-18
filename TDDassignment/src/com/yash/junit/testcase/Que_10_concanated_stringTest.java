package com.yash.junit.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.Que_10_concanated_string;

public class Que_10_concanated_stringTest {

	@Test
	public void test() {
		assertEquals("Apple-orange-banana-lemon",Que_10_concanated_string.concatString(new String[]{"Apple", "orange","banana","lemon"}));
	}

}
