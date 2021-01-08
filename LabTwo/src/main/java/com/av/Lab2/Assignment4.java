/**
 * @author Ap00rva
 * Date; 8/1/2021
 * accepts an integer array and removes all the duplicates in the array. 
 * Return the resulting array in descending order
 */

package com.av.Lab2;
import java.util.Scanner;
import java.util.TreeSet;


public class Assignment4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 String string = sc.nextLine();
		String stringArray[] = string.split(" ");
		TreeSet<Integer> sortedArray=new TreeSet<Integer>();
		for(String i: stringArray)
		{
			sortedArray.add(Integer.parseInt(i));
		}
		sortedArray = (TreeSet<Integer>)sortedArray.descendingSet();
		for (int i : sortedArray)
		{
			System.out.print(i+" ");
		}
		sc.close();
	}

}
