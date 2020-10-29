package com.parapar.meteo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.parapar.meteo.model.dto.InfoMeteoDTO;
import com.parapar.meteo.service.imp.MeteoServiceImp;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/infometeo")
public class MeteoController {

	@Autowired
	private MeteoServiceImp meteoService;

	@GetMapping("/meteo")
	public ResponseEntity<InfoMeteoDTO> getMeteoByCity(@RequestParam String city) throws Exception {
		InfoMeteoDTO weather = meteoService.getMeteoByCityName(city);
		return ResponseEntity.ok(weather);
	}

	@GetMapping("/past")
	public ResponseEntity<List<InfoMeteoDTO>> getPastSearches(){
		return ResponseEntity.ok(meteoService.getPastSearches());
	}
	
}
