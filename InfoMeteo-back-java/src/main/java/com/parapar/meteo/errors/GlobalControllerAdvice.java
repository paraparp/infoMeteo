package com.parapar.meteo.errors;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.parapar.meteo.errors.exceptions.CityNotFoundException;
import com.parapar.meteo.errors.exceptions.ExternalApiRequestException;
import com.parapar.meteo.errors.exceptions.LocationNotFoundException;

@RestControllerAdvice
public class GlobalControllerAdvice extends ResponseEntityExceptionHandler {

	private static final Log log = LogFactory.getLog(GlobalControllerAdvice.class);

	@ExceptionHandler({ LocationNotFoundException.class, CityNotFoundException.class, ExternalApiRequestException.class })
	public final ResponseEntity<ExceptionResponseEntity> handleNotFoundException(RuntimeException ex,WebRequest request) {

		ExceptionResponseEntity exceptionResponse = new ExceptionResponseEntity(new Date(), ex.getMessage(),
				request.getDescription(false), HttpStatus.NOT_FOUND.getReasonPhrase());
		log.error(exceptionResponse);
		
		return new ResponseEntity<ExceptionResponseEntity>(exceptionResponse, HttpStatus.NOT_FOUND);
	}

}