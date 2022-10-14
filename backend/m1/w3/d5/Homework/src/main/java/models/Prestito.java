package models;

import java.util.Date;

public class Prestito {
	
	String utente;
	Editoriale editoriale;
	Date dataInPrestito;
	Date dataRePrevista;
	Date dataReEffettiva;
	
	
	public Prestito ( String utente, Editoriale editoriale, Date dataInPrestito, Date dataRePrevista, Date dataReEffettiva  ) {
		
		this.utente = utente;
		this.editoriale = editoriale;
		this.dataInPrestito = dataInPrestito;
		dataRePrevista = dataRePrevista;
		dataReEffettiva = dataReEffettiva;
	}
	

}
