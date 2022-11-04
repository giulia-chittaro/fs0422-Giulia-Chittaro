package com.giuliachittaro.assegnazionedispositiviazielndali.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giuliachittaro.assegnazionedispositiviazielndali.entities.Dispositivo;
import com.giuliachittaro.assegnazionedispositiviazielndali.entities.Utente;
import com.giuliachittaro.assegnazionedispositiviazielndali.repositories.Dispositivorepository;


@Service
public class DispositivoService {

	 @Autowired
	 Dispositivorepository dr;
	 
	 public void addUser(Dispositivo d) {
	        dr.save(d);
	    }
	 
	 public Optional<Dispositivo> getById(long id) {
	        return dr.findById(id);
	    }
	 
	 public void deleteById(long id) {
	        dr.deleteById(id);
	    }
}
