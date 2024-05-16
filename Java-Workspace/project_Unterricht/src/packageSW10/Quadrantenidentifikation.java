package packageSW10;

import java.util.Scanner;

public class Quadrantenidentifikation {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        // Koordinaten x y  eingeben
	        System.out.print("Geben Sie die x-Koordinate ein: ");
	        double x = scanner.nextDouble();

	        System.out.print("Geben Sie die y-Koordinate ein: ");
	        double y = scanner.nextDouble();

	        // Quadranten mit Achsen überprüfen
	        if (x > 0 && y > 0) {
	            System.out.println("Der Punkt befindet sich im zweiten Quadranten, oben rechts.");
	        } else if (x < 0 && y > 0) {
	            System.out.println("Der Punkt befindet sich im ersten Quadranten, oben links.");
	        } else if (x < 0 && y < 0) {
	            System.out.println("Der Punkt befindet sich im dritten Quadranten, unten links.");
	        } else if (x > 0 && y < 0) {
	            System.out.println("Der Punkt befindet sich im vierten Quadranten, unten rechts.");
	        } else if (x == 0 && y == 0) {
	            System.out.println("Der Punkt befindet sich auf dem Nullpunkt.");
	        } else if (x == 0 && y != 0) {
	            System.out.println("Der Punkt liegt auf der y-Achse.");
	        } else if (x != 0 && y == 0) {
	            System.out.println("Der Punkt liegt auf der x-Achse.");
	        }

	        scanner.close();
	        //Programm Ende
		

	}

}
