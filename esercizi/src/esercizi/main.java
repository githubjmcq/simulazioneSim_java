package esercizi;

public class main{
	
	public static void main(String[] args) {
		
		SIM sim1 = new SIM(320286868, 10);
		SIM sim2 = new SIM(789456123, 15);
		
		sim1.chiama(123456789, 5);
		sim1.chiama(123456789, 3);
		sim1.chiama(234567890, 15);
		sim1.chiama(123456789, 7);
		sim1.chiama(234567890, 8);
		sim1.chiama(123456789, 1);
		sim1.chiama(123456789, 7);
		sim1.chiama(234567890, 8);
		sim1.chiama(123456789, 1);
		
		sim2.chiama(346823773, 7);
		sim2.chiama(234567890, 8);
		sim2.chiama(397226818, 1);
		sim2.chiama(346823773, 1);
		
		sim1.calcolaMinTotTelefonate();
		sim1.numTotChiamateA(123456789);
		sim1.attributiSim();
		sim1.elencoTelefonate();
		
		sim2.calcolaMinTotTelefonate();
		sim2.numTotChiamateA(346823773);
		sim2.attributiSim();
		sim2.elencoTelefonate();
		
		}	
}
