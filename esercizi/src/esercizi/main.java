package esercizi;
import java.util.Scanner;

public class main{
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Crea il tuo numero di telefono");
		
		System.out.println("inserisci il tuo numero:");
		int numero = scanner.nextInt();
		System.out.println("inserisci il tuo credito:");
		int credito = scanner.nextInt();
		
		scanner.nextLine();
		
		SIM sim = new SIM(numero, credito);

		System.out.println("Vuoi telefonare? \ndigita: si oppure no");
		String risposta = scanner.nextLine();
	
		if(risposta.equals("si")) {
			System.out.println("Inserisci il numero da telefonare:");
			int number = scanner.nextInt();
			System.out.println("Quanti minuti vuoi telefonare?");
			int minuti = scanner.nextInt();
			
			sim.chiama(number, minuti);
			sim.attributiSim();
			sim.elencoTelefonate();
		}else {
			System.out.println("Programma terminato");
		}
	}	
}