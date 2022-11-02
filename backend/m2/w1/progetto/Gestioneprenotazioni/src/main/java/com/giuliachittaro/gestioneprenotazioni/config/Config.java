package com.giuliachittaro.gestioneprenotazioni.config;
import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.Configuration;

import com.giuliachittaro.gestioneprenotazioni.entities.Edificio;
import com.giuliachittaro.gestioneprenotazioni.entities.PostazioneAziendale;
import com.giuliachittaro.gestioneprenotazioni.entities.Prenotazione;
import com.giuliachittaro.gestioneprenotazioni.entities.Utente;

public class Config {

	
	@Bean
	@Scope("prototype")
	public Utente sviluppatore1() {
		return Utente.builder()
				.username("Pinouser")
				.fullName("Pino Paoli")
				.email("pinetto.paoletto@gmail.com")
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Utente sviluppatore2() {
		return Utente.builder()
				.username("JediGino")
				.fullName("Gino Paoli")
				.email("ginetto.paoletto@gmail.com")
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Utente sviluppatore3() {
		return Utente.builder()
				.username("MasterLino")
				.fullName("Lino Banfi")
				.email("linonelpallone@gmail.com")
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Edificio edificio1() {
		return Edificio.builder()
				.address("Via Qui 1")
				.city("Milano")
				.name("Casa Mia")
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Edificio edificio2() {
		return Edificio.builder()
				.address("Via Lì 1")
				.city("Roma")
				.name("Casa Tua")
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Edificio edificio3() {
		return Edificio.builder()
				.address("Via Dall'altra parte 1")
				.city("Napoli")
				.name("Casa Sua")
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public PostazioneAziendale postazione1() {
		return PostazioneAziendale.builder()
				.WSType(TipoPostazione.MEETING_ROOM)
				.building(edificio1())
				.description("E' proprio casa mia")
				.numeroOccupanti(10)
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public PostazioneAziendale postazione2() {
		return PostazioneAziendale.builder()
				.WSType(TipoPostazione.OPENSPACE)
				.building(edificio2())
				.description("Fai come se fossi a casa tua")
				.numeroOccupanti(15)
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public PostazioneAziendale postazione3() {
		return PostazioneAziendale.builder()
				.WSType(TipoPostazione.PRIVATE)
				.building(edificio3())
				.description("Non ci sono mai stato")
				.numeroOccupanti(100)
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Prenotazione prenotazione1() {
		return Prenotazione.builder()
				.user(sviluppatore1())
				.workstation(postazione1())
				.date(LocalDate.of(2023, 1, 15))
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Prenotazione prenotazione2() {
		return Prenotazione.builder()
				.user(sviluppatore2())
				.workstation(postazione2())
				.date(LocalDate.of(2022, 12, 15))
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Prenotazione prenotazione3() {
		return Prenotazione.builder()
				.user(sviluppatore3())
				.workstation(postazione3())
				.date(LocalDate.of(2022, 11, 15))
				.build();
	}
}
