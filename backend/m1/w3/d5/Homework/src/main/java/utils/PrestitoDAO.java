package utils;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import models.Catalogo;
import models.Prestito;
import models.Utente;

public class PrestitoDAO {

	public static void save(Utente utente, Catalogo catalogo) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();

		Prestito prestito = new Prestito(utente, catalogo);

		t.begin();

		em.persist(prestito);

		t.commit();

		em.close();
		emf.close();

	}

	public static void save(Prestito prestito) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();

		t.begin();

		em.persist(prestito);

		t.commit();

		em.close();
		emf.close();

	}

	public static Prestito getById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework");
		EntityManager em = emf.createEntityManager();

		Prestito found = em.find(Prestito.class, id);

		em.close();
		emf.close();

		if (found != null) {
			return found;
		}
		System.out.println("Loan not found");
		return null;
	}


	public static void endLoan(int id) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		
		Prestito found = em.find(Prestito.class, id);
		
		if(found.getDataReEffettiva() == null) {

			t.begin();

			found.setDataReEffettiva(LocalDateTime.now());
			
			int compare = found.getDataRePrevista().compareTo(found.getDataReEffettiva());
			
			if (compare > 0) {
				System.out.println("Thanks for returning in time");
			} else {
				System.out.println("You're late on the return!");
			}
			
			
			t.commit();
			
			
		}else {
			System.out.println("Loan alredy closed.");
		}

		em.close();
		emf.close();
		
	}

	
	public static void endLoan(Prestito prestito) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        t.begin();
        
        // create update
        CriteriaUpdate<Prestito> update = cb.
        createCriteriaUpdate(Prestito.class);
 
        // set the root class
        Root e = update.from(Prestito.class);
 
        // set update and where clause
        update.set("actualReturnDate", LocalDateTime.now());
        update.where(cb.equal(e.get("id"), prestito.getId()));
 
        // perform update
        em.createQuery(update).executeUpdate();
        
        em.flush();
        t.commit();
        
        em.close();
        emf.close();
      
    }
}
