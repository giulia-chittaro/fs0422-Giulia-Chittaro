package com.giuliachittaro.assegnazionedispositiviazielndali.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "utente")
@Data
public class Utente {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String nome;
	String cognome;
	String username;
	String email;
	
	@OneToMany (mappedBy = "utente")
	List <Dispositivo> dispositivo;
	  
}
