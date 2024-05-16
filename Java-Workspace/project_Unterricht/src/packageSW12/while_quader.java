package packageSW12;

import java.util.Scanner;

public class while_quader {
	public static void main(String [] args) 
	{

		double breite;
		double laenge;
		double umfang;
		double flaecheninhalt;
		
		Scanner tastatur;
		tastatur = new Scanner(System.in);
		
		while(true){
			System.out.println("type in your leanght: ");
			laenge = tastatur.nextDouble();
			
			System.out.println("type in your width: ");
			breite = tastatur.nextDouble();
			
			if(breite > 0 && laenge > 0) {
				umfang = laenge * 2 + breite * 2;
				flaecheninhalt = laenge * breite;
				System.out.println("your scope is: " + umfang + ", and your area is: " + flaecheninhalt);
			}
			else{
				break;
			}
		}
		
		tastatur.close();

	}
}
