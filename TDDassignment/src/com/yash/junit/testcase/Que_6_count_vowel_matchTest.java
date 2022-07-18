package com.yash.junit.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.Que_6_count_vowel_match;

public class Que_6_count_vowel_matchTest {

	@Test
	public void test() {
		assertEquals(true,Que_6_count_vowel_match.vowelCount("Neha"));
	}
	@Test
	public void test1() {
		assertEquals(true,Que_6_count_vowel_match.vowelCount("Om"));
	}

}
