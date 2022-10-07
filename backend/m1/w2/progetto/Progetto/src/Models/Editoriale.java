
package Models;

public abstract class Editoriale {
	
public int codiceISBN;
public String titolo;
public int annoPubblicazione;
public int numeroPagine;

 public Editoriale(int codiceISBN  ,  String titolo , int annoPubblicazione , int numeroPagine ) {
	 
	 this.codiceISBN = codiceISBN;
	 this.titolo = titolo;
	 this.annoPubblicazione = annoPubblicazione;
	 this.numeroPagine = numeroPagine;
	 
}

}