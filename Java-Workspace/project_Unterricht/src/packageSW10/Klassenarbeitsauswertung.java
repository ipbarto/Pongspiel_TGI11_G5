package packageSW10;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Klassenarbeitsauswertung {

	public static void main(String[] args) {

		// enter variables
		double Pmax;
		double Perr;
		double note1;
		double note2;

		//Scanner
		Scanner tastatur;
		tastatur = new Scanner(System.in);
		DecimalFormat nk1;
		nk1 = new DecimalFormat("#.#");


		//enter the points
		System.out.println("Please type in the max scorded points: ");
		Pmax = tastatur.nextDouble();

		System.out.println("Please type in your scorded points: ");
		Perr = tastatur.nextDouble();

		//calculating grade
		note1 = ((Perr * 5) / Pmax) - 6;
		note2 = note1 * (-1);

		//
		System.out.println("Your grade is: " + nk1.format(note2));

		//If
		if(note2 >= 0 && note2 < 1 )
		{
			System.out.println("ausgezeichnet");
		}
		else if(note2 >= 1 && note2 < 1.5 )
		{
			System.out.println("sehr gut");
		}
		else if(note2 >= 1.5 && note2 < 2.5 )
		{
			System.out.println("gut");
		}
		else if(note2 >= 2.5 && note2 < 3.5 )
		{
			System.out.println("befriedigend");
		}
		else if(note2 >= 3.5 && note2 < 4.5 )
		{
			System.out.println("ausreichend");
		}
		else if(note2 >= 4.5 && note2 < 5.5 )
		{
			System.out.println("mangelhaft");
		}
		else if(note2 >= 5.5 && note2 <= 6 )
		{
			System.out.println("ungenügend");
		}

		//Programmende
		tastatur.close();
	}

}
