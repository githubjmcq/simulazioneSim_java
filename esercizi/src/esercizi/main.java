package esercizi;
import java.util.Scanner;

public class main{
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		SIM sim = new SIM(123456789, 10);

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