/**
 * @author Ap00rva
 * Date:8/1/2021
 * accepts an integer array, reverse the numbers in the 
 * array and returns the resulting array in sorted order
 */
package com.av.Lab2;

import java.util.Arrays;

public class Assignment3 {

	public int[] getSorted(int[] n)
	{
		int length = n.length;
		int result[] = new int[length];
		 StringBuilder digit = new StringBuilder();
		 
		if(n.length==0)
		{
			throw new RuntimeException("Empty Exception");
		}
		
		else if(n.length==1)
		{
			digit.append(n[0]);
			digit.reverse();
			result[0]=Integer.parseInt(digit.toString());
			return result;
		}
		
		else 
		{
			for(int i =0;i<length;i++)
			{
				digit.append(n[i]);
				digit.reverse();
				result[i]=Integer.parseInt(digit.toString());
				digit.delete(0,digit.length());
			}
			
		Arrays.sort(result);
		return result;
		}
		
		
	}
}
