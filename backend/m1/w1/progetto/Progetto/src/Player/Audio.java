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

	    public String play() {
	        String esclamativo = "";
	        String durata = "";
	        for (int a = 0; a < this.volume; a++) {
	            esclamativo += "!";
	        }
	        for (int a = 0; a < this.durata; a++) {
	            durata += getTitolo();
	        }
	        return durata + " " + esclamativo;
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
