package packageSW08_KV;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ParallelschaltungV1 {

	public static void main(String[] args) 
	{
		// 9.11.2023
		double R1, R2, U, P, I1, I2, Rges, Iges;
		
		Scanner tastatur;                   // Scanner: ist Bibliothek (Klasse); tastatur: beliebiger Name
		tastatur = new Scanner(System.in);  // tastatur-Objekt wird erstellt für die Eingabe von Daten
		
		DecimalFormat nk3;
		nk3 = new DecimalFormat("#.###");      // nk3 eingestellt auf 3 Nachkommastellen


        System.out.println("Programm Parallelschaltung");
        // Eingabe folgt
        System.out.println("Bitte Spannung U eingeben [V]");
		U = tastatur.nextDouble();
		
	    System.out.println("Bitte Widerstand 1 eingeben [Ohm]");
	    R1 = tastatur.nextDouble();
	    
	    System.out.println("Bitte Widerstand 2 eingeben [Ohm]");
	    R2 = tastatur.nextDouble();
	    
	    // Verarbeitung folgt
	    Rges = R1 * R2 / ( (R1+R2));
	    Iges = U / Rges;
	    I1 = U / R1;
	    I2 = U / R2;
	    P = U * Iges;
	   
	    
	    
	    // Ergebnisse ausgeben
	    System.out.println("Gesamtwiderstand [Ohm] = " + nk3.format(Rges));
	    System.out.println("Teilstrom 1 [A] = " + nk3.format(I1));
	    System.out.println("Teilstrom 2 [A] = " + nk3.format(I2));
	    System.out.println("Gesamttrom  [A] = " + nk3.format(Iges));
	    System.out.println("Leistung  [W] = " + nk3.format(P));
	    
	    System.out.println("Programmende");
	    
		tastatur.close();
	}

}
