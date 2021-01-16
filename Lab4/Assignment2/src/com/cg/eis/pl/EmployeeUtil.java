package com.cg.eis.pl;

import java.util.List;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

/**
 * @author Ap00rva
 *  Date :14/1/2021
 */
public class EmployeeUtil {
	private EmployeeService service;
	private int id;
	private double salary;
	private String name,desgn,insurance;

	public EmployeeUtil() {
		service  = new EmployeeServiceImpl();
	}
	
	public void start() {
		Scanner sc=new Scanner(System.in);
		int choice;
		String contChoice;
		do {
			showmenu();
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Employee Id:");
				 id = sc.nextInt();
				
				System.out.println("Enter Employee Name:");
				 name = sc.next();
				
				System.out.println("Enter Employee Salary:");
				 salary = sc.nextDouble();
				
				System.out.println("Enter Employee Designation:");
				 desgn = sc.next();
				
				System.out.println("Enter Employee Insurance scheme:");
				 insurance = sc.next();
				 
				service.getDetails(id, name,salary, desgn, insurance);
				System.out.println("Employee Sucessfully Registerd!");
				
				break;
				
			case 2:
				System.out.println("Enter Employee Designation:");
				desgn = sc.next();
				
				System.out.println("Enter Employee Salary:");
				 salary = sc.nextDouble();
				 
				 service.findInsuranceScheme(desgn,salary);
		
				
			case 3: List<Employee> allEmployees= service.findAll();
					for (Employee employee : allEmployees) {
							System.out.println(employee);
						}
					break;
			
			
			case 0:
				System.out.println("------0. Exit--------");	
				System.exit(0);
				break;
					

			default: System.out.println("Wrong Choice!");
				break;
			}
			System.out.println("Do You Want To Continue");
			contChoice = sc.next();
			
		}while(contChoice.equalsIgnoreCase("yes"));
		
		sc.close();
	}
	
	public void showmenu()
	{
		System.out.println("----------Employee Service------------");
		System.out.println("1. Add Employee");
		System.out.println("2. Insurance Scheme(Designation , Salary)");
		System.out.println("3. All Employee Details");
		System.out.println("0. Exit");
	}
	

}
