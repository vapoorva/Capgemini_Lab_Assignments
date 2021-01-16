package com.cg.eis.service;

import java.util.HashMap;
import java.util.List;

import com.cg.eis.exception.InvalidDesignationException;
import com.cg.eis.exception.InvalidIdException;



/**
 * @author Ap00rva
 * Date :14/1/2021
 */
public interface EmployeeService {
	
/**
 * This will get details of employee from user
 * @return 
 */
	void getDetails(int id, String name, double salary, String designation, String Insurance);
/**
 * Find the insurance scheme for an employee based on salary and designation
 */
	void findInsuranceScheme(String designation) throws InvalidDesignationException;
/**
 * @return lists of employee hashmaps
 */
List<HashMap<String, String>> findAll();

void deleteEmployeeDetails(int id)throws InvalidIdException;
	



}
