package models;

import java.util.Date;


public class Utente {
	
	String nome;
	String cognome;
	Date dataNascita;
	long numeroTessera;
	
	public Utente ( String nome, String cognome, Date dataNascita, long numeroTessera) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.numeroTessera = numeroTessera;
	}
	
	
	public String toString() {
		return "Nome: " + this.nome + ", Cognome: " + this.cognome + ", dataNascita: " + this.dataNascita + ", numeroTessera: " + this.numeroTessera;
 	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public Date getDataNascita() {
		return dataNascita;
	}


	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}


	public long getNumeroTessera() {
		return numeroTessera;
	}


	public void setNumeroTessera(long numeroTessera) {
		this.numeroTessera = numeroTessera;
	}


}
