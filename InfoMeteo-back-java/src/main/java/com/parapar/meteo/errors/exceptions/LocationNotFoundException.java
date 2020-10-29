package com.parapar.meteo.errors.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class LocationNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public LocationNotFoundException(String city) {
		super(new StringBuilder().append("No es posible ubicar la ciudad  '").append(city)
				.append("'. Localización no disponible.").toString());

	}

}
