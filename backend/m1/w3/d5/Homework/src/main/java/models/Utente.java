package models;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


public class Utente {
	
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	long numeroTessera;
	
	@OneToMany(mappedBy = "utente")
	private Set<Prestito> prestiti;
	
	public Utente () {}
	
	public Utente ( String nome, String cognome, LocalDate dataNascita) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		
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


	public LocalDate getDataNascita() {
		return dataNascita;
	}


	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}


	public long getNumeroTessera() {
		return numeroTessera;
	}


	public void setNumeroTessera(long numeroTessera) {
		this.numeroTessera = numeroTessera;
	}

	public int getId() {
		return id;
	}

}
