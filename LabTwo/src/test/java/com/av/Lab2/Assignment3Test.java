package com.av.Lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment3Test {
	Assignment3 object = new Assignment3();
	int[] input = {31,23,21,87,54};

	@Test(expected = RuntimeException.class)
	public void TestgetSorted_GivenInputEmptyArray_ShouldReturn0AsAInteger() {
		int[] input = {};
		int[] result = object.getSorted(input);
		assertArrayEquals(input, result);
	}
	
	@Test
	public void TestgetSorted_Given1InputInArray_ShouldReturnInputReversed() {
		int[] input = {21};
		int[] expected= {12};
		int[] result = object.getSorted(input);
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void TestgetSorted_GivenNIntegersInputInArray_ShouldReturnArrayReversedAndSorted()
	{
		int[] expected= {12,13,32,45,78};
		int[] result = object.getSorted(input);
		assertArrayEquals(expected, result);
	}

}
