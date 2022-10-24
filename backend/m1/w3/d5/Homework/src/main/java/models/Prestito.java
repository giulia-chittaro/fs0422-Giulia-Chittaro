package models;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "prestito")
public class Prestito {
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn (name = "utente_id")
	Utente utente;
	
	@OneToOne 
	@JoinColumn(name = "item_id")
	Catalogo catalogo;
	
	private LocalDateTime dataInPrestito;
	private LocalDateTime dataRePrevista;
	private LocalDateTime dataReEffettiva;
	
	public Prestito () {}
	
	public Prestito ( Utente utente, Catalogo catalogo  ) {
		
		this.utente = utente;
		this.catalogo = catalogo;
		this.dataInPrestito = LocalDateTime.now();
		this.dataRePrevista = dataInPrestito.plusMonths(1);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public LocalDateTime getDataInPrestito() {
		return dataInPrestito;
	}

	public void setDataInPrestito(LocalDateTime dataInPrestito) {
		this.dataInPrestito = dataInPrestito;
	}

	public LocalDateTime getDataRePrevista() {
		return dataRePrevista;
	}

	public void setDataRePrevista(LocalDateTime dataRePrevista) {
		this.dataRePrevista = dataRePrevista;
	}

	public LocalDateTime getDataReEffettiva() {
		return dataReEffettiva;
	}

	public void setDataReEffettiva(LocalDateTime dataReEffettiva) {
		this.dataReEffettiva = dataReEffettiva;
	}
	
	public String toString() {
		return "Prestito [id=" + id + ", utente=" + utente 
				+ ", catalogo=" + catalogo 
				+ ", dataInPrestito=" + dataInPrestito.getYear() 
				+ "-" + dataInPrestito.getMonthValue() 
				+ "-" + dataInPrestito.getDayOfMonth() 
				+ ", dataRePrevista=" + dataRePrevista.getYear() 
				+ "-" + dataRePrevista.getMonthValue() 
				+ "-" + dataRePrevista.getDayOfMonth()
				+ "]";
	}

}
