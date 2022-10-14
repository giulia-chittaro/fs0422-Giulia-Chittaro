package models;

public abstract class Catalogo {
	
 long ISBN;
 String titolo;
 int annoPubblicazione;
 int nPagine;

 Catalogo(int ISBN  ,  String titolo , int annoPubblicazione , int nPagine ) {
	 
	 this.ISBN = ISBN;
	 this.titolo = titolo;
	 this.annoPubblicazione = annoPubblicazione;
	 this.nPagine = nPagine;
	 
}

public long getISBN() {
	return ISBN;
}

public void setISBN(long iSBN) {
	ISBN = iSBN;
}

public String getTitolo() {
	return titolo;
}

public void setTitolo(String titolo) {
	this.titolo = titolo;
}

public int getAnnoPubblicazione() {
	return annoPubblicazione;
}

public void setAnnoPubblicazione(int annoPubblicazione) {
	this.annoPubblicazione = annoPubblicazione;
}

public int getnPagine() {
	return nPagine;
}

public void setnPagine(int nPagine) {
	this.nPagine = nPagine;
}
}
