package packageSW10;

import java.awt.Button;
import java.util.Scanner;

public class Punkt_xy_einordnen {

	public static void main(String[] args) {
	
	Scanner eingabe = new Scanner(System.in);
		
		double x;
		double y;
		
		Button.class.arrayType();
		
		
		
		
		
		System.out.println("X Koordinate bitte eingben");
		x = eingabe.nextDouble();
		
		System.out.println("Y Koordinate bitte eingeben");
		y = eingabe.nextDouble();
	
		if (0 < x && 0 < y) {
			System.out.println("Der Punkt liegt im 1 Quadrant");	
			System.out.println("(" + x + "|" + y + ")");
		}
		
		else if (0 > x && 0 < y) {
			System.out.println("Der Punkt liegt im 2 Quadrant");
			System.out.println("(" + x + "|" + y +")");
		}
		
		else if (0 > x && 0 > y) {
			System.out.println("Der Punkt liegt im 3 Quadrant");
			System.out.println("(" + x + "|" + y +")");
		}
		
		else if (0 > y && 0 < x) {
			System.out.println("Der Punkt liegt im 4 Quadrant");
			System.out.println("(" + x + "|" + y + ")");
		}
		
		else if (0 == x && 0 == y) {
			System.out.println("Der Punkt liegt auf dem Nullpunkt");
			System.out.println("(" + x + "|" + y + ")");
		}
		
		else if (0 == y) {
			System.out.println("Der Punkt liegt auf der x-Achse");
			System.out.println("(" + x + "|" + y + ")");
		}
		
		else if (0 == x) {
			System.out.println("Der Punkt liegt auf der y-Achse");
			System.out.println("(" + x + "|" + y + ")");
		}
		
	eingabe.close();
	}
}
