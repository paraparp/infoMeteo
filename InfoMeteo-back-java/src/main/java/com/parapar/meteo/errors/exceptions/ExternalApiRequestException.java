package com.parapar.meteo.errors.exceptions;

public class ExternalApiRequestException  extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExternalApiRequestException() {
		super("No se han podido recuperar datos de la API Geonames");

	}
}