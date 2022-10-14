package models;

public class Riviste extends Catalogo {
	
	Periodicita periodicita;

	Riviste(int ISBN, String titolo, int annoPubblicazione, int nPagine , Periodicita periodicita) {
		super(ISBN, titolo, annoPubblicazione, nPagine);
		
		
		this.periodicita = periodicita;
	}
	
	public String toString() {
		return "ISBN: " + this.ISBN + ", Titolo: " + this.titolo + ", Anno: " + this.annoPubblicazione + ", Pagine: " + this.nPagine + ", Periodicità: " + this.periodicita;
 	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

}
