package com.av.LabThree;

import java.util.Scanner;

/**
 * @author Ap00rva Date: 11/1/2021 Java program that displays the number of
 *         characters, lines and words in a text?
 */

public class Assignment5 {

	private static int characterCount = 0;
	private static int wordCount = 0;
	private static int lineCount = 0;
	private static void countLineWordChracter(String text) 
	{
		String[] textArray = text.split(" ");// split the line and store only words
		wordCount += textArray.length; // this gives the number of words present in the line
		
		for (String string : textArray) 
		{
			char charArray[] = string.toCharArray();//take single word and convert to character array
			characterCount += charArray.length;//add character array's length to character count
		}
		lineCount++;//line count increases in every function call
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String text;
		while (true) //take input from user until there is a empty line
		{
			text = sc.nextLine();
			if (text.equals("")) //in empty line break the loop
			{
				break;
			}
			countLineWordChracter(text);//function call to count line words characters

		}
		
		System.out.println("Total Words in the input text are: " + wordCount + " \n Total Characters are: "
				+ characterCount + "\n Total Lines are : " + lineCount);
		sc.close();
	}

}
