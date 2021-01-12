package com.cg.eis.employee;

import com.cg.eis.exception.EmployeeException;
import com.cg.eis.exception.EmptyNameException;
import com.cg.eis.exception.InvalidAgeException;

public class EmployeeInfo {

	private int age;
	private String name;
	private double salary;

	public EmployeeInfo() {
	}

	public void setAge(int age) throws InvalidAgeException {
//if age less than 15 throw invalid age exception
		if (age < 15)
			throw new InvalidAgeException("Age cannot be less than 15");
		else
			this.age = age;
	}

	public void setName(String name) throws EmptyNameException {
		// check if both first name , last name present if not throw EmptyNameException
		String[] fullName = name.split(" ");
		if (fullName.length != 2)
			throw new EmptyNameException("Please Enter Your Full name");
		else
			this.name = name;
	}

	public void setSalary(double salary) throws EmployeeException {
		// check if salary less than 3000 if yes throw Employee Exception
		if (salary < 3000)
			throw new EmployeeException("Salary cannot be less than 3000Rs");
		else
			this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

}
