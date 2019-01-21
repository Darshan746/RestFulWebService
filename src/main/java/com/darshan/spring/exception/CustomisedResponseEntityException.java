package com.darshan.spring.exception;

import java.sql.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.darshan.spring.exception.GenericResponseException;

@ControllerAdvice
public class CustomisedResponseEntityException extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public  ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) throws Exception {
		GenericResponseException eceptionResponse = new GenericResponseException(new Date(27091990),ex.getMessage(),"Internal ERROR");
		
		return new ResponseEntity(eceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
}
	
	
	@ExceptionHandler(UserNotFoundException.class)
	public  ResponseEntity<Object> handleUserNotFoundException(Exception ex, WebRequest request) throws Exception {
		GenericResponseException eceptionResponse = new GenericResponseException(new Date(27091990),ex.getMessage(),"Not found");
		
		return new ResponseEntity(eceptionResponse,HttpStatus.NOT_FOUND);
}

	@ExceptionHandler(NullPointerException.class)
	public  ResponseEntity<Object> handleNullPointerException(Exception ex, WebRequest request) throws Exception {
		GenericResponseException exceptionResponse = new GenericResponseException(new Date(27091990),ex.getMessage(),"NullPointer Exception");

		return new ResponseEntity(exceptionResponse,HttpStatus.NOT_FOUND);
	}

	@Override
	public ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		GenericResponseException eceptionResponse = new GenericResponseException(new Date(27091990),ex.getMessage(),ex.getBindingResult().getFieldError().toString());
		return new ResponseEntity(eceptionResponse, HttpStatus.BAD_REQUEST);
	}

}