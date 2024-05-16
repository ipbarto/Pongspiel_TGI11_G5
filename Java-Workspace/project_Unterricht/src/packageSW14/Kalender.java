package packageSW14;

import java.util.Scanner;

public class Kalender {

	public static void main(String[] args) {
		int days;
		String antwort;
		int tag;

		Scanner tastatur;
		tastatur = new Scanner(System.in);

		do {
			do {
				System.out.println("Geben sie die Anzahl der Tage an (in einem Monat): ");
				days = tastatur.nextInt();
			} while (days >= 32);

			do {
				System.out.println("Mit welchem Wochentag beginnt der Monat (Mo = 1/Di = 2...) : ");
				tag = tastatur.nextInt();

			} while (tag <= 0 || tag > 7);


			System.out.println("Mo\tDi\tMi\tDo\tFr\tSa\tSo");
			for (int i = 1; i <= days; i++) {

				if (i <= 6) {
					System.out.print("\t" + i);
				}
				else {
					System.out.print(i + "\t");
				}

				if (i % (8-tag) == 0 || i == days) {
					System.out.println();
				}

			}
			System.out.println("Want to start again? ");
			antwort = tastatur.next();
		} while (antwort.equalsIgnoreCase("Ja"));



	}

}

