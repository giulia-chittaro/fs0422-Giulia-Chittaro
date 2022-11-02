package com.giuliachittaro.gestioneprenotazioni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giuliachittaro.gestioneprenotazioni.entities.Edificio;
import com.giuliachittaro.gestioneprenotazioni.entities.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer>{

}
