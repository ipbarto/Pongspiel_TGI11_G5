package packageSW06;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Aufgabe_pyramide {
	
	public static void main(String[] args) 
	{
		
	System.out.println("Berechnung einer Pyramide");
	double Kathete_a;
	double Kathete_b;
	double Hypotenuse_c;
	double Umfang;
	double Flaeche;
	double Winkel_a;
	double Winkel_b;
	double Kathete_ahoch;
	double Kathete_bhoch;
	double x_alpha;
	
	Scanner tastatur; 	//Tastaturobjekt wird deklariert
	tastatur = new Scanner(System.in);	//Tastaturobjekt wird erstellt

	
	DecimalFormat nk3;					//nk3 wird deklariert
	nk3 = new DecimalFormat("#.###");	//Nachkommastellen
	
	System.out.println("Kathete A eingeben: ");
	Kathete_a = tastatur.nextDouble();
	
	System.out.println("Kathete B eingeben: ");
	Kathete_b = tastatur.nextDouble();
	
	Kathete_ahoch = Math.pow(Kathete_a, 2);
	Kathete_bhoch = Math.pow(Kathete_b, 2);
	
	Hypotenuse_c = Math.sqrt(Kathete_ahoch + Kathete_bhoch);
	
	Umfang = Kathete_a + Kathete_b + Hypotenuse_c;
	Flaeche = Kathete_a * Kathete_b / 2;
	
	Winkel_a = Math.toDegrees(Math.atan(Kathete_a / Kathete_b));
	
	Winkel_b = Math.atan(Kathete_b / Kathete_a) * 180/Math.PI;
	//Winkel_b = Math.toDegrees(Math.atan(Kathete_b / Kathete_a));
	
	
	x_alpha = Math.tan(Math.toRadians(Winkel_a));
			
	
	System.out.println("Die Hypotenuse ist " +nk3.format(Hypotenuse_c) + "cm");
	System.out.println("Der Umfang ist " +nk3.format(Umfang) + "cm");
	System.out.println("Die Fläche ist " +nk3.format(Flaeche) + "cm²");
	System.out.println("Der Winkel a ist " +nk3.format(Winkel_a) + "°");
	System.out.println("Der Winkel b ist " +nk3.format(Winkel_b) + "°");
	System.out.println("x_alpha ist " + x_alpha);
	
	
	
	
	tastatur.close();
	}
	
}
