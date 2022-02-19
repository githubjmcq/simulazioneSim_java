package esercizi;
import java.util.ArrayList;

public class SIM {
	/*Progettare una applicazione che simula un operatore di telefonia cellulare.
	 * Si devono quindi gestirei dati relativi ad una carta SIM ed in particolare: 
	 * il numero di telefono, il credito disponibile, il numero totale delle telefonate effettuate. 
	 * La classe SIM dovr� fornire, inoltre, le seguenti funzionalit�: un costruttore parametrizzato che crea una SIM con numero di telefono,
	 * un credito; un metodo per inserire una telefonata con i relativi dati; 
	 * un metodo per il calcolo dei minuti totali di conversazione; metodo per il calcolo delle telefonate effettuate verso un determinato numero;
	 * metodo per la stampa dei dati della SIM e l�elenco delle telefonate (numero destinatario e durata).
	 */
	
	int numTelefono;
	double credito;
	int numTelefonate;
	ArrayList<Integer> destinatari = new ArrayList<Integer>();
	ArrayList<Integer> MinTotTelefonate = new ArrayList<Integer>();
	
	SIM(int numTelefono, double credito) {
		
		this.numTelefono = numTelefono;
		this.credito = credito;
		
	}
	
	void chiama(int destinatario, int minutiTelefonata) {
		
		destinatari.add(destinatario);
		MinTotTelefonate.add(minutiTelefonata);
		numTelefonate = numTelefonate + 1;

	}
	
	void calcolaMinTotTelefonate() {
		
		int minTot = 0;
		
		for(int i = 0; i < MinTotTelefonate.size(); i++) {
			minTot = minTot + MinTotTelefonate.get(i);
		}
		System.out.println(minTot);
	}
	
	void numTotChiamateA(int destinatario) {
		
		int totChiamate = 0;
		
		for(int i = 0; i < destinatari.size(); i++) {
			if(destinatario == destinatari.get(i) ) {
				totChiamate = totChiamate + 1;
			}
		}
		System.out.println(totChiamate);
	}
	
	void attributiSim() {
		System.out.println("il mio numero: " + numTelefono);
		System.out.println("credito residuo: " + credito);
		System.out.println("numero telefonate: " + numTelefonate);
	}
	
	void elencoTelefonate() {
		
		for(int i = 0; i < destinatari.size(); i++) {
			System.out.print("destinatario: " + destinatari.get(i) + " ");
			System.out.println("durata: " + MinTotTelefonate.get(i) + " ");
		}
	}
}
