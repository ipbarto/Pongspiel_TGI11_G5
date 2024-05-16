package packageSW10;

import java.util.Scanner;

public class Bußgeldrechner {
    public static void main(String[] args)
	{
		
		Scanner tastatur;                   // Scanner: ist Bibliothek (Klasse); tastatur: beliebiger Name
		tastatur = new Scanner(System.in);  // tastatur-Objekt wird erstellt für die Eingabe von Daten
		
		//DecimalFormat nk3;
		//nk3 = new DecimalFormat("#.###");      // nk3 eingestellt auf 3 Nachkommastellen

		double vGefahren, vMax, vZuviel;
		
		
		System.out.println("Bußgeld berechnen für zu schnelles fahren (außerorts)");
		System.out.println();
		System.out.println("Bitte die gefahrene Geschwindigkeit eingeben.");
		vGefahren = tastatur.nextDouble();
		
		System.out.println("Bitte die zulässige  Höchstgeschwindigkeit eingeben.");
		vMax = tastatur.nextDouble();
		
		vZuviel =   vGefahren - vMax-3;
		System.out.println("Maßgebende Geschwindigkeit = " + vZuviel);
		
		if (vZuviel <= 10)
		{
			System.out.println("Strafe: 20 €");
		}
		else if (vZuviel>= 11 && vZuviel <= 15)
		{
			System.out.println("Strafe: 40 €");
		}
		else if (vZuviel>= 16 && vZuviel <= 20)
		{
			System.out.println("Strafe: 60 € und ein Punkt in Flensburg"); 
		}
		else if (vZuviel>= 21 && vZuviel <= 25)
		{
			System.out.println("Strafe: 100 € und ein Punkt in Flensburg"); 
		}
		else if (vZuviel>= 26 && vZuviel <= 30)
		{
			System.out.println("Strafe: 150 € und ein Punkt in Flensburg und ein Monat Fahrverbot"); 
		}
		
		else
		{
			System.out.println("usw ....."); 
		}
		System.out.println("Programmende");
		tastatur.close();
	}
}

/* 
 Pseudocode folgt
 Operation main (...)
 Lokale Variablen: vGefahren, vMax, vZuviel : double
 KA <- "Gefahrene Geschwindigkeit eingeben."
 vGefahren <- TE
 KA <- "Höchstgeschwindigkeit eingeben."
 vMax <- TE
 vZuviel <- vGefahren - vMax -3
 KA <- "Maßgebende Geschwindigkeit = " + vZuviel
 WENN (vZuviel <= 10)
 	KA <- "Strafe 20 €"
 SONST WENN (vZuviel>= 11 UND vZuviel <= 15)
	KA <- "Strafe 40 €" 
SONST WENN  (vZuviel>= 16 && vZuviel <= 20)	
	KA <- "Strafe: 60 € und ein Punkt in Flensburg"  
SONST WENN  (vZuviel>= 21 && vZuviel <= 25)	
	KA <- "Strafe: 100 € und ein Punkt in Flensburg"  
SONST WENN  (vZuviel>= 26 && vZuviel <= 30)	
	KA <- "Strafe: 150 € und ein Punkt in Flensburg und ein Monat Fahrverbot" 
SONST
  	KA <- "usw"
ENDE WENN
KA <- "Programmende"
 */


