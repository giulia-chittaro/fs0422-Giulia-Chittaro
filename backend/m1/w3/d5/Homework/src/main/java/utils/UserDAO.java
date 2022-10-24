package utils;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import models.Utente;

public class UserDAO {

	public static void save(String nome, String cognome, LocalDate dataNascita) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();

		Utente utente = new Utente(nome, cognome, dataNascita);

		t.begin();

		em.persist(utente);
		utente.setNumeroTessera(utente.getId());
		
		t.commit();

		em.close();
		emf.close();

	}

	public static void save(Utente utente) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();

		t.begin();

		em.persist(utente);
		utente.setNumeroTessera(utente.getId());

		t.commit();

		em.close();
		emf.close();

	}

	public static Utente getById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework");
		EntityManager em = emf.createEntityManager();

		Utente found = em.find(Utente.class, id);

		em.close();
		emf.close();

		if (found != null) {
			return found;
		}
		System.out.println("User not found");
		return null;
	}

	public static void delete(Utente u) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();

		t.begin();

		em.remove(u);

		t.commit();

		em.close();
		emf.close();

	}
	
}
