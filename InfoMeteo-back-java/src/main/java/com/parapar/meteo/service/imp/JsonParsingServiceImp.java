package com.parapar.meteo.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.parapar.meteo.model.jsonmodel.position.LocationResponseRoot;
import com.parapar.meteo.model.jsonmodel.weather.WeatherResponseRoot;
import com.parapar.meteo.service.ParsingService;

@Service
public class JsonParsingServiceImp implements ParsingService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public LocationResponseRoot parsePosition(String url) {
		return restTemplate.getForObject(url, LocationResponseRoot.class);
	}

	@Override
	public WeatherResponseRoot parseWeather(String url) {
		return restTemplate.getForObject(url, WeatherResponseRoot.class);
	}

}
