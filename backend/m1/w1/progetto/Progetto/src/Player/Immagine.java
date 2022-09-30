package Player;
import java.util.Scanner;


public class Immagine extends Multimedia implements Luminosita{
	
	private int luminosita;
	
	public Immagine(String titolo, int luminosita) {
		super(titolo);
		
		this.luminosita = luminosita;
		
	}
	
	public void editSettings(Scanner in){
        int luminosita;
        System.out.println("Inserire nuovo valore di Luminosità per " + getTitolo());
        luminosita = in.nextInt();
        in.nextLine();
        if (this.luminosita > luminosita)
            diminuisciluminosita(luminosita);
        else
            aumentaluminosita(luminosita);
    }

    public void show() {
        String asterischi = "";
        for (int a = 0; a < this.luminosita; a++) {
            asterischi += "*";
        }
        System.out.println(getTitolo() + " " + asterischi);
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



}
	


