package com.cg.eis.exception;

public class EmployeeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create EmployeeException object without error message
	 */
	public EmployeeException() {
		super();
	}

	/**
	 * Create EmployeeException object with error message
	 */
	public EmployeeException(String string) {
		super(string);
	}

}
