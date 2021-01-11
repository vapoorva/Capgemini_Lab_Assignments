package com.av.LabThree;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment8Test {
	Assignment8 object = new Assignment8();

	@Test
	public void TestpositiveString_GivenEmptyString_ShouldGiveFalse() {
		String input = "";
		boolean expected = false;
		boolean result = object.positiveString(input);
		assertEquals(expected, result);
	}
	
	@Test
	public void TestpositiveString_GivenSingleChar_ShouldGiveFalse() {
		String input = "A";
		boolean expected = false;
		boolean result = object.positiveString(input);
		assertEquals(expected, result);
	}
	
	@Test
	public void TestpositiveString_GivenString_ShouldGiveTrueIfPositiveString() {
		String input = "ANTx";
		boolean expected = true;
		boolean result = object.positiveString(input);
		assertEquals(expected, result);
	}
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

}
