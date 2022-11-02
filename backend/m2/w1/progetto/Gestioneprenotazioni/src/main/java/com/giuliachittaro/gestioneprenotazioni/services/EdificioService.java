package com.giuliachittaro.gestioneprenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.giuliachittaro.gestioneprenotazioni.entities.Edificio;
import com.giuliachittaro.gestioneprenotazioni.entities.PostazioneAziendale;
import com.giuliachittaro.gestioneprenotazioni.repositories.EdificioRepository;

public class EdificioService {
	
	@Autowired 
	EdificioRepository er;
	
	public void saveEdificio( Edificio edificio) {
		er.save(edificio);
	}
	
	public List<Edificio> getAllEdifici() {
		return er.findAll();
	}
	
	public void deleteEdificioById( int id) {
		er.deleteById(id);
	}
	

	public List<Edificio> findByCitta(String citta) {
		return er.findByCitta(citta);
	}
	
}
