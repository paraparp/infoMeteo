
package com.parapar.meteo.model.jsonmodel.weather;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherObservation {

	@JsonProperty("lng")
	private Double lng;
	@JsonProperty("observation")
	private String observation;
	@JsonProperty("ICAO")
	private String iCAO;
	@JsonProperty("clouds")
	private String clouds;
	@JsonProperty("dewPoint")
	private String dewPoint;
	@JsonProperty("cloudsCode")
	private String cloudsCode;
	@JsonProperty("datetime")
	private String datetime;
	@JsonProperty("temperature")
	private Integer temperature;
	@JsonProperty("humidity")
	private Integer humidity;
	@JsonProperty("stationName")
	private String stationName;
	@JsonProperty("weatherCondition")
	private String weatherCondition;
	@JsonProperty("windDirection")
	private Integer windDirection;
	@JsonProperty("hectoPascAltimeter")
	private Integer hectoPascAltimeter;
	@JsonProperty("windSpeed")
	private String windSpeed;
	@JsonProperty("lat")
	private Double lat;


	@JsonProperty("lng")
	public Double getLng() {
		return lng;
	}

	@JsonProperty("lng")
	public void setLng(Double lng) {
		this.lng = lng;
	}

	@JsonProperty("observation")
	public String getObservation() {
		return observation;
	}

	@JsonProperty("observation")
	public void setObservation(String observation) {
		this.observation = observation;
	}

	@JsonProperty("ICAO")
	public String getICAO() {
		return iCAO;
	}

	@JsonProperty("ICAO")
	public void setICAO(String iCAO) {
		this.iCAO = iCAO;
	}

	@JsonProperty("clouds")
	public String getClouds() {
		return clouds;
	}

	@JsonProperty("clouds")
	public void setClouds(String clouds) {
		this.clouds = clouds;
	}

	@JsonProperty("dewPoint")
	public String getDewPoint() {
		return dewPoint;
	}

	@JsonProperty("dewPoint")
	public void setDewPoint(String dewPoint) {
		this.dewPoint = dewPoint;
	}

	@JsonProperty("cloudsCode")
	public String getCloudsCode() {
		return cloudsCode;
	}

	@JsonProperty("cloudsCode")
	public void setCloudsCode(String cloudsCode) {
		this.cloudsCode = cloudsCode;
	}

	@JsonProperty("datetime")
	public String getDatetime() {
		return datetime;
	}

	@JsonProperty("datetime")
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	@JsonProperty("temperature")
	public Integer getTemperature() {
		return temperature;
	}

	@JsonProperty("temperature")
	public void setTemperature(Integer temperature) {
		this.temperature = temperature != null ? temperature: 0;
	}

	@JsonProperty("humidity")
	public Integer getHumidity() {
		return humidity;
	}

	@JsonProperty("humidity")
	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

	@JsonProperty("stationName")
	public String getStationName() {
		return stationName;
	}

	@JsonProperty("stationName")
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	@JsonProperty("weatherCondition")
	public String getWeatherCondition() {
		return weatherCondition;
	}

	@JsonProperty("weatherCondition")
	public void setWeatherCondition(String weatherCondition) {
		this.weatherCondition = weatherCondition;
	}

	@JsonProperty("windDirection")
	public Integer getWindDirection() {
		return windDirection;
	}

	@JsonProperty("windDirection")
	public void setWindDirection(Integer windDirection) {
		this.windDirection = windDirection;
	}

	@JsonProperty("hectoPascAltimeter")
	public Integer getHectoPascAltimeter() {
		return hectoPascAltimeter;
	}

	@JsonProperty("hectoPascAltimeter")
	public void setHectoPascAltimeter(Integer hectoPascAltimeter) {
		this.hectoPascAltimeter = hectoPascAltimeter;
	}

	@JsonProperty("windSpeed")
	public String getWindSpeed() {
		return windSpeed;
	}

	@JsonProperty("windSpeed")
	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}

	@JsonProperty("lat")
	public Double getLat() {
		return lat;
	}

	@JsonProperty("lat")
	public void setLat(Double lat) {
		this.lat = lat;
	}



}
