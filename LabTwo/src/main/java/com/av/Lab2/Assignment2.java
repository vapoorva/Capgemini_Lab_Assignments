/**
 * Author Apoorva
 * Date: 8/1/2021
 * accept an array of String objects and sort in alphabetical order. The elements in the left half 
 * should be completely in uppercase and the elements in the right half should be completely in lower case
 */

package com.av.Lab2;

import java.util.Arrays;


public class Assignment2 {

	public String[] sortStrings(String[] string)  {
		int length = string.length;
		String result[] = new String[length];
		
		if(length==0)
		{
			throw new RuntimeException("No Input Array");//give exception of no input
		}
		
		else if(length==1)
		{
				result[0]=string[0].toUpperCase();//if only 1 input change it to uppercase
				return result;
		}
		
		else 
		{
			Arrays.sort(string);//sort array in ascending order
			for(int i =0;i<length ; i++)
			{
				if(length%2==0)//even number of inputs
					{
						if(i<length/2)//for left side of elements convert to uppercase
						{
						result[i]=string[i].toUpperCase();
					    }
					    else //for left side of elements convert to lowercase
						result[i]=string[i].toLowerCase();
			        }
				else
				{
					if(i<length/2+1)// for odd numbers of input
					{
						result[i]=string[i].toUpperCase();
					}
					else
						result[i]=string[i].toLowerCase();
				}
		}
		
				
		return result;
	}

}
}
