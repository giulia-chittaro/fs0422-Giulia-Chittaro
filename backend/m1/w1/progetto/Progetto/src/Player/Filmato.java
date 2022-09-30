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
		
		this.luminosita = alza;
		
	}

	@Override
	public void diminuisciluminosita(int abbassa) {
		
		this.luminosita = abbassa;
	}
	
	@Override
	public void abbassavolume(int volume) {
	
		  this.volume = volume;
	}

	@Override
	public void alzavolume(int volume) {
		this.volume = volume;
	}

}
