package packageSW16;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Messwerte2 {

	public static void main(String[] args) {
		
		DecimalFormat nk5;
		nk5 = new DecimalFormat("#.#####");
		
		Scanner tastatur;
		tastatur = new Scanner(System.in);
		int Messwerte;
		double numbera;
		
		do {
		System.out.println("Anzahl der Messwerte (max. 31): ");
		Messwerte = tastatur.nextInt();
		} while (Messwerte > 31 );
		
		double[] Wert = new double[Messwerte];
		
		
		for (int i = 0; i<Wert.length; i++) {
			System.out.println("Messwert " + (i+1) + " : " );
			numbera = tastatur.nextDouble();
			Wert[i] = numbera;
		}
		
		System.out.println("\nAusgabe:");
		for (int i = 0; i<Wert.length; i++) {
			System.out.println((i+1) + ". Messwert: " + Wert[i] );
		}
		
		double max = Wert[0];
		System.out.println("\nGrößten Wert ermitteln (maximal)");
		for(int i=0;i<Wert.length;i++) 
		{
			if (max < Wert[i]) 
			{
				max = Wert[i];
			}
		}
		System.out.println("Max: " + max);
		
		double min = Wert[0];
		System.out.println("\nKleinst Wert ermitteln (minimal)");
		for(int i=0;i<Wert.length;i++) 
		{
			if (min > Wert[i]) 
			{
				min = Wert[i];
			}
		}
		System.out.println("Min: " + min);
		
		double summe = 0;
		for (int i = 0; i<=Wert.length-1; i++){
			summe = Wert[i] + summe;
		}
		
		double Durchschnitt = summe/Wert.length;
		System.out.println("\nDruchschnitts Messwert: " + (nk5.format(Durchschnitt)));
		
		//Abweichung
		for(int i=0; i<Wert.length;i++) {
			double abweichung = Wert[i] - Durchschnitt;
			System.out.println("Abweichung " + (i+1) + " vom Durchschnitt = " + nk5.format(abweichung));
		}
		
		
		

	}

}
