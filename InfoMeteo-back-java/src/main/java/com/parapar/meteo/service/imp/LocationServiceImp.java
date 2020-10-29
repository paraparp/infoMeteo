package com.parapar.meteo.service.imp;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestClientException;

import com.parapar.meteo.errors.exceptions.CityNotFoundException;
import com.parapar.meteo.errors.exceptions.ExternalApiRequestException;
import com.parapar.meteo.model.jsonmodel.position.Coordinates;
import com.parapar.meteo.model.jsonmodel.position.Location;
import com.parapar.meteo.model.jsonmodel.position.LocationResponseRoot;
import com.parapar.meteo.model.jsonmodel.weather.WeatherObservation;
import com.parapar.meteo.model.jsonmodel.weather.WeatherResponseRoot;
import com.parapar.meteo.service.GeonamesService;
import com.parapar.meteo.service.LocationService;
import com.parapar.meteo.util.Constants;;

@Service
public class LocationServiceImp implements LocationService {

	private static final Log log = LogFactory.getLog(LocationService.class);

	@Autowired
	private GeonamesService geonamesService;

	@Override
	@Transactional
	public Location getPositionByCityName(String ciudad) {

		LocationResponseRoot locationResponse = null;
		try {
			log.info("Accediendo a URL : " + Constants.JSON_lOCATION_URL + ciudad);
			locationResponse = geonamesService.getPosition(Constants.JSON_lOCATION_URL + ciudad);
			log.info(Constants.DATA_OK);
		} catch (RestClientException e) {
			throw new ExternalApiRequestException();
		}

		// Retornamos las primera localización si existe
		return locationResponse.getLocation().stream().findFirst().orElseThrow(() -> new CityNotFoundException(ciudad));
	}

	@Override
	@Transactional
	public List<WeatherObservation> getMeteoByCoordenadas(Coordinates coordenadas) {

		String urlMeteo = geonamesService.getUrlWithCoordinates(coordenadas, Constants.JSON_METEO_URL);

		WeatherResponseRoot weather = null;
		try {
			log.info("Accediendo a URL : " + urlMeteo);
			weather = geonamesService.getWeather(urlMeteo);
			log.info(Constants.DATA_OK);
		} catch (RestClientException e) {
			throw new ExternalApiRequestException();
		}

		return weather.getWeatherObservations() != null ? weather.getWeatherObservations() : null;
	}

}
