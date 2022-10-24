package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import models.Periodicita;
import models.Riviste;

public class RivistaDAO {

	public static void save(String titolo, String annoPubblicazione, int  nPagine, Periodicita periodicita) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();

		Riviste rivista = new Riviste(titolo, annoPubblicazione, nPagine, periodicita);

		t.begin();

		em.persist(rivista);

		t.commit();

		em.close();
		emf.close();

	}

	public static void save(Riviste rivista) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();

		t.begin();

		em.persist(rivista);

		t.commit();

		em.close();
		emf.close();

	}

	public static Riviste getByISBN(int ISBN) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework");
		EntityManager em = emf.createEntityManager();

		Riviste found = em.find(Riviste.class, ISBN);

		em.close();
		emf.close();

		if (found != null) {
			return found;
		}
		System.out.println("Magazine not found");
		return null;
	}

	public static void delete(Riviste b) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();

		t.begin();

		em.remove(b);

		t.commit();

		em.close();
		emf.close();

	}
}
