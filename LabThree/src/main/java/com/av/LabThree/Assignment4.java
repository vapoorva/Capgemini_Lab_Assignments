/**
 * @author Ap00rva
 * Date : 111/1/2021
 * Create a method that accepts a number and modifies it such that the each of the digit 
 * in the newly formed number 
 * is equal to the difference between two consecutive digits in the original number.
 */
package com.av.LabThree;

import java.util.Scanner;

public class Assignment4 {
	private static void modifyNumber(int number) {
		
		StringBuffer Sb = new StringBuffer();
		String string_Number = Integer.toString(number);//convert number to string 
		for(int i =0;i<string_Number.length();i++)
		{
		    if(i==string_Number.length()-1)//if units digit append as it is
		    	Sb.append(string_Number.charAt(i));
		    else
		    {
			int a = string_Number.charAt(i);
			int b = string_Number.charAt(i+1);
			Sb.append(Math.abs(a-b));//push abs diff of 2 numbers obtained
		    }
		}
		System.out.println(Integer.valueOf(Sb.toString()));
		
		
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		modifyNumber(number);
		sc.close();
	}

}
