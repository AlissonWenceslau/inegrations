package com.alissw.integrations.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.alissw.integrations.services.exceptions.EmailException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(EmailException.class)
	public ResponseEntity<StandardError> emailError(EmailException e, HttpServletRequest request){
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError();
		err.setTimestamp(Instant.now());
		err.setStatus(status.value());
		err.setError(e.getMessage());
		err.setMessage("Email error");
		err.setPath(request.getRequestURI());
		
		return ResponseEntity.status(status).body(err);
	}
}
