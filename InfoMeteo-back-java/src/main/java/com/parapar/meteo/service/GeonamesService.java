package com.parapar.meteo.service;

import org.springframework.stereotype.Service;

import com.parapar.meteo.model.jsonmodel.position.Coordinates;
import com.parapar.meteo.model.jsonmodel.position.LocationResponseRoot;
import com.parapar.meteo.model.jsonmodel.weather.WeatherResponseRoot;

@Service
public interface GeonamesService {

	/**
	 * Recupera la información de una ciudad tras la llamada a la Api Geonames
	 * @param url
	 * @return
	 */
	public LocationResponseRoot getPosition(String url);

	/**
	 * Recupera la información meteorologica de un punto tras la llamada a la Api Geonames
	 * @param url
	 * @return
	 */
	public WeatherResponseRoot getWeather(String url);
	
	/**
	 * Genera la url de llamada a la API Geonames con las coordenadas 
	 * @param coordinatess
	 * @param url
	 * @return
	 */
	public String getUrlWithCoordinates(Coordinates coordenadas, String jsonMeteoUrl);
}
