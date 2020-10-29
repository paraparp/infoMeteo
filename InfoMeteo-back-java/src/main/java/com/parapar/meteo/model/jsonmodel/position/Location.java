
package com.parapar.meteo.model.jsonmodel.position;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Location {

	@JsonProperty("toponymName")
	private String toponymName;

	@JsonProperty("bbox")
	private Coordinates coordinates;

	@JsonProperty("asciiName")
	private String cityName;

	@JsonProperty("countryName")
	private String countryName;

	@JsonProperty("adminName1")
	private String adminName;

	@JsonProperty("lat")
	private String lat;

	@JsonProperty("lng")
	private String lng;

	public String getToponymName() {
		return toponymName;
	}

	public void setToponymName(String toponymName) {
		this.toponymName = toponymName;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

}
