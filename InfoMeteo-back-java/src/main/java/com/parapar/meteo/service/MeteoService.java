package com.parapar.meteo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.parapar.meteo.model.dto.InfoMeteoDTO;
import com.parapar.meteo.model.entity.InfoMeteo;

@Service
public interface MeteoService {

	/**
	 * Muestra la información meteorológica para una ciudad
	 * @param ciudad
	 * @return InfoMeteoDTO
	 * @throws Exception
	 */
	public InfoMeteoDTO getMeteoByCityName(String ciudad) throws Exception;

	/**
	 * Guarda una busqueda de información metereologica
	 * @param infoMeteo
	 * @return
	 */
	public InfoMeteo saveSearch(InfoMeteoDTO infoMeteo);
	
	/**
	 * Recupera las busquedas pasadas
	 * @return  List<InfoMeteoDTO>
	 */
	public List<InfoMeteoDTO> getPastSearches();

}
