package packageSW14;

import java.util.Scanner;


		public class Kalender__ {

		    public static void main(String[] args) {
		        int days;
		        String antwort;
		        int tag;

		        Scanner tastatur;
		        tastatur = new Scanner(System.in);
		        
		        do {
		            do {
		                System.out.println("Geben Sie die Anzahl der Tage an (in einem Monat): ");
		                days = tastatur.nextInt();
		            } while (days >= 32);

		            do {
		                System.out.println("Mit welchem Wochentag beginnt der Monat (Mo = 1/Di = 2...): ");
		                tag = tastatur.nextInt();
		            } while (tag <= 0 || tag > 7);

		            printCalendar(days, tag);

		            System.out.println("Möchten Sie erneut starten? (Ja/Nein): ");
		            antwort = tastatur.next();
		        } while (antwort.equalsIgnoreCase("Ja"));
		    }

		    private static void printCalendar(int days, int startingDay) {
		        System.out.println("Mo\tDi\tMi\tDo\tFr\tSa\tSo");

		        int currentDay = 1;

		        // Print leading spaces for the starting day
		        for (int i = 1; i < startingDay; i++) {
		            System.out.print("\t");
		        }

		        while (currentDay <= days) {
		            System.out.print(currentDay + "\t");

		            if ((currentDay + startingDay - 1) % 7 == 0) {
		                System.out.println();
		            }

		            currentDay++;
		        }

		        System.out.println();
		    }
		}

	
