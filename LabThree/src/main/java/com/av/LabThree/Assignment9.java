package com.av.LabThree;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * @author Ap00rva
 * Date:10/1/2021
 * accept date and print the duration in days, months and years 
 * with regards to current system date
 */
public class Assignment9 {
	private static void dateDifference(LocalDate userDate)
	{
		LocalDate current = LocalDate.now();//current date
		Period difference = Period.between(userDate, current);//compare the dates
		System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                difference.getYears(), difference.getMonths(), difference.getDays());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//take input from user in dd/mm/yyyy format
		String[] date = sc.next().split("/"); //split the input based on /
		int year,month,day;
		day = Integer.parseInt(date[0]);//store day month year in different variables 
		month = Integer.parseInt(date[1]);
		year = Integer.parseInt(date[2]);
		
		LocalDate userDate = LocalDate.of(year,month,day);//convert user input to localDate fromat
		dateDifference(userDate);
	}
}
