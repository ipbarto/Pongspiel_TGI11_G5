package packageSW05;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aufgabe_1 
{

	public static void main(String[] args) 
	{
		

		
		
		double Hoehe ;
		double Breite ;
		double Laenge ;
		double Dichte;
		double Newton = 9.81;
		
		System.out.println("Berechnungsprogramm für Quader");
		System.out.println("Alle Einheiten bezogen auf Zentimeter (cm)");	
		System.out.println("Die Eingabe der Werte folgt ");
		
		
		
		
		Scanner tastatur; 	//Tastaturobjekt wird deklariert
		tastatur = new Scanner(System.in);	//Tastaturobjekt wird erstellt

		
		
		System.out.println("Bitte Hoehe vom Quader eingeben [cm]");
		Hoehe = tastatur.nextDouble();		//Zahl wird jetzt in Konsole eingegeben
		
		System.out.println("Bitte Breite vom Quader eingeben [cm]");
		Breite = tastatur.nextDouble();
		
		System.out.println("Bitte Länge vom Quader eingeben [cm]");
		Laenge = tastatur.nextDouble();
		
		System.out.println("Bitte Dichte vom Quadrermaterial eingeben [kg/dm³]");
		Dichte = tastatur.nextDouble();
		
		
		
		double oberflaeche = 2 * Breite * Laenge + 
							2 * Breite * Hoehe +
							2 * Laenge * Hoehe ;
		double oberflaeche_dm = oberflaeche / 100;
		
		double volumen = Breite * Laenge * Hoehe;
		double volumen_dm = volumen / 1000;
		
		double masse = volumen_dm * Dichte;
		
		double gewichtskraft = masse * Newton;
		
		DecimalFormat df = new DecimalFormat("#.##");
		String mass = df.format(masse);
		String surface = df.format(oberflaeche);
		String surface_dm = df.format(oberflaeche_dm);
		String Volumen1 = df.format(volumen);
		String Volumen1_dm = df.format(volumen_dm);
		String weight_force = df.format(gewichtskraft);
		
		System.out.println("Die Ausgabe der Ergebnisse folgt ");
		System.out.println("Volumen = " + Volumen1 + "cm³ = " + Volumen1_dm + " dm³");
		System.out.println("Oberfläche = " + surface + " cm² = " + surface_dm + " dm²");
		System.out.println("Masse = " + mass + " kg");
		System.out.println("Gewichtskraft = " + weight_force + " N");
		System.out.println("Programmende");
		


	
		
		
		tastatur.close();

	}

}
