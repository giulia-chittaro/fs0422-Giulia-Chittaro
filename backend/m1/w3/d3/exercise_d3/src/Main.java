import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import models.s1.S1_Cat;
import models.s1.S1_Dog;

public class Main {

	public static final String pu = "exercise_d3";
	
	public static void main(String[] args) {
		

	}

	public static void S1() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(pu);
		EntityManager em = emf.createEntityManager();
		
		
		
		
		EntityTransaction t = em.getTransaction();
		
		S1_Dog d1 = new S1_Dog ("Pippo", 3, "Gianfranco");
		
		S1_Dog d2 = new S1_Dog ("Pluto", 3, "Giacomo");
		
		S1_Cat c1 = new S1_Cat ("Pollo", 4, 5);
		
		S1_Cat c2 = new S1_Cat ("Ciccio", 5, 6);
		
		
		em.persist(d1);
		
		em.persist(d2);
		
		em.persist(c1);
		
		em.persist(c2);
		
		t.commit();
		
		em.close();
		emf.close();
		
		
	}
	
	
}
