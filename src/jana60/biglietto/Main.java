package jana60.biglietto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00€");
		
		System.out.println("Grazie per averci scelto!");
		
		boolean again = false;
		int numBiglietto = 1;
		
		do {
			
			Biglietto biglietto = new Biglietto();
			System.out.println("Biglietto n°" + numBiglietto + "Prego, inserire l'età dell'utente: ");
			biglietto.setEta(Float.parseFloat(scan.nextLine()));
			System.out.print("Inserire km da percorrere: ");
			biglietto.setKm(Float.parseFloat(scan.nextLine()));
			System.out.println("Questo è il prezzo per il biglietto: " + df.format(biglietto.calcPrezzoBiglietto()));
			System.out.println("Vuoi acquistare un altro biglietto? Digita 'SI' per continuare, altrimenti premi Invio.");
			if (scan.nextLine().equalsIgnoreCase("SI")) {
				again = true;
				numBiglietto++;
			} else {
				again = false;
			}
			
		} while (again);
		
		scan.close();
		


	}

}
