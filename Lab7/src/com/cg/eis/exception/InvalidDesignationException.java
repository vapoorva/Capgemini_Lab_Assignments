package com.cg.eis.exception;

public class InvalidDesignationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create InvalidDesignationException object without error message
	 */
	public InvalidDesignationException() {
		super();
	}

	/**
	 * Create InvalidIdException object with error message
	 */
	public InvalidDesignationException(String string) {
		super(string);
	

}
}