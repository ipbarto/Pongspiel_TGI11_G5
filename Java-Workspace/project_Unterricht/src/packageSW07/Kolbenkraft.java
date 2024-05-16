package packageSW07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kolbenkraft {

	public static void main(String[] args) 
	{
	double pe; //Druck
	double d1;	//Kolbendurchmesser
	double d2;	//Kolbenstangendurchmesser
	double d1_cm;	//d1 in cm
	double d2_cm;	//d2 in cm
	double n;	//Wirkungsgrad
	double A1;	//Kolbendurchmesserfläche
	double A2;	//Kolbenstangendurchmesserfläche
	double F1;	//Kraft beim Ausfahren in N
	double F2;	//Kraft beim Einfahren in N
	double pe_Ncmhoch2;  
	
	Scanner tastatur;
	tastatur = new Scanner(System.in);

	DecimalFormat nk3;
	nk3 = new DecimalFormat("#.###");
	
	
	System.out.println("Berechnung Kolbenkraft");
	
	System.out.println("Bitte geben sie den Überdruck an (bar): ");
	pe = tastatur.nextDouble();
	
	System.out.println("Bitte geben sie den Kolbendurchmesser an (mm): ");
	d1 = tastatur.nextDouble();
	
	System.out.println("Bitte geben sie den Kolbenstangendurchmesser an (mm): ");
	d2 = tastatur.nextDouble();
	
	System.out.println("Bitte geben sie den Wirkungsgrad an (eta): ");
	n = tastatur.nextDouble();
	
	//berechnungen
	d1_cm = d1 / 10;
	d2_cm = d2 / 10;
	pe_Ncmhoch2 = pe * 10;
	A1 = (Math.PI * (Math.pow(d1_cm, 2))) / 4;
	A2 = Math.PI * ((d1_cm * d1_cm) - (d2_cm * d2_cm)) / 4;
	F1 = pe_Ncmhoch2 * A1 * n;
	F2 = pe_Ncmhoch2 * A2 * n;
	
	System.out.println("Kraft beim Ausfahren ist: " + nk3.format(F1) + "N");
	System.out.println("Kraft beim Einfahren ist: " + nk3.format(F2) + "N");
	
	tastatur.close();
	}
}
