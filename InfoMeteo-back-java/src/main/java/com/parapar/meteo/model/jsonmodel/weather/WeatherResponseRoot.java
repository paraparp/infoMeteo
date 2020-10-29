
package com.parapar.meteo.model.jsonmodel.weather;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class WeatherResponseRoot {

	@JsonProperty("weatherObservations")
	private List<WeatherObservation> weatherObservations = null;

	@JsonProperty("weatherObservations")
	public List<WeatherObservation> getWeatherObservations() {
		return weatherObservations;
	}

	@JsonProperty("weatherObservations")
	public void setWeatherObservations(List<WeatherObservation> weatherObservations) {
		this.weatherObservations = weatherObservations;
	}

}
