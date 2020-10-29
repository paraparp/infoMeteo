package com.parapar.meteo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parapar.meteo.model.entity.InfoMeteo;

@Repository
public interface MeteoRepository extends JpaRepository<InfoMeteo, Long> {

}
