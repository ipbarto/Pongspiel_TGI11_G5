package packageSW14;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kreisaussschnitt {

	public static void main(String[] args) {

		Scanner tastatur;
		tastatur = new Scanner(System.in);
		
		DecimalFormat nk1;
		nk1  = new DecimalFormat("#.#");

		double A;	//Flächeninhalt
		double d;	//Durchmesser
		double lB;	//Bogenlänge
		double l;	//Sehnenlänge
		double r;	//Radius
		double Mpw;	//Mittelpunktwinkel
		String antwort;

		do {
			

		do {
			System.out.println("Geben sie den Durchmesser an (mm) : ");
			d = tastatur.nextDouble();
		} while (d <= 0);

		do {
			System.out.println("Geben sie den Mittelpunktswinkel ein: ");
			Mpw = tastatur.nextDouble();
		} while (Mpw <= 0 || Mpw > 360);

		//Berechnungen
		Mpw = Math.toRadians(Mpw);
		r = d/2;
		l = 2 * r * Math.sin(Mpw/2);
		lB = (Math.PI * r * Mpw) / (Math.toRadians(180));
		A = (lB * r)/2;
		
		System.out.println("der Radius ist: " + nk1.format(r) + "mm");
		System.out.println("der Flächeninhalt  ist: " + nk1.format(A) + "mm²");
		System.out.println("der Sehnelänge ist: " + nk1.format(l) + "mm");
		System.out.println("der Bogenlänge ist: " + nk1.format(lB) + "mm");
		
		System.out.println("\nNochmal?");
		antwort = tastatur.next();
		} while (antwort.equalsIgnoreCase("Ja"));
		
	}

}
