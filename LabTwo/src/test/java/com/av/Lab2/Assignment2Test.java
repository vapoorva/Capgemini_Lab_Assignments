package com.av.Lab2;

import static org.junit.Assert.*;


import org.junit.Test;

public class Assignment2Test {
	Assignment2 object = new Assignment2();
	String [] input = {"apoorva","aaraya","cat","bag","elephant"};

	@Test(expected = RuntimeException.class)
	public void TestSortStrings_GivenNoInput_ShouldReturnNoInputException() {
		String [] input = {};
		String [] result = object.sortStrings(input);
			assertEquals(0, result);
		
		
	}
	
	@Test
	public void TestSortStrings_Given1StringAsInput_ShouldReturn1StringInUpperCase() {
		String [] input = {"apoorva"};
		
			String [] result = object.sortStrings(input);
			assertEquals("APOORVA", result[0]);
		
	}
	
	@Test
	public void TestSortStrings_GivenAnyNumberOfStringAsInput_ShouldReturnHalfStringsInUpperCaseAndOtherInLowerCase() 
	{
		    
			String [] result =object.sortStrings(input);
			String[] expected = {"AARAYA","APOORVA","BAG","cat","elephant"};
			assertArrayEquals(expected, result);
	}


}
