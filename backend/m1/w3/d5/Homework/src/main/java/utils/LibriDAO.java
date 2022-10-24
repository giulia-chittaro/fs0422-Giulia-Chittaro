package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import models.Libri;

public class LibriDAO {

	 public static void save(String titolo, String annoPubblicazione, int nPagine, String autore, String genere) {
	        
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CatalogoBiblioteca");
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction t = em.getTransaction();
	        
	     
	        Libri libro = new Libri(titolo, annoPubblicazione, nPagine, autore, genere);
	        
	        t.begin();
	        
	        em.persist(libro);
	        
	        t.commit();
	        
	        em.close();
	        emf.close();
	        
	    }
	    
	    public static void save(Libri libro) {
	        
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework");
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction t = em.getTransaction();
	               
	        t.begin();
	        
	        em.persist(libro);
	        
	        t.commit();
	        
	        em.close();
	        emf.close();
	        
	    }
	    
	    public static Libri getByISBN(int ISBN) {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework");
	        EntityManager em = emf.createEntityManager();
	        
	        Libri found = em.find(Libri.class, ISBN);
	        
	        em.close();
	        emf.close();
	        
	        if(found != null) {        	
	        	return found;
	        }
	        System.out.println("Book not found");
	        return null;
	    }
	    
	    public static void delete(Libri b) {
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
