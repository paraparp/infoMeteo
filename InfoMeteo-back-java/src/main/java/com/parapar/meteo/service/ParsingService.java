package com.parapar.meteo.service;

import org.springframework.stereotype.Service;

import com.parapar.meteo.model.jsonmodel.position.LocationResponseRoot;
import com.parapar.meteo.model.jsonmodel.weather.WeatherResponseRoot;

@Service
public interface ParsingService {

	/**
	 * Parsea una respuesta Json a un modelo
	 */
	
	
	public LocationResponseRoot parsePosition(String url);

	public WeatherResponseRoot parseWeather(String url);

}
