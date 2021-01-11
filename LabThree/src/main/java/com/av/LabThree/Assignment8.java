package com.av.LabThree;

import java.util.Arrays;

/**
 * @author Ap00rva
 *
 */
public class Assignment8 {

	public boolean positiveString(String input) {
		// TODO Auto-generated method stub
		if(input.length()>1)
		{
			char charArray[] = input.toCharArray();
		      Arrays.sort(charArray);
		     
		      if(input.equalsIgnoreCase(new String(charArray)))
		      	return true;
		      
		      	else
		    	  return false;
		}
		return false;
	}

}
