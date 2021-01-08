package com.av.Lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment1Test {
	Assignment1 object = new Assignment1();
	private int[] ARRAY = {1,6,5,3,7,9};
	

	@Test
	public void getSecondSmallest_GivenEmptyArray_ShouldReturn0Integer() {
		int [] array = {};
		int result = object.getSecondSmallest(array);
		assertEquals(0, result);
	}
	
	@Test
	 public void getSecondSmallest_Given1asInput_ShouldReturn1asInteger() {
		int[] array = {1};
		 int result = object.getSecondSmallest(array);
		 assertEquals(1, result);
		
	}
	
	@Test
	public void getSecondSmallest_Given1and2asInput_ShouldReturn2asInteger() {
		// TODO Auto-generated method stub
      int[]  array = {1,2};
      int result = object.getSecondSmallest(array);
      assertEquals(2, result);
	}
	
	@Test
	public void getSecondSmallest_GivenIntegerAsInput_ShouldReturnSecondSmallestNumberasInteger()
	{
		 int result = object.getSecondSmallest(ARRAY);
	      assertEquals(3, result);
	}
	

}
