package it.epicode.be;

import java.util.Arrays;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		
		System.out.println(moltiplica(5,4));
		
		System.out.println(concatena("Ciao Giulia", 8));
		
		//System.out.println(InserisciInArray(, "ciao") ) ;
		
		System.out.println( ImplementaStringhe( "ciao", "come", "stai"));
		
		System.out.println(perimetroRettangolo (6, 8));
		
		System.out.println(pariDispari(6));
		
		System.out.println(pariDispari(15));
		}

//MOLTIPLICA: ACCETTA DUE INTERI E RITORNA IL LORO PRODOTTO	

public static int moltiplica (int x, int y) {
	return x + y;
}

//CONCATENA: ACCETTA UNA STRINGA E UN INTERO E RESTITUISCE UNA STRINGA CHE CONCATENA GLI ELEMENTI

public static String  concatena (String s1, int z) {
	return s1 + z;
}


//INSERISCIINARRAY : ARRAY DI STRINGHE DI 5 ELEMENTI E UNA STRINGA, RESTITUIRE ARRAY DI 6 ELEMENTI 
//LA STRINGA PASSATA AL 3 POSTO E LE STRINGHE PRECEDENTI IN QUARTA E QUINTA VANNO IN QUINTA E SESTA.


/* public static String InserisciInArray ( String[] myArray , String s2  ) {
	
	String[] myarray = new String[6];
	
	myArray[0] = "one";
	myArray[1] = "two";
	myArray[2] = "three";
	myArray[3] = "four";
	myArray[4] = "five";
	

	String[] frase = { myArray[0] + myArray[1] + s2 + myArray[3] + myArray[4]};
	
	return frase;

	
}*/


//esercizio 3

public static String ImplementaStringhe ( String a , String b , String c ) {
	
	return (a + b + c) + "" + (c + b + a);
}


public static int perimetroRettangolo ( int base, int altezza) {
	
	return (base *2) + ( altezza * 2);
	
}

public static String pariDispari ( int g) {
	
	if( g%2 == 0)  {return "il numero è pari ";} else { return "il numero è dispari";} 
	
}




}

















