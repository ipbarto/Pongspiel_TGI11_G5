package packageSW13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notenberechnung_schleife {
	public static void main(String [] args) 
	{
		int kaanz;
		int Test;
		double KA;
		
		
		
		List<Double> Noten = new ArrayList<>();
		
		
		Scanner Tastatur;
		Tastatur = new Scanner(System.in);
		
		while(true) {
			System.out.println("Wie viele KA's gibt es? ");
			kaanz = Tastatur.nextInt();
			
			Test = kaanz;
			
			for(int i = 0; i <= Test; i++) {
				int menge = 1;
				
				while(menge <= Test) {
					
					System.out.println("Geben sie die " + menge + "KA ein: ");
					KA = Tastatur.nextDouble();
					Noten.add(KA);
					KA = 0;
					menge ++;
					kaanz --;
					
				}
			}
			
		}
		
	}
}
