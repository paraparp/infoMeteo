package com.parapar.meteo.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parapar.meteo.model.jsonmodel.position.Coordinates;
import com.parapar.meteo.model.jsonmodel.position.LocationResponseRoot;
import com.parapar.meteo.model.jsonmodel.weather.WeatherResponseRoot;
import com.parapar.meteo.service.GeonamesService;
import com.parapar.meteo.service.ParsingService;

@Service
public class GeonamesServiceImp implements GeonamesService {

	@Autowired
	private ParsingService parsingService;

	@Override
	public LocationResponseRoot getPosition(String url) {
		return parsingService.parsePosition(url);
	}

	@Override
	public WeatherResponseRoot getWeather(String url) {
		return parsingService.parseWeather(url);
	}

	
	@Override
	public String getUrlWithCoordinates(Coordinates coordinates, String url) {
		return new StringBuilder().append(url).append("north=").append(coordinates.getNorth()).append("&south=")
				.append(coordinates.getSouth()).append("&east=").append(coordinates.getEast()).append("&west=")
				.append(coordinates.getWest()).toString();
	}

}
