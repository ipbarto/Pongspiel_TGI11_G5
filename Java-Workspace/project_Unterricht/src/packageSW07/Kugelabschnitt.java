package packageSW07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kugelabschnitt {
	public static void main(String[] args) 
	{
	double Kugeldurchmesser;
	double Hoehe;
	double Radius;
	double Volumen_mm;
	double Volumen_cm;
	double Oberfläche_mm;
	double Oberfläche_cm;
	double Mantelfläche_mm;
	double Mantelfläche_cm;
	String name = "Lenny";
	
	//Eingabe Gerät
	Scanner tastatur;
	tastatur = new Scanner(System.in);
	
	// round to 3 decimal places
	DecimalFormat nk3;
	nk3 = new DecimalFormat("#.###");
	
	// put in the values
	System.out.println("Kugelabschnitt berechnen");
	System.out.println("Bitte geben sie den Kugeldurchmesser an [mm]: ");
		Kugeldurchmesser = tastatur.nextDouble();
	System.out.println("Bitte geben sie die Höhe des Abschnittes ein [mm]: ");
		Hoehe = tastatur.nextDouble();
	
	//Berechnungen
	Radius = Kugeldurchmesser / 2;
	Volumen_mm = Math.PI * Math.pow(Hoehe, 2) * ((Kugeldurchmesser/2) - (Hoehe/3));
	Oberfläche_mm = Math.PI * Hoehe * ((2 * Kugeldurchmesser) - Hoehe);
	Mantelfläche_mm = Math.PI * Kugeldurchmesser * Hoehe;
	
	//Umrechnung in cm
	Volumen_cm = Volumen_mm / 1000;
	Oberfläche_cm = Oberfläche_mm / 100;
	Mantelfläche_cm = Mantelfläche_mm / 100;
	
	System.out.println("Der Radius ist: " + nk3.format(Radius) + "mm");
	System.out.println("Das Volumen ist: " + nk3.format(Volumen_mm) + "mm³ ;" + nk3.format(Volumen_cm) + "cm³" );
	System.out.println("Die Oberfläche ist: " + nk3.format(Oberfläche_mm) + "mm² ;" + nk3.format(Oberfläche_cm) + "cm²" );
	System.out.println("Die Mantelfläche ist: " + nk3.format(Mantelfläche_mm) + "mm² ;" + nk3.format(Mantelfläche_cm) + "cm²" );
	System.out.println("My name is " + name);
		
	tastatur.close();
	}
}
