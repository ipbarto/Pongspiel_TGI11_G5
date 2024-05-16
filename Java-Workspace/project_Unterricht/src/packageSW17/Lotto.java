package packageSW17;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);
		String taste;
		// Aufgabe a.)
		
		int Ziehung [] = new int[6];           //Deklaration von Array 
		int tipp [] = new int[6];           //Deklaration von Array 
			
			for(int i = 0; i < tipp.length; i++)
			{
					System.out.println("Zahl  " + (i+1) + "  =  ");
					tipp[i] = tastatur.nextInt();
			}
			System.out.println("----------------------------------------------------------------------");
			
			// Aufgabe b.)
			System.out.println("Mein Tipp unsortiert ausgeben");
			for(int i = 0; i < tipp.length; i++)
			{

					System.out.println("Tippzahl  " + (i+1) + " = " + tipp[i]);

			}
			
			System.out.println("----------------------------------------------------------------------");
			
			// Aufgabe c.)
			
		for(int i = 0; i < Ziehung.length; i++)
		{
				 Ziehung[i]= (int) (Math.random() * 49 +1 ); 
		}
		// Aufgabe d.)
		System.out.println("Ziehung ausgeben");
		for(int i = 0; i < Ziehung.length; i++)
		{

				System.out.println("Zahl der Ziehung  " + (i+1) + " = " + Ziehung[i]);

		}
		System.out.println("----------------------------------------------------------------------");
		// Sortieren
		int hilf;
		for (int  i = 0; i < (tipp.length -1) ; i = i +1)
		{
			for (int k = (i+1); k<tipp.length; k = k +1)
			{
		        // System.out.println("Index vom Vergleich: i = " + i + " k = " + k );
				// System.out.println("Vergleichen von + " + tipp[i] + " mit " + tipp[k]);
				if (tipp[i] > tipp[k])   // dann tauschen
				{
					hilf = tipp[k];
					tipp[k] = tipp[i];
					tipp[i] = hilf;
					System.out.println("Getauscht");
				}
			}
			// System.out.println("Taste drücken");
			// taste= tastatur.next();
		}  // Ende vom Sortieren
        System.out.println("Tipp sortiert ausgeben");
		for(int i = 0; i < tipp.length; i++)
		{

				System.out.println("Zahl  " + (i+1) + " = " + tipp[i]);

		}
		
		// Aufgabe: Größtwert vom Array Ziehung ermitteln und ausgeben
		int max = 0;
		System.out.println("Größtwert von Ziehung = " + max);
		
		// Aufgabe: Größtwert vom Array Ziehung ermitteln und ausgeben
		int min = 0;
		System.out.println("Kleinstwert von Ziehung = " + min);

		// Aufgabe: Durchschnitt ermitteln
		// 1. Schitt: Summe bilden von allen Zahlen vom Array
		// 2. Schritt: Summe / Anzahl
		
	}

}
