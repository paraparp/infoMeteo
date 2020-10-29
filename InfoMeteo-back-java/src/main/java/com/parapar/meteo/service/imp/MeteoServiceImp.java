package com.parapar.meteo.service.imp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.parapar.meteo.errors.exceptions.LocationNotFoundException;
import com.parapar.meteo.model.dto.InfoMeteoDTO;
import com.parapar.meteo.model.entity.InfoMeteo;
import com.parapar.meteo.model.jsonmodel.position.Location;
import com.parapar.meteo.model.jsonmodel.weather.WeatherObservation;
import com.parapar.meteo.repository.MeteoRepository;
import com.parapar.meteo.service.LocationService;
import com.parapar.meteo.service.MeteoService;

@Service
public class MeteoServiceImp implements MeteoService {

	private static final Log log = LogFactory.getLog(MeteoService.class);
	
	@Autowired
	private LocationService locationService;

	@Autowired
	private MeteoRepository meteoRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	@Transactional
	public InfoMeteoDTO getMeteoByCityName(String ciudad) throws Exception {

		Location location = locationService.getPositionByCityName(ciudad);

		List<WeatherObservation> weatherObs = null;
		if (location.getCoordinates() != null) {
			weatherObs = locationService.getMeteoByCoordenadas(location.getCoordinates());
		} else {
			throw new LocationNotFoundException(ciudad);
		}

		InfoMeteoDTO infoMeteo = modelMapper.map(location, InfoMeteoDTO.class);
		infoMeteo.setTemperature(this.getAverageTemperature(weatherObs));
		infoMeteo.setCreatedAt(LocalDateTime.now());
		this.saveSearch(infoMeteo);
		log.info("Guardada busqueda para ciudad " + infoMeteo.getCityName());
		
		return infoMeteo;
	}

	
	@Override
	public InfoMeteo saveSearch(InfoMeteoDTO infoMeteo) {
		return meteoRepository.save(modelMapper.map(infoMeteo, InfoMeteo.class));
	}

	
	@Override
	public List<InfoMeteoDTO> getPastSearches() {
		List<InfoMeteo> searchList = this.meteoRepository.findAll();
		log.info("Recuperando busquedas pasadas.");
		return searchList.stream().map(search -> modelMapper.map(search, InfoMeteoDTO.class)).collect(Collectors.toList());
	}

	/**
	 * Calcula la temperatura media de las estaciones
	 * @param weatherObs
	 * @return average temeperature 
	 */
	private double getAverageTemperature(List<WeatherObservation> weatherObs) {
		double temperature = 0;
		if (weatherObs != null && weatherObs.size() > 0) {
			temperature = weatherObs.stream().mapToDouble(WeatherObservation::getTemperature).average().getAsDouble();
		}
		return Math.round(temperature * 10)/ 10;
	}

}
