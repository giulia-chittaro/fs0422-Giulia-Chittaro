package com.giuliachittaro.gestioneprenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.giuliachittaro.gestioneprenotazioni.entities.Edificio;
import com.giuliachittaro.gestioneprenotazioni.entities.PostazioneAziendale;
import com.giuliachittaro.gestioneprenotazioni.entities.TipoPostazione;
import com.giuliachittaro.gestioneprenotazioni.repositories.PostazioneAziendaleRepository;

public class PostazioneAziendaleService {
	
	@Autowired
	PostazioneAziendaleRepository par;
	
	public void savePostazioneAziendale( PostazioneAziendale postazione) {
		par.save(postazione);
	}
	
	public List<PostazioneAziendale> getAllPostazioni() {
		return par.findAll();
	}
	
	public List<PostazioneAziendale> findByTipo(TipoPostazione t) {
		return par.findByTipo(t);
	}
	

	public List<PostazioneAziendale> findByCittaAndTipo(String c, TipoPostazione t){
		return par.findByCittaAndTipo(c, t);
	}
	
	
	public List<PostazioneAziendale> findByEdificio(Edificio e) {
		return par.findByEdificio(e);
	}
	public void deletePostazioneAziendaleById( Long id) {
		par.deleteById(id);
	}
}
