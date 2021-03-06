package esercizi;
import java.util.Scanner;

public class main{
	
	public static void main(String[] args) {
		
		/*Con questa tariffa ? possibile telefonare verso tutti al costo di 19 cent al minuto,
		 * mentre gli sms vengono tariffati a 16 cent l?uno.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Crea il tuo numero di telefono");
		
		System.out.println("inserisci il tuo numero:");
		int numero = scanner.nextInt();
		System.out.println("inserisci il tuo credito:");
		int credito = scanner.nextInt();
		
		scanner.nextLine();
		
		SIM sim = new SIM(numero, credito);

		System.out.println("Vuoi telefonare? \ndigita: si oppure no");
		String risposta1 = scanner.nextLine();
	
		while(risposta1.equals("si")) {
			
			System.out.println("Inserisci il numero da telefonare:");
			int number = scanner.nextInt();
			System.out.println("Quanti minuti vuoi telefonare?");
			int minuti = scanner.nextInt();
			scanner.nextLine();
			sim.chiama(number, minuti);
			
			System.out.println("telefonata effettuata");
			
			System.out.println("\nVuoi ancora telefonare? \ndigita: si oppure no");
			risposta1 = scanner.nextLine();
		}
		
		System.out.println("Vuoi mandare un SMS? \ndigita: si oppure no");
		String risposta2 = scanner.nextLine();
		
		while(risposta2.equals("si")) {
			System.out.println("Inserisci il numero a cui inviare l'sms");
			int number = scanner.nextInt();
			scanner.nextLine();
			System.out.println("scrivi il messaggio:");
			String messaggio = scanner.nextLine();
			sim.mandaSMS(number, messaggio);
			
			System.out.println("messaggio inviato");
			
			System.out.println("\nVuoi ancora mandare un SMS? \ndigita: si oppure no");
			risposta2 = scanner.nextLine();
		}
		
		sim.attributiSim();
		sim.elencoTelefonate();
		sim.elencoSMS();
		System.out.println("\nProgramma terminato");
	}	
}