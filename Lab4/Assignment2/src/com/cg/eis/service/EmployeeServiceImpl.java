package com.cg.eis.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.Employee;

/**
 * @author Ap00rva
 *  Date :14/1/2021
 */
public class EmployeeServiceImpl implements EmployeeService{

	List<Employee> employeesList = new ArrayList<>() ;

	
	public EmployeeServiceImpl() {
			
	}


	@Override
	public void getDetails(int id, String name, double salary,String designation, String Insurance) {
		Employee emp = new Employee(id, name, salary,designation,Insurance);
		employeesList.add(emp);
		
	}

	@Override
	public void findInsuranceScheme(String designation , double salary) {
		if(designation.equalsIgnoreCase("developer") && (salary<50000))
		{
			System.out.println("Hello the Recommended insurance scheme is AA1");
		}
		else if(designation.equalsIgnoreCase("HR") && salary<100000)
		{
			System.out.println("Hello the Recommended insurance scheme is AA2");
		}
		else if(designation.equalsIgnoreCase("Team Leader") && salary <150000)
		{
			System.out.println("Hello the Recommended insurance scheme is AA2");
		}
		
		
	}

	@Override
	public List<Employee> findAll() {
		return employeesList;
	}

}
