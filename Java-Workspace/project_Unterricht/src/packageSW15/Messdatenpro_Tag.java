package packageSW15;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Messdatenpro_Tag {

	public static void main(String[] args) {
		
		Scanner tastatur;
		tastatur = new Scanner(System.in);
		
		int[] Temperatur = new int[7];
		
		
		for (int i = 0; i<7; i++) {
			System.out.println("Type Temp day " + (i+1) + " : " );
			int n = tastatur.nextInt();
			Temperatur[i] = n;
		}
		int summe = 0;
		for (int i = 0; i<=Temperatur.length-1; i++){
			
			summe = Temperatur[i] + summe;
			System.out.println("Temperatur Tag " + i + ": " + Temperatur[i]);
		}
		int Durchschnitt = summe/Temperatur.length;
		
		System.out.println("\nDurchschnitts Temp: " + (Durchschnitt));
		
		int Groeßer = 0;
		
		for (int i = 0; i<=Temperatur.length-1; i++){
			if (Temperatur[i] > Durchschnitt) {
				Groeßer++;
			}
		}
		System.out.println("An " + Groeßer + " Tagen lag die Temperatur höher als die Durchschnitt");
		
	}

}
