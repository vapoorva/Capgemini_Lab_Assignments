package com.cg.eis.exception;

public class InvalidIdException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Create InvalidIdException object without error message
	 */
	public InvalidIdException() {
		super();
	}

	/**
	 * Create InvalidIdException object with error message
	 */
	public InvalidIdException(String string) {
		super(string);
	}
}
