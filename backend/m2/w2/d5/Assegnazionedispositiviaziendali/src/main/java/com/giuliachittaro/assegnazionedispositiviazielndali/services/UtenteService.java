package com.giuliachittaro.assegnazionedispositiviazielndali.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giuliachittaro.assegnazionedispositiviazielndali.entities.Utente;
import com.giuliachittaro.assegnazionedispositiviazielndali.repositories.UtenteRepository;



@Service
public class UtenteService {

	 @Autowired
	    UtenteRepository ur;
	 
	 public Iterable<Utente> getAll() {
	        return ur.findAll();
	    }
	    public void addUser(Utente u) {
	        ur.save(u);
	    }
	    public Optional<Utente> getById(long id) {
	        return ur.findById(id);
	    }
	    public void deleteById(long id) {
	        ur.deleteById(id);
	    }

	    public Optional<Utente> getByName(String u){
	        return ur.findByUsername(u);
	    }
}
