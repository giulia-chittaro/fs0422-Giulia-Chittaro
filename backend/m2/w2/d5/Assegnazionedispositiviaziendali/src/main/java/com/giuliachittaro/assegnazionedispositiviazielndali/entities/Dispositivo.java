package com.giuliachittaro.assegnazionedispositiviazielndali.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "dispositivo")
@Data
public class Dispositivo {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@ManyToOne
	@JoinColumn(name = "utente_id")
	Utente utente;
	
	  @Enumerated(EnumType.STRING)
	TipoDispositivo tipodispositivo;
	  
	  @Enumerated(EnumType.STRING)
	StatoDispositivo statodispositivo;
	
}
