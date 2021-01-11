package com.av.LabThree;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment2Test {
	Assignment2 object = new Assignment2();
	String char_Input= "a";
	String char_Expected ="a|a";
	String STRING_EXPECTED = "waseem|meesaw";
	String STRING_INPUT = "waseem";

	@Test
	public void TestgetImage_GivenNoInput_ShouldReturnWhiteSpace() {
		String input= "";
		String result = object.getImage(input);
		assertEquals("", input);
		
	}
	
	@Test
	public void TestgetImage_GivenSingleCharacterAsInput_ShouldReturn2CharacterOutputSeperatedPipeline() {

		String result = object.getImage(char_Input);
		assertEquals(char_Expected, result);
		
	}
	
	@Test
	public void TestgetImage_GivenStringAsInput_ShouldReturnStringPipelineReverseString() {
		String result = object.getImage(STRING_INPUT);
		assertEquals(STRING_EXPECTED, result);
	}

}
