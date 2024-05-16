package packageSW16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		System.out.println("Programm Lotto");

		Scanner Tastatur;
		Tastatur = new Scanner(System.in);
		String antwort;
		do {


			boolean duplicates;
			int gewinn=0;
			int Zahl;
			int[] Tipp = new int[6];
			int[] ziehung = new int[6];
			int[] richtige = new int[6];
			List<Integer> myTipp = new ArrayList<Integer>();
			List<Integer> Richti = new ArrayList<Integer>();
			List<Integer> Luck = new ArrayList<Integer>();

			for(int i=1;i<=Tipp.length;i++) {
				do {
					System.out.println("Zahl " + i + " : ");
					Zahl = Tastatur.nextInt();
					myTipp.add(Zahl);
					Tipp[(i-1)] = Zahl;
				} while (Zahl>49 || Zahl<1 || !myTipp.contains(Zahl));
			}

			for(int i=0; i<Tipp.length;i++) {
				System.out.println("Zahl " + (i+1) + " : " + Tipp[i]);
			}

			for(int i=0; i<ziehung.length;i++) {
				ziehung[i] = (int) (Math.random() * 49 + 1);
				if(i<0) {
					if(ziehung[i]==ziehung[(i-1)]) {
						do {
							ziehung[i] = (int) (Math.random() * 49 + 1);
							Luck.add(ziehung[i]);
						} while(ziehung[i] != ziehung[(i-1)] || !Luck.contains(ziehung[i]));
					}
					else {
						continue;
					}
				}

			}
			Arrays.sort(ziehung);
			Arrays.sort(Tipp);
			/*
			for(int i=0;i<(Tipp.length-1);i++) {
				for(int j = i +1;j<Tipp.length;j++) {
					if (Tipp[i]>Tipp[j]) {
						int merke = Tipp[j];
						Tipp[j] = Tipp[i];
						Tipp[i] = merke;
					}
				}
			}
			 */
			System.out.println("\n---------------------------------------------------\n");
			for (int i = 0;i<ziehung.length;i++) {
				System.out.println("zufallszahl " + (i+1) + " : " + ziehung[i]);
			}
			System.out.println("");
			for (int i = 0;i<Tipp.length;i++) {
				System.out.println("Zahl " + (i+1) + " : " + Tipp[i]);
			}



			for (int j=0; j<Tipp.length; j++) 
			{
				for (int k=0; k<ziehung.length; k++) 
				{
					if (Tipp[j] == ziehung[k]) 
					{
						gewinn = gewinn + 1;
					}
				}

			}

			//Welche Zahl ist richtig
			int zähler = 0;
			for (int j=0; j<Tipp.length; j++) 
			{
				for (int k=0; k<ziehung.length; k++) 
				{
					if (Tipp[j] == ziehung[k]) 
					{
						Richti.add(Tipp[j]);
						richtige[zähler] = Tipp[j];
						zähler++;

					}
				}

			}
			System.out.println("\n---------------------------------------------------------------------------\n");
			for(int i=0;i<Tipp.length;i++) {
				if(i >= Richti.size() || i < 0) {
					continue;
				}
				else {
					//if(richtige[i]!=0) {
					int element = Richti.get(i);
					System.out.println((i+1) + " richtige Zahl: " + element);
				}
			}

			if(gewinn >= 0 || gewinn <0) {
				System.out.println("\n\nyou have won");
				System.out.println("your win: " + gewinn);
			}
			System.out.println("\n---------------------------------------------------------------------------\n");
			System.out.println("\nMöchten Sie erneut starten? (Ja/Nein): ");
			antwort = Tastatur.next();
		} while(antwort.equalsIgnoreCase("Ja"));
	}
}
