package packageSW04;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Grundrechenarten4 
{

	public static void main(String[] args) 
	{
		

		
		
		System.out.println("Programm Grundrechenarten 1");
		System.out.println("Programm verarbeitet 2 beliebige, Fließkommazahlen");
		System.out.println("Die Eingegeben werden");
		double Zahl1 ;
		double Zahl2 ;
		String bediener;
		char initalie;
		
		

		
		
		// Weiter am 4. Oktober
		Scanner tastatur; 	//Tastaturobjekt wird deklariert
		tastatur = new Scanner(System.in);	//Tastaturobjekt wird erstellt
		
		DecimalFormat nk3;					//nk3 wird deklariert
		nk3 = new DecimalFormat("#.###");	//Nachkommastellen
		
		System.out.println("Programmbedienr eingeben: ");
		bediener = tastatur.next();		//next für Tastatureingaben
		
		System.out.println("ihr anfangsbuchstabne eingenen: ");
		initalie = tastatur.next().charAt(0);		//next().charAt(0) für Zeicheneingabe	
		
		
		System.out.println("Bitte 2 Zahlen eingeben");
		System.out.println("Jetzt Zahl 1 eingegeben: ");
		Zahl1 = tastatur.nextDouble();		//Zahl wird jetzt in Konsole eingegeben
		
		System.out.println("Jetzt Zahl 2 eingegeben: ");
		Zahl2 = tastatur.nextDouble();
		
		
		
		double summe = Zahl1 + Zahl2;
		double Differenz = Zahl1 - Zahl2;
		double produkt = Zahl1 * Zahl2;
		double Quotient = Zahl1 / Zahl2;
		
		System.out.println("Ausgabe der Ergebnisse");
		System.out.println("Zahl 1 + Zahl 2 = " + summe);
		System.out.println("Zahl 1 - Zahl 2 = " + Differenz );
		System.out.println("Zahl 1 * Zahl 2 = " + produkt);
		System.out.println("Zahl 1 / Zahl 2 = " +nk3.format(Quotient));
		System.out.println("Erkenntnis: Programm ist jetzt als Einfachtaschenrechner nutzbar, "
				+ "weil beliebige Zahlen über die Konsole eingegeben werden können");
		System.out.println("Programmbediener ist " + bediener);
		System.out.println("Der Anfangsbuchstabe ist: " + initalie);
		System.out.println("Programmende");
		
		
		
		tastatur.close();
	}

}
