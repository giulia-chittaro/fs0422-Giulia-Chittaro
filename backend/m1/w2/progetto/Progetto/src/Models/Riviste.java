package Models;

public class Riviste extends Editoriale {
	
	Periodicita periodicita;
	
	public Riviste(int codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita  ) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		
		this.periodicita = periodicita;
		
	}

	
	public String toString() {
		return "ISBN: " + this.codiceISBN + ", Title: " + this.titolo + ", Year: " + this.annoPubblicazione + ", Pages: " + this.numeroPagine + ", Periodicity: " + this.periodicita;
 	}
} 
