package com.philips.web;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.philips.dto.ErrorMessage;
import com.philips.exceptions.ProdIdException;
import com.philips.exceptions.ProdNotFoundException;

@RestControllerAdvice
public class ProdRestAdvice {

	@ExceptionHandler(ProdIdException.class)
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)	
	public ErrorMessage handleIDException(ProdIdException ex) {
		return new ErrorMessage(HttpStatus.BAD_REQUEST.toString(), 
				ex.getMessage(), LocalDateTime.now().toString());
	}
	
	@ExceptionHandler(ProdNotFoundException.class)
	@ResponseStatus(code=HttpStatus.NOT_FOUND)
	public ErrorMessage handleNotfoundException(ProdNotFoundException ex) {
		return new ErrorMessage(HttpStatus.BAD_REQUEST.toString(), 
				ex.getMessage(), LocalDateTime.now().toString());
	}
	
}
