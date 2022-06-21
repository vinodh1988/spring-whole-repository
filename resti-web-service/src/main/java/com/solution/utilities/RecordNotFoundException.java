package com.solution.utilities;

public class RecordNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String getMessage() {
		return "No Record with the given sno";
	}

}
