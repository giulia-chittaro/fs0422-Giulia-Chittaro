package com.giuliachittaro.gestioneprenotazioni.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giuliachittaro.gestioneprenotazioni.entities.Edificio;
import com.giuliachittaro.gestioneprenotazioni.entities.PostazioneAziendale;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Integer> {

	public List<Edificio> findByCitta(String citta);
}
