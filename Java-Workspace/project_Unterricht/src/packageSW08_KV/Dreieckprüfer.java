package packageSW08_KV;

import java.util.Scanner;

public class Dreieckprüfer {

	public static void main(String[] args) 
	{
		// 9.11.2023
		double a, b, c;
		
		Scanner tastatur;                   // Scanner: ist Bibliothek (Klasse); tastatur: beliebiger Name
		tastatur = new Scanner(System.in);  // tastatur-Objekt wird erstellt für die Eingabe von Daten


        System.out.println("Seiten prüfen, ob diese ein Dreieck ergeben");
        // Eingabe folgt
        System.out.println("Bitte Seite a vom Dreieck eingeben [LE]");
		a = tastatur.nextDouble();
		
        System.out.println("Bitte Seite b vom Dreieck eingeben [LE]");
		b = tastatur.nextDouble();
	    
        System.out.println("Bitte Seite c vom Dreieck eingeben [LE]");
		c = tastatur.nextDouble();


		System.out.println("a: " + a + ", b: " + b + ", c: " + c);

		// Ergebnisse ausgeben
	    if (a < b + c && b < a + c && c < a + b )
			{
				System.out.println("It's a triangle");
			}
	    else if (a > b + c || b > a + c || c > a + b )
			{
				System.out.println("Something is wrong. Not a triangle");
			}
	    else 
	    {
	    	System.out.println("Something is wrong. Not a triangle");
		}

	    System.out.println("Programmende");

		tastatur.close();
	}

}
