package esercizi;
import java.util.ArrayList;

public class SIM {
	/*Progettare una applicazione che simula un operatore di telefonia cellulare.
	 * Si devono quindi gestirei dati relativi ad una carta SIM ed in particolare: 
	 * il numero di telefono, il credito disponibile, il numero totale delle telefonate effettuate. 
	 * La classe SIM dovr? fornire, inoltre, le seguenti funzionalit?: un costruttore parametrizzato che crea una SIM con numero di telefono,
	 * un credito; un metodo per inserire una telefonata con i relativi dati; 
	 * un metodo per il calcolo dei minuti totali di conversazione; metodo per il calcolo delle telefonate effettuate verso un determinato numero;
	 * metodo per la stampa dei dati della SIM e l?elenco delle telefonate (numero destinatario e durata).
	 */
	
	private int numTelefono;
	private double credito;
	private int numTelefonate;
	
	private ArrayList<Integer> destinatariChiamate = new ArrayList<Integer>();
	private ArrayList<Integer> MinTotTelefonate = new ArrayList<Integer>();
	
	private ArrayList<Integer> destinatariMessaggi = new ArrayList<Integer>();
	private ArrayList<String> messaggi = new ArrayList<String>();
	
	SIM(int numTelefono, double credito) {
		
		this.numTelefono = numTelefono;
		this.credito = credito;
		
	}
	
	void chiama(int destinatario, int minutiTelefonata) {
		
		destinatariChiamate.add(destinatario);
		MinTotTelefonate.add(minutiTelefonata);
		credito = credito - (minutiTelefonata * 0.19);
		numTelefonate++;

	}
	
	void mandaSMS(int destinatario, String Messaggio ) {
		
		destinatariMessaggi.add(destinatario);
		messaggi.add(Messaggio);
		credito = credito - 0.16;
		
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
		
		for(int i = 0; i < destinatariChiamate.size(); i++) {
			if(destinatario == destinatariChiamate.get(i) ) {
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
		
		System.out.println("\nElenco telefonate: ");
		
		for(int i = 0; i < destinatariChiamate.size(); i++) {
			System.out.print("destinatario: " + destinatariChiamate.get(i) + " ");
			System.out.println("durata: " + MinTotTelefonate.get(i) + " ");
		}
	}
	
	void elencoSMS() {
		
		System.out.println("\nElenco messaggi: ");
		
		for(int i = 0; i < destinatariMessaggi.size(); i++) {
			System.out.print("destinatario: " + destinatariMessaggi.get(i) + " ");
			System.out.println("messaggio: " + messaggi.get(i) + " ");
		}
		
	}
}
