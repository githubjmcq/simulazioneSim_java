package esercizi;
import java.util.Scanner;

public class main{
	
	public static void main(String[] args) {
		
		/*Con questa tariffa � possibile telefonare verso tutti al costo di 19 cent al minuto,
		 * mentre gli sms vengono tariffati a 16 cent l�uno.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Crea il tuo numero di telefono");
		
		System.out.println("inserisci il tuo numero:");
		int numero = scanner.nextInt();
		System.out.println("inserisci il tuo credito:");
		int credito = scanner.nextInt();
		
		scanner.nextLine();
		
		SIM sim = new SIM(numero, credito);
		
		int number;
		int minuti;

		System.out.println("Vuoi telefonare? \ndigita: si oppure no");
		String risposta = scanner.nextLine();
	
		while(risposta.equals("si")) {
			
			System.out.println("Inserisci il numero da telefonare:");
			number = scanner.nextInt();
			System.out.println("Quanti minuti vuoi telefonare?");
			minuti = scanner.nextInt();
			scanner.nextLine();
			sim.chiama(number, minuti);
			
			System.out.println("telefonata effettuata");
			
			System.out.println("\nVuoi ancora telefonare? \ndigita: si oppure no");
			risposta = scanner.nextLine();
		}
		sim.attributiSim();
		sim.elencoTelefonate();
		System.out.println("\nProgramma terminato");
	}	
}