package models;

public class Libri extends Catalogo {
	
	public String autore;
	public String genere;

	public Libri(int ISBN, String titolo, int annoPubblicazione, int nPagine, String autore , String genere) {
		super(ISBN, titolo, annoPubblicazione, nPagine);
		this.autore = autore;
		this.genere = genere;
	}
	
	
	
	
	public String toString() {
		return "ISBN: " + this.ISBN + ", Titolo: " + this.titolo + ", Autore: " + this.autore + ", Genere: " + this.genere + ", Anno: " + this.annoPubblicazione + ", Pagine: " + this.nPagine;
 	}





	public String getAutore() {
		return autore;
	}





	public void setAutore(String autore) {
		this.autore = autore;
	}





	public String getGenere() {
		return genere;
	}





	public void setGenere(String genere) {
		this.genere = genere;
	}
	
}