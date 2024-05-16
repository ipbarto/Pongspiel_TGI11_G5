package packageSW14;

import java.util.Scanner;

public class Wertetabelle_fuer_quadr_Funktionen {

	public static void main(String[] args) {
		// Eingabe

		double a;
		double b;
		double c;
		double startwert;
		double endwert;
		double schrittweite;
		double y;
		char Abfrage;

		Scanner eingabe;
		eingabe =new Scanner(System.in);
		System.out.println("Wertetabelle für quadratische Funktionen berechnen");
		System.out.println("----------------------------------------------------");

		do {


			System.out.println("Eingabe folgt");
			System.out.println("Startwert eingeben:");
			startwert = eingabe.nextDouble();		

			System.out.println("Endwert eingeben:");
			endwert=eingabe.nextDouble();

			if(endwert>startwert) {
				System.out.println("Schrittweite eingeben:");
				schrittweite = eingabe.nextDouble();
				System.out.println("Geben Sie a ein:");
				a = eingabe.nextDouble();	
				System.out.println("Geben Sie b ein:");
				b = eingabe.nextDouble();
				System.out.println("Geben Sie c ein:");
				c = eingabe.nextDouble();	

				// Schleife
				System.out.println();
				System.out.println("Ausgabe der Wertetabelle");
				System.out.println("x \t y");
				System.out.println("--------------------");

				for (double x=startwert;x<endwert;x=x+schrittweite) {

					y = a * x* x + b * x + c;
					System.out.println(x+ "\t"+y);
				}
			} else {
				System.out.println("Fehler --> Endpunkt muss größer als Startpunkt sein");
			}
			System.out.println("Programm wiederholen? (J/N)");
			Abfrage = eingabe.next().charAt(0);	//Eingabe von char Variable
			Abfrage = Character.toLowerCase(Abfrage);
		} while (Abfrage == 'j' );
		System.out.println("Programmende");
	}

}















