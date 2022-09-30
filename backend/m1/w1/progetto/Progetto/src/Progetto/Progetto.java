package Progetto;
import java.util.Scanner;
import Player.Multimedia;
import Player.Volume;
import Player.Luminosita;
import Player.Audio;
import Player.Filmato;
import Player.Immagine;

public class Progetto {

	public static void main(String[] args) {
		
		System.out.println("LETTORE MULTIMEDIALE");
		
		Scanner scanner = new Scanner(System.in);
		
		Multimedia[] multi = new Multimedia[5];
		
		int tipologia, durata;
		
		String titolo;
		int volumeiniziale = 6;
		int luminositàiniziale = 8;
		
		
		
		for (int i=0; i<5;i++) {
			
		boolean flag = true;
		
		while(flag) {
			System.out.println("Che tipologia di file multimediale vuoi inserire? 1 Immagine, 2 Video, 3 Audio");
			System.out.println("Hai inserito " + i + " file multimediali.");
            tipologia = scanner.nextInt();
            scanner.nextLine();
            switch (tipologia) {

            case 1:
                System.out.println("Inserire titolo immagine.");
                titolo = scanner.nextLine();
                multi[i] = new Immagine(titolo, luminositàiniziale);
                flag = false;
                break;
            case 2:
                System.out.println("Inserire titolo Audio. ");
                titolo = scanner.nextLine();
                System.out.println("Inserire durata Audio " + titolo + ".");
                durata = scanner.nextInt();
                scanner.nextLine();
                multi[i] = new Audio(titolo, volumeiniziale, durata);
                flag = false;
                break;
            case 3:
                System.out.println("Inserire titolo Video. ");
                titolo = scanner.nextLine();
                System.out.println("Inserire durata Video " + titolo + ".");
                durata = scanner.nextInt();
                scanner.nextLine();
                multi[i] = new Filmato(titolo, luminositàiniziale, volumeiniziale, durata);
                flag = false;
                break;
            default:
                System.out.println("Selezione errata! ");
                break;
            }
            
            int scelta = 0;
            
            while (true) {

                System.out.println("Scegli un elemento multimediale da 1-5. Inserisci 0 per uscire!");
                System.out.println("=============");
                System.out.println("    MENU   ");
                for (int a = 0; a < 5; a++) {

                    System.out.println((i + 1) + ")" + multi[i].getTitolo());
                }
               
                System.out.println("=============");

                scelta = scanner.nextInt();
                scanner.nextLine(); 
                if (scelta == 0) System.exit(1);
                System.out.println("exit");

                multi[scelta - 1].start();
                System.out.println("Ho eseguito i tuoi ordini. Vuoi modificare qualcosa del file multimediale? [Y/N]");
                String choice = scanner.nextLine();
                if (choice.equals("Y"))
                    multi[scelta - 1].editSettings(scanner);
            } 
			
		}
			
			
		}
	

	}

}
