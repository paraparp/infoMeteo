package com.parapar.meteo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.parapar.meteo.model.jsonmodel.position.Location;
import com.parapar.meteo.service.LocationService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/infometeo")
public class LocationController {

	@Autowired
	private LocationService locationService;

	@GetMapping("/position")
	public ResponseEntity<Location> getCityPosition(@RequestParam String city) {
		Location infoCiudad = locationService.getPositionByCityName(city);
		return ResponseEntity.ok(infoCiudad);
	}

}
