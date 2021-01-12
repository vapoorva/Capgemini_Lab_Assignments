package com.cg.eis.exception;

public class EmptyNameException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Create EmptyNameException object without error message
	 */
	public EmptyNameException() {
		super();
	}

	/**
	 * Create EmptyNameException object with error message
	 */
	public EmptyNameException(String string) {
		super(string);
	}

}
