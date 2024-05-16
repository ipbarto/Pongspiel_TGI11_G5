package packageSW15;

import java.util.Iterator;
import java.util.Scanner;

public class Game_with_Coin {

	public static void main(String[] args) {
	
		String antwort;
		int gewinn = 0;
		boolean duplicates;
		
		Scanner tasttatur;
		tasttatur = new Scanner(System.in);
		
		int[] ZufallZahl = new int[7];
		
		System.out.println("Try your Luck");
		
		System.out.println("The rules are simple. You roll a Dice and if you get the same number twice, then you lose all your money!");
		
		
		System.out.println("\nSo lets start");
		do {
			for(int i = 0; i<ZufallZahl.length; i++) {
				int wuerfle = (int) (Math.random() * 6 + 1);
				ZufallZahl[i] = wuerfle;
				
				duplicates=false;
				for (int j=0; j<i; j++)
				  for (int k=j+1; k<i; k++)
				    if (k!=j && ZufallZahl[k] == ZufallZahl[j])
				      duplicates=true;
				
				if (duplicates==true) {
					System.out.println("Sorry you lost all your money");
					System.out.println("here is your win: " + gewinn + " Euro");
					break;
				}
				else if (duplicates==false) {
					System.out.println("Still going");
					gewinn++;
				}
				
			}
			System.out.println("\nNochmal?");
			antwort = tasttatur.next();
		} while (antwort.equalsIgnoreCase("Ja"));
	}

}
