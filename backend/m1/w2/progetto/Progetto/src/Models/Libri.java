package Models;

public class Libri extends Editoriale {
	
	public String autore;
	public String genere;

	public Libri(int codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, String autore , String genere) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}
	
	
	public String getAutore() {
		return this.autore;
	}
	
	
	public String toString() {
		return "ISBN: " + this.codiceISBN + ", Title: " + this.titolo + ", Author: " + this.autore + ", Genre: " + this.genere + ", Year: " + this.annoPubblicazione + ", Pages: " + this.numeroPagine;
 	}
	
}
