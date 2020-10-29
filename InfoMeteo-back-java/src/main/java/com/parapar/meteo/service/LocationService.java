package com.parapar.meteo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.parapar.meteo.model.jsonmodel.position.Coordinates;
import com.parapar.meteo.model.jsonmodel.position.Location;
import com.parapar.meteo.model.jsonmodel.weather.WeatherObservation;

@Service
public interface LocationService {

	/**
	 * Obtiene las información de la posición de la ciudad desde la API geonames
	 * @param ciudad
	 * @return Location
	 */
	public Location getPositionByCityName(String ciudad);

	/**
	 * Muestra todas las observaciones segun coordenadas que devuelve de la llamada a la API Geonames
	 * @param coordenadas
	 * @return List<WeatherObservation>
	 */
	public List<WeatherObservation> getMeteoByCoordenadas(Coordinates coordenadas);

}
