package Player;
import java.util.Scanner;
import Player.Volume;

public class Audio extends Multimedia implements Volume{
	
	private int volume ; 
	private int durata;
	
	public Audio(String titolo, int volume, int durata) {
		super(titolo);
		this.volume = volume;
		this.durata = durata;
	}
	
	 public void start()
	    {
	        play();
	    }
	 
	        public void editSettings(Scanner in) {
	  
	        int volume = 0;
	        System.out.println("Inserire il nuovo valore di Volume per " + getTitolo());
	        volume = in.nextInt();
	        in.nextLine();
	        if (this.volume > volume)
	            alzavolume(volume);
	        else
	            abbassavolume(volume);
	    }

	    public void play() {
	        String esclamativo = "";
	        String durata = "";
	        for (int a = 0; a < this.volume; a++) {
	            esclamativo += "!";
	        }
	        for (int a = 0; a < this.durata; a++) {
	            durata += getTitolo();
	        }
	        System.out.println(durata + " " + esclamativo);
	    }


	@Override
	public void abbassavolume(int meno) {
	
		  this.volume = meno;
	}

	@Override
	public void alzavolume(int aumenta) {
		this.volume = aumenta;
	}

}
