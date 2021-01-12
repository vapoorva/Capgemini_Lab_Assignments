/**
 * @author Ap00rva
 * Date :12/1/2021
 * validate age full name and salary of a person
 * age >15
 * first name , last name not to be empty
 * salary>3000
 */
package com.cg.eis.main;

import com.cg.eis.employee.EmployeeInfo;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.exception.EmptyNameException;
import com.cg.eis.exception.InvalidAgeException;


public class EmployeeTest {
	public static void main(String[] args) {
		EmployeeInfo employee = new EmployeeInfo();
		try 
		{
			employee.setAge(20);
			employee.setName("Apoorva Verma");
			employee.setSalary(5000);
			System.out.println(employee);
		} 
		catch (InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		} 
		
		catch (EmptyNameException e) 
		{
			System.out.println(e.getMessage());
		} 
		
		catch (EmployeeException e) 
		{
			System.out.println(e.getMessage());
		}

	}

}
