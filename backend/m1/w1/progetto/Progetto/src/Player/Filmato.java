package Player;
import java.util.Scanner;

public class Filmato extends Multimedia implements Luminosita , Volume {
	
	private int luminosita;
	private int volume;
	private int durata;
	
	public Filmato(String titolo, int luminosita, int volume, int durata) {
		super (titolo);
		this.luminosita = luminosita;
		this.volume = volume;
		this.durata = durata;
	}
	
	
	 public void editSettings(Scanner in)
	    {
	        int luminosita,volume;
	        System.out.println("Inserire nuovo valore di Luminosità per " + getTitolo());
	        luminosita = in.nextInt();
	        in.nextLine();
	        if (this.luminosita > luminosita)
	           diminuisciluminosita(luminosita);
	        else
	            aumentaluminosita(luminosita);

	        System.out.println("Inserire il nuovo valore di Volume per " + getTitolo());
	        volume = in.nextInt();
	        in.nextLine();
	        if (this.volume > volume)
	            alzavolume(volume);
	        else
	            abbassavolume(volume);
	    }

	    public void play() {
	        String asterischi = ""; String esclamativo = ""; String durata = "";
	        for (int a = 0; a < this.luminosita; a++) {
	            asterischi += "*";
	        }
	        for (int a = 0; a < this.volume; a++) {
	            esclamativo += "!";
	        }
	        for (int a = 0; a < this.durata; a++) {
	            durata += getTitolo();
	        }
	        System.out.println(durata + " " + esclamativo + " " + asterischi);
	    }

	@Override
	public void aumentaluminosita(int alza) {
		
		   if (alza > this.luminosita) this.luminosita = alza;
	        else System.out.println("valore inserito maggiore o uguale");
		
	}

	@Override
	public void diminuisciluminosita(int abbassa) {
		
		  if (abbassa < this.luminosita) this.luminosita = abbassa;
	        else System.out.println("valore inserito minore o uguale");
	}
	
	@Override
	public void abbassavolume(int meno) {
		
		 if (meno < this.volume) this.volume = meno;
	        else System.out.println("valore inserito minore o uguale");
	}

	@Override
	public void alzavolume(int aumenta) {
		 if (aumenta > this.volume) this.volume = aumenta;
	        else System.out.println("valore inserito maggiore o uguale");
	}

}
