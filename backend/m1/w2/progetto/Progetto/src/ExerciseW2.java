
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

import Models.Editoriale;
import Models.Libri;
import Models.Riviste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ExerciseW2 {

	public static void main(String[] args) {
		
		
		ArrayList<Editoriale> c = new ArrayList<Editoriale>();
		ArrayList <Libri> libro = new ArrayList<Libri>();
		ArrayList <Riviste> rivista = new ArrayList <Riviste>();
		
		Scanner s = new Scanner(System.in); 
		int i;
		do {
			System.out.println("1. INSERISCI");
			System.out.println("2. CANCELLA");
			System.out.println("3. CERCA PER ISBN");
			System.out.println("4. CERCA PER ANNO PUBBLICAZIONE");
			System.out.println("5. CERCA PER AUTORE");
			System.out.println("6. SALVA SU DISCO DELL'ARCHIVIO");
			System.out.println("7. CARICA DAL DISCO DELL'ARCHIVIO");
			System.out.println("INSERISCI LA TUA SCELTA:");
			
			i = s.nextInt();
			
			
			switch(i) {
				case 1:
					
				System.out.println("Vuoi inserire un libro o una rivista? L. libro o R. rivista?");
					
					switch(s.nextLine()) {
					
					case "L" :
						
						System.out.println("Inserisci titolo : ");
						String bname = s.nextLine();
						System.out.println("Inserisci autore : ");
						String autore = s.nextLine();
						System.out.println("Inserisci genere : ");
						String genere = s.nextLine();
						System.out.println("Inserisci anno pubblicazione : ");
						int banno = s.nextInt();
						System.out.println("Inserisci numero pagine : ");
						int bpagine = s.nextInt();
						continue;
						
					case "R" :
						
						System.out.println("Inserisci titolo : ");
						String rname = s.nextLine();
						System.out.println("Inserisci anno pubblicazione : ");
						int ranno = s.nextInt();
						System.out.println("Inserisci numero pagine : ");
						int rpagine = s.nextInt();
				
						continue;
					
					}
					continue; 
					
				case 2 :
					
		
					System.out.println("Inserisci l'ISBN del libro o rivista che vuoi cancellare : ");
					long isbn = Long.parseLong(s.nextLine());
					c.removeIf(l -> l.codiceISBN == isbn);
					System.out.println("Libro rimosso!");
					continue;
					
				case 3:
					
					
					System.out.println("Per cercare per ISBN digita 'isbn'");
					
					System.out.println("Digita l'ISBN");
					long isbn1 = Long.parseLong(s.nextLine());
					System.out.println(searchByIsbn(c, isbn1));
					continue;
					
				case 4:
					
					System.out.println("Per cercare per anno di Pubblicazione digita 'annoPubblicazione'");
		
					int year = Integer.parseInt(s.nextLine());
					System.out.println(searchByAnno(c, year));
					continue;
					
				case 5:
					
					System.out.println("Per cercare per autore digita 'autore'");
					System.out.println("Digita il nome dell'autore");
					String autore = s.nextLine();
					System.out.println(searchByAutore(libro, autore));
					continue;
			
			default: 
				System.out.println("Comando errato");
			}
			
			
			
			
			
		} while(i!=0);
		
		s.close();
		
		
	}

	static ArrayList<Editoriale> searchByIsbn(ArrayList<Editoriale> c, long isbn){
		return (ArrayList<Editoriale>) c.stream()
				.filter(b -> b.codiceISBN == isbn)
				.collect(Collectors.toList());
	}
	
	static ArrayList<Editoriale> searchByAnno(ArrayList<Editoriale> catalogue, int year){
		return (ArrayList<Editoriale>) catalogue.stream()
				.filter(b -> b.annoPubblicazione == year)
				.collect(Collectors.toList());
	}
	
	static ArrayList<Libri> searchByAutore(ArrayList<Libri> books, String author){
		return (ArrayList<Libri>) books.stream()
				.filter(b -> author.equals(b.autore))
				.collect(Collectors.toList());
	}

}
