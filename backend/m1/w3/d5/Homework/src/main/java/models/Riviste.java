package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table (name = "riviste")
public class Riviste extends Catalogo {
	
	@Column (name = "periodicita")
	@Enumerated (EnumType.STRING)
	Periodicita periodicita;
	
	public Riviste() {}

	Riviste( String titolo, int annoPubblicazione, int nPagine , Periodicita periodicita) {
		super( titolo, annoPubblicazione, nPagine);
		
		
		this.periodicita = periodicita;
	}
	
	public String toString() {
		return " Titolo: " + this.titolo + ", Anno: " + this.annoPubblicazione + ", Pagine: " + this.nPagine + ", Periodicità: " + this.periodicita;
 	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

}
