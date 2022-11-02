package com.giuliachittaro.gestioneprenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.giuliachittaro.gestioneprenotazioni.entities.PostazioneAziendale;
import com.giuliachittaro.gestioneprenotazioni.entities.Utente;
import com.giuliachittaro.gestioneprenotazioni.repositories.UtenteRepository;

public class UtenteService {

	@Autowired
	UtenteRepository ur;
	
	public void saveUtente( Utente utente) {
		ur.save(utente);
	}
	
	public List<Utente> getAllUtenti() {
		return ur.findAll();
	}
	
	public void deleteUtenteById( int id) {
		ur.deleteById(id);
	}
}
