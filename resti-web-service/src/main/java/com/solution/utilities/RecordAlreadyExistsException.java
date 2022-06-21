package com.solution.utilities;

public class RecordAlreadyExistsException extends Exception {
   
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		 return "A Record with this sno already exists";
	 }
}
