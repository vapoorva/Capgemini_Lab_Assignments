/**
 * Author : Apoorva 
 * Date: 8/1/2021
 * accepts an array of integer elements and return the second smallest element in the array
 */
package com.av.Lab2;

import java.util.Arrays;


public class Assignment1 {
	
	public int getSecondSmallest(int [] n)
	{
		int length = n.length;
		
		if(length==1)//check if the array has only 1 element
			{
				return n[0];
			}
		
		else if(length==2)//check if array has 2 elements
			{
				return Math.max(n[0], n[1]);//return max no. from both the elemnets
			}
		
		else if(length>2)//if there are more than 2 elements in array
			{
				Arrays.sort(n);//sort array in ascending
				return n[1];//return second element of array
			}
		return 0;
	}

}
