package d2;

public class Esercizio2 {
	public static void main(String[] args) {
		
		Sim s1 = new Sim (3383564);
		
		s1.setCredito(25);
		
		
		s1.setCall(new Call[] {
				new Call (123456 , 20.2),
				new Call (456987 , 10.2),
				new Call (128458 , 15.3),
				new Call (123886 , 19.9),
				new Call (177456 , 17.9),
						
		});
		
		s1.printData();
		
	}

}



class Call{
	int numero;
	double durata;
	
	Call(int numero , double durata){
		
		this.numero = numero;
		this.durata = durata;
		
	}
	
	void print() {
		System.out.println("Nmero: " + numero + "Durata: " + durata);
	}
}

class Sim {
	int numTel;
	double credito;
	Call[] lastCalls;
	
	Sim(int numTel){
		this.numTel = numTel;
	}
	
	void printData() {
		System.out.println("Numero: " + numTel);
		System.out.println("Credito: " + credito);
		
		for(Call call : lastCalls) {
			
			System.out.println("Chiamata: "); call.print();
			System.out.println();
		}
	}
	
	void setCall (Call[] lastCalls) {
		this.lastCalls = lastCalls;
	}
	
	void setCredito (int credito) {
		this.credito += credito;
	}
	
}
	




