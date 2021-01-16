package com.cg.eis.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.InvalidDesignationException;
import com.cg.eis.exception.InvalidIdException;

/**
 * @author Ap00rva
 *  Date :14/1/2021
 */
public class EmployeeServiceImpl implements EmployeeService{

	List<HashMap<String, String>> employeesList = new ArrayList<>() ;

	
	public EmployeeServiceImpl() {
			
	}


	@Override
	public void getDetails(int id, String name, double salary,String designation, String Insurance) {
		HashMap<String, String> employee = new HashMap<>();
		Employee emp = new Employee(id, name, salary,designation,Insurance);
	
		employee.put("Id", String.valueOf(emp.getId()));
		employee.put("Name", emp.getName());
		employee.put("Salary", String.valueOf(emp.getSalary()));
		employee.put("Designation",emp.getDesignation());
		employee.put("Insurnce", emp.getInsuranceScheme());

		employeesList.add(employee);
		
	}

	@Override
	public void findInsuranceScheme(String designation) throws InvalidDesignationException{
		if(designation.equalsIgnoreCase("clerk"))
		{
			System.out.println("Hello You Have No Insurance Scheme and Your Salary is less than 5000");
		}
		else if(designation.equalsIgnoreCase("manager") )
		{
			System.out.println("Hello You Have Insurance SchemeA and Your Salary is greater than or equal to 40,000");
		}
		else if(designation.equalsIgnoreCase("Programmer") )
		{
			System.out.println("Hello You Have Insurance SchemeB and Your Salary is greater than 20,000 and less than 40,000");
		}
		else if(designation.equalsIgnoreCase("System Associate"))
		{
			System.out.println("Hello You Have Insurance SchemeC and Your Salary is greater thanc5000cand less than 20,000");

		}
		else
			throw new InvalidDesignationException("You Have Given Wrong Designation");
		
	}

	@Override
	public List<HashMap<String, String>> findAll() {
		return employeesList;
	}


	@Override
	public void deleteEmployeeDetails(int id) throws InvalidIdException{
		if(!employeesList.removeIf(HashMap-> HashMap.containsValue(String.valueOf(id))))
		{
			throw new InvalidIdException("You have given a wrong Id");
		}
	}

}
