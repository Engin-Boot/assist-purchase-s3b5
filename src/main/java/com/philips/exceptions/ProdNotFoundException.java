package com.philips.exceptions;

@SuppressWarnings("serial")
public class ProdNotFoundException extends Exception{

	public ProdNotFoundException() {
		super();
	}

	public ProdNotFoundException(String message) {
		super(message);
	}
	
}
