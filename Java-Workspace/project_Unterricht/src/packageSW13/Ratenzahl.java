package packageSW13;

import java.util.Scanner;

public class Ratenzahl {
	public static void main(String [] args) 
	{
		//Variablen
		int ratezahl;
		int zufallZ;
		int Versuche = 0;
		
		//Scanner
		Scanner tastatur;
		tastatur = new Scanner(System.in);
		
		//random Zahl
		zufallZ = (int) (Math.random() * 100 + 1);
		
		
		System.out.println("Programm Ratenzahl");
		
		//While schleife
		while(true) {
			System.out.println("Geben sie eine Zahl von 0 - 100 ein: ");
			ratezahl = tastatur.nextInt();
			Versuche ++;
			System.out.println("Ihre Versuche: " + Versuche);
			
			if(ratezahl < zufallZ && ratezahl >= zufallZ - 10) {
				System.out.println("Zu klein");
			}
			else if (ratezahl < zufallZ && ratezahl <= zufallZ - 10) {
				System.out.println("Viel zu klein");
			}
			else if (ratezahl > zufallZ && ratezahl <= zufallZ + 10) {
				System.out.println("zu groß");
			}
			else if (ratezahl > zufallZ && ratezahl >= zufallZ + 10) {
				System.out.println("viel zu groß");
			}
			else if(ratezahl == zufallZ) {
				System.out.println("Right");
				break;
			}
		}
		
		
		
		tastatur.close();
	}
}
