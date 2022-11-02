package com.giuliachittaro.gestioneprenotazioni.entities;




import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.cglib.beans.BulkBean.Generator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table (name = "postazione_aziendale")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class PostazioneAziendale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long codiceUnivoco;
	
	String descrizione;
	
	@Enumerated(EnumType.STRING)
	TipoPostazione tipoPostazione;
	
	long numeroOccupanti;
	
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	@JoinColumn ( name = "edificio_id")
	Edificio edificio;
	
	
	
	

}
