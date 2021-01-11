package com.av.LabThree;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment1Test {
	Assignment1 object = new Assignment1();
	String STRING_INPUT = "20 30 60 10";
	int STRING_EXPECTED = 120;
	

	@Test
	public void testTokenizer_GivenNoInput_ShouldReturnNull() {
		String input= "";
		int expected= 0;
		int result = object.Tokenizer(input);
		assertEquals(expected,result);
	}
	
	@Test
	public void TestTokenizer_GivenSingleIntegerAsInput_ShouldReturnTheInteger()
	{
		String input ="20";
		int expected= 20;
		int result = object.Tokenizer(input);
		assertEquals(expected,result);
	}
	
	@Test
	public void TestTokenizer_GivenNIntegerAsInput_ShouldReturnTheInteger()
	{
		
		
		int result = object.Tokenizer(STRING_INPUT);
		assertEquals(STRING_EXPECTED,result);
	}
	
	

}
