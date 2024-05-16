package package_KA1_A2_FestigkeitRohrLenBar;

import java.util.Scanner;
import java.text.DecimalFormat;

public class FestigkeitRohr 
{
	public static void main(String[] args)
	{
		// Hier programmieren
		// Viel Erfolg
		// Hier noch Ihren Namen eintragen: Lenny Bartossek
		
		
		double D;
		double d;
		double sigma;
		double f1;
		double a1;
		double f2;
		double a2;
		double Frx;
		double Fry;
		double Fr;
		double A;
		double Bvor;
		
		DecimalFormat nk1;
		nk1 = new DecimalFormat("#.#");
		Scanner tastatur;
		tastatur = new Scanner(System.in);
		
		//Eingabe
		System.out.println("Geben sie den Außendurchmesser[mm] an: ");
			D = tastatur.nextDouble();
		System.out.println("Geben sie den Innendurchmesser[mm] an: ");
			d = tastatur.nextDouble();
		System.out.println("Geben sie die Zulässige Kraft [N/mm²] an: ");
			sigma = tastatur.nextDouble();
		System.out.println("Geben sie die Kraft F1 [N] an: ");
			f1 = tastatur.nextDouble();
		System.out.println("Geben sie die Wirkungsrichtung von F1 [a1 in Grad] an: ");
			a1 = tastatur.nextDouble();
		System.out.println("Geben sie die Kraft F2 [N] an: ");
			f2 = tastatur.nextDouble();
		System.out.println("Geben sie die Wirkungsrichtung von F2 [a2 in Grad] an: ");
			a2 = tastatur.nextDouble();
		
			
		//Berechnung
		A = (Math.pow(D, 2) - Math.pow(d, 2)) * (Math.PI / 4);
		System.out.println("Querschnitt: " + nk1.format(A));
		
		Frx = f1 * Math.cos(Math.toRadians(a1)) + f2 * Math.cos(Math.toRadians(a2));
		System.out.println("Kraft F1: " + nk1.format(Frx));
		
		Fry = f1 * Math.sin(Math.toRadians(a1)) + f2 * Math.sin(Math.toRadians(a2));
		System.out.println("Kraft F2: " + nk1.format(Fry));
		
		Fr = Math.sqrt(Math.pow(Frx, 2) + Math.pow(Fry, 2));
		System.out.println("Kraft Fr: " + nk1.format(Fr));
		
		Bvor = Fr / A;
		System.out.println("Resultierende Kraft: " + nk1.format(Bvor));
		
		
		//Ausgabe
		System.out.println("Die Vorhandene Belastung ist : " + nk1.format(Bvor));
		
		if (Bvor > sigma) {
			System.out.println("Rohr reißt");
		}
		else {
			System.out.println("Alles passt");
		}
		
		
		tastatur.close();
	}

}
