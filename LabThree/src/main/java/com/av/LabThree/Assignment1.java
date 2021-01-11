/**
 * @author Ap00rva
 *Date:9/1/2021
 *reads a line of integers and then displays each 
 *integer and the sum of all integers. (Use String Tokenizer class)?
 */
package com.av.LabThree;

import java.util.StringTokenizer;

public class Assignment1 {
	

	public int Tokenizer(String input) {
	 StringTokenizer stringTokenizer = 
     new StringTokenizer(input , " "); //store integers in the string tokenizer
		int result =0;
		
		if(stringTokenizer.countTokens()==1)//if only 1 integer present in input
		{
			result = Integer.parseInt(input);
			return result;
		}
		
		else if(stringTokenizer.countTokens()>1)//if more than 1 integer in input
		{
			while (stringTokenizer.hasMoreTokens()) 
				{
				    result = result +Integer.parseInt(stringTokenizer.nextToken());//add integer to result to get sum
				}
			return result;
				
		}

			

		
			return 0;
		
		
	}
	

}
