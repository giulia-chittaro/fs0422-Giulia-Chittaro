package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "libri")
public class Libri extends Catalogo {
	
	private String autore;
	private String genere;
	
	public Libri() {}

	public Libri( String titolo, int annoPubblicazione, int nPagine, String autore , String genere) {
		super( titolo, annoPubblicazione, nPagine);
		this.autore = autore;
		this.genere = genere;
	}
	
	
	
	
	public String toString() {
		return " Titolo: " + this.titolo + ", Autore: " + this.autore + ", Genere: " + this.genere + ", Anno: " + this.annoPubblicazione + ", Pagine: " + this.nPagine;
 	}


	public long getIsbn() {
		return ISBN;
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