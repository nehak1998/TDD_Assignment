package com.yash.junit.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.Que_15_item;

public class Que_15_itemTest {

	@Test
	public void test() throws Exception {
		assertEquals(true,Que_15_item.checkItem(111,"milk",20,25.50,"29/06/2022","30/06/2022"));
	} 

}
