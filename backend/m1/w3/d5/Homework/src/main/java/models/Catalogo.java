package models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name = "item_type", discriminatorType = DiscriminatorType.STRING)
@Table (name = "catalogo")
public abstract class Catalogo {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
protected long ISBN;
 protected String titolo;
 
 @Column ( name = "anno_pubblicazione")
protected int annoPubblicazione;
 @Column ( name = "numero_pagine")
protected int nPagine;
 
 public Catalogo () {}

 Catalogo( String titolo , int annoPubblicazione , int nPagine ) {
	 
	 
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
