package com.yash.junit.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.Que_9_removespecialchar;

public class Que_9_removespecialcharTest {

	@Test
	public void test() {
		assertEquals("This Red car.",Que_9_removespecialchar.removeChar("This@Red$car-."));
	}

}
