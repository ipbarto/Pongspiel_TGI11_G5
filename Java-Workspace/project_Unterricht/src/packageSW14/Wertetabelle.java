package packageSW14;

import java.util.Scanner;

public class Wertetabelle {

	public static void main(String[] args) {

		Scanner tastatur;
		tastatur = new Scanner(System.in);

		double Koa;
		double Kob;
		double Koc;
		double start;
		double stop;
		double step;
		double y;
		String antwort;

		System.out.println("Die formel lautet: ax^2 + bx + c");
		do {
				System.out.println("Geben sie a ein: ");
				Koa = tastatur.nextDouble();
				System.out.println("Geben sie b ein: ");
				Kob = tastatur.nextDouble();
				System.out.println("Geben sie c ein: ");
				Koc = tastatur.nextDouble();

				System.out.println("Geben sie die Startwerte ein: ");
				start = tastatur.nextDouble();
				System.out.println("Geben sie die Stopwert ein: ");
				stop = tastatur.nextDouble();
				System.out.println("Geben sie die Schrittweise ein: ");
				step = tastatur.nextDouble();

				System.out.println("x \t y");
				System.out.println("-------------");
				for(Double x = start; x <= stop; x = x + step){


					y = (Koa * (x * x)) + (Kob * x) + (Koc);  

					System.out.println(x + "\t|" + y );
				}   
		System.out.println("Nochmal? (Ja/Nein):  ");
		antwort = tastatur.next();
		} while (antwort.equalsIgnoreCase("Ja"));
		tastatur.close();

	}

}
