package packageSW18;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;

public class Methoden_verwenden {

	public static void main(String[] args) 
	{
		DecimalFormat nk2 = new DecimalFormat("#.##");
		
		zeichneLinie(6, 9);
		
		berechneKleinstzahl(44, 44);
		
		atanGrad(3.0/4.0);
		

		

	}

	// Eigene Funktionen  -> siehe nächste Spalte
	public static void zeichneLinie(int Linie, int Linie2)                  // Methode (Funktion) ohne Parameter
	{
		System.out.println("");
		for (int i = 0; i < Linie; i++) {
			System.out.print("-");
		}
		System.out.println("");
		for (int i = 0; i < Linie2; i++) {
			System.out.print("-");
		}
	}
	
	public static void berechneKleinstzahl(double Zahl1, double Zahl2)
	{
		System.out.println(" ");
		if (Zahl1 < Zahl2) {
			System.out.println(Zahl1);
		}
		else if (Zahl1 > Zahl2) {
			System.out.println(Zahl2);
		}
		else {
			System.out.println("Both the same");
		}
	}
	
	public static double atanGrad(double Verhältnis) {
		DecimalFormat nk2 = new DecimalFormat("#.##");
		System.out.println("");
		double Ergebnis = Math.toDegrees(Math.atan(Verhältnis));
		System.out.println(nk2.format(Ergebnis));
		return Ergebnis;
		
	}
}













