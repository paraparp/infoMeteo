package com.parapar.meteo.errors.exceptions;

public class CityNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CityNotFoundException(String city) {
		super(new StringBuilder().append("La ciudad '").append(city).append("' no existe o no hay datos").toString());

	}
}