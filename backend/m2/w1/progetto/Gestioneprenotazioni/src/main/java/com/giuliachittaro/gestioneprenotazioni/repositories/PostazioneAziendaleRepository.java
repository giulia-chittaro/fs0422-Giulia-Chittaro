package com.giuliachittaro.gestioneprenotazioni.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giuliachittaro.gestioneprenotazioni.entities.Edificio;
import com.giuliachittaro.gestioneprenotazioni.entities.PostazioneAziendale;
import com.giuliachittaro.gestioneprenotazioni.entities.TipoPostazione;

@Repository
public interface PostazioneAziendaleRepository extends JpaRepository<PostazioneAziendale, Long>{

	
	public List<PostazioneAziendale> findByTipo(TipoPostazione t); 
	public List<PostazioneAziendale> findByEdificio(Edificio c);
	public List<PostazioneAziendale> findByCittaAndTipo(String c, TipoPostazione t); 
}
