package packageSW08_KV;

import java.util.Scanner;

public class Coordninatesystem {

	public static void main(String[] args) 
	{
		// 9.11.2023
		double pX, pY;
		
		Scanner tastatur;                   // Scanner: ist Bibliothek (Klasse); tastatur: beliebiger Name
		tastatur = new Scanner(System.in);  // tastatur-Objekt wird erstellt für die Eingabe von Daten

        System.out.println("Punkt mit Koordinaten einordnen");
        // Eingabe folgt
        System.out.println("Bitte x-Wert vom Punkt P eingeben []");
		pX = tastatur.nextDouble();
		
        System.out.println("Bitte y-Wert vom Punkt P eingeben []");
        pY = tastatur.nextDouble();
	    
        System.out.println("Your coordinates are: x = " + pX + " ; y = " + pY);
	   
	    
	    
	    // Ergebnisse ausgeben
	    if (pX > 0 && pY > 0)
		{
	    	System.out.println("Your point is in the first quadrants");
		}
		
		else if (pX < 0 && pY > 0)
		{
			System.out.println("Your point is in the second quadrants");
		}
		
		else if (pX < 0 && pY < 0)
		{
			System.out.println("Your point is in the third quadrants");
		}
	
		else if (pX > 0 && pY < 0)
		{
			System.out.println("Your point is in the fourth quadrants");
		}
	    
	    else 
	    {	
				
		}
	    
		if (pX == 0)
		{	
			if (pX == 0 && pY == 0)
			{
				System.out.println("point is in the middle");	
			}

			else
			{
				System.out.println("Point is on the Y-axis");
			}
		}
	
		else if (pY == 0)
		{
			if (pX == 0 && pY == 0)
			{
				System.out.println("point is in the middle");	
			}

			else
			{
				System.out.println("Point is on the X-axis");
			}	
		}
	
	    
	    System.out.println("Programmende");
	    
	    tastatur.close();

	}

}
