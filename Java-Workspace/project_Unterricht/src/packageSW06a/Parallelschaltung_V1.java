package packageSW06a;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Parallelschaltung_V1 {
	public static void main(String[] args) 
	{
	DecimalFormat nk3;				//nk3 wird deklariert
	nk3 = new DecimalFormat("#.###");
	Scanner tastatur;
	tastatur = new Scanner(System.in);
	
	double Gesamtwiderstand;
	double Gesamtstrom;
	double Gesamtspannung;
	double Einzelwiderstand_R1;
	double Einzelwiderstand_R2;
	double Teilstrom_I1;
	double Teilstrom_I2;
	double Leistung;
	
	System.out.println("Berechnung einzelner Teile einer Parallelschaltung");
	System.out.println("geben sie die Spannung ein ");
	Gesamtspannung = tastatur.nextDouble();
	
	System.out.println("Geben sie den Widerstand von R1 an ");
	Einzelwiderstand_R1 = tastatur.nextDouble();
	
	System.out.println("Geben sie den Widerstand von R2 an ");
	Einzelwiderstand_R2 = tastatur.nextDouble();
	
	if (Einzelwiderstand_R1 > 0 && Einzelwiderstand_R2 > 0)
		{
			
		
		Gesamtwiderstand = (Einzelwiderstand_R1 * Einzelwiderstand_R2) / (Einzelwiderstand_R1 + Einzelwiderstand_R2);
		
		Gesamtstrom = Gesamtspannung / Gesamtwiderstand;
		
		Teilstrom_I1 = Gesamtspannung / Einzelwiderstand_R1;
		
		Teilstrom_I2 = Gesamtspannung / Einzelwiderstand_R2;
		
		Leistung = Gesamtspannung * Gesamtstrom;
		
		System.out.println("Der Gesamtwiderstand ist: " + nk3.format(Gesamtwiderstand) + "Ω");
		System.out.println("Der Gesamtstrom ist: " + Gesamtstrom + "A");
		System.out.println("Die Leistung ist: " + nk3.format(Leistung) + "W");
		System.out.println("Teilstrom 1 ist " + Teilstrom_I1);
		System.out.println("Teilstrom 2 ist " + Teilstrom_I2);
		}
	
	else
		{
		System.out.println("Wrong input");
		}
			
	tastatur.close();		
	}
}
