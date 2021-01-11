/**
 * @author Ap00rva
 *Date:9/1/2021
 *The method should return the two Strings 
 *separated with a pipe(|) symbol
 */
package com.av.LabThree;
public class Assignment2 {

	public String getImage(String input) {
		
		if(input.length()==1)//if single character input 
		{
			return input+"|"+input;
		}
		
		else if(input.length()>1)//string length more than 1
		{
			StringBuilder str 
            = new StringBuilder(input);
			
			String Mirror= str.reverse().toString(); // reverse string builder
			return (input+"|"+Mirror);
		}
		return null;
	}

}
