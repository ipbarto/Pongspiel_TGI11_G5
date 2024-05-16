package packageSW16;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Notenberechnung_schleife {
	
	public static void main(String [] args) 
	{
		int kaanz;
		int Test;
		double KA;
		String antwort;
		
		DecimalFormat nk2;
		nk2 = new DecimalFormat("#.##");
		Scanner Tastatur;
		Tastatur = new Scanner(System.in);


		do {
			System.out.println("Wie viele KA's gibt es? ");
			kaanz = Tastatur.nextInt();
			
			double [] Noten = new double[kaanz];
			
			Test = kaanz;
			
			for(int i = 0; i < Test; i++) 
			{
				System.out.println("Geben sie die " + (i+1) + "KA ein: ");
				KA = Tastatur.nextDouble();
				Noten[i] = KA;
				KA = 0;
				}
			
			System.out.println("\nBestimmten Wert suchen");
			System.out.println("Wert eingeben: ");
			double gesucht = Tastatur.nextDouble();
			boolean gefunden = false;
			
			for(int i =0;i<Noten.length;i++) 
			{
				if(gesucht == Noten[i]) 
				{
					System.out.println("Übereinstimmung gefunden");
					int index = i;
					gefunden = true;
					System.out.println("Suchwert hat den Index: " + index);
					break;			//weiteres Suchen abbrechen
				}
			}
			if (gefunden==false) 
			{
				System.out.println("Der Wert " + gesucht + " wurde nicht gefunden");
			}
			double schlechte = Noten[0];
			System.out.println("\nGrößten Wert ermitteln (schlechteste Note)");
			for(int i=0;i<Noten.length;i++) 
			{
				if (schlechte < Noten[i]) 
				{
					schlechte = Noten[i];
				}
			}
			System.out.println("Größtwert: " + schlechte);
			
			double beste = Noten[0];
			System.out.println("\nKleinsten Wert ermitteln (Beste Note)");
			for(int i=0;i<Noten.length;i++) 
			{
				if (beste > Noten[i]) 
				{
					beste = Noten[i];
				}
			}
			System.out.println("Kleinstwert: " + beste);
			
			System.out.println("\nDurchschnitt");
			double summe = 0;
			for(int i =0;i<Noten.length;i++) 
			{
				System.out.println((i+1) + " Note: " + Noten[i]);
				summe = summe + Noten[i];
			}
			
			double Durchschnitt = (summe/Noten.length);
			System.out.println("\nDurchschnitt: " + nk2.format(Durchschnitt));
			
			System.out.println("\n\nMöchten Sie erneut starten? (Ja/Nein): ");
	        antwort = Tastatur.next();
			} while(antwort.equalsIgnoreCase("Ja"));

		
	}
}
