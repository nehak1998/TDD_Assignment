package com.yash.junit.testcase;

import static org.junit.Assert.*;
import com.yash.tdd.*;
import com.yash.tdd.Que_3_email_pass;

import org.junit.Test;



public class Que_3_email_passTst {

	@Test
	public void test() {
		assertEquals(true,Que_3_email_pass.checkEmailandPassword("neha@gmail.com", "neha123"));
	}

}
