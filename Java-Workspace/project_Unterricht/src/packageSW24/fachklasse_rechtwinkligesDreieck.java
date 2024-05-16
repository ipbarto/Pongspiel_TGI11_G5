package packageSW24;

public class fachklasse_rechtwinkligesDreieck {

	// Eigene Attribute für die Berechnung
	private double hypotenuseC;
	private double katheteA;
	
	
	// Konstruktor folgt
	public fachklasse_rechtwinkligesDreieck() 	{  		//Standardkonstruktor
		hypotenuseC = 4;
		katheteA = 3;
	}
	public fachklasse_rechtwinkligesDreieck(double Phyp, double PK) 	{  		//Individualkonstruktor
		hypotenuseC = Phyp;
		katheteA = PK;
	}
	
	
	
	
	// set-Methoden folgen
	public void setHypotenuse(double pHypo) {
		
		if(pHypo>0) {
			hypotenuseC = pHypo;
		}
		else {
			hypotenuseC = pHypo * (-1);
		}
	}
	
	public void setKathetheA(double pKath) {
		if(pKath>0) {
			katheteA = pKath;
		}
		else {
			katheteA = pKath * (-1);
		}
	}
	
	// get-Methode folgen
	public double getHypotenuse() {
		return hypotenuseC;
	}
	
	public double getkatheteA() {
		return katheteA;
	}
	
	// Berechnungsmethoden folgen
	public double berechneUmfang() {
		double ergebnis;
		ergebnis = katheteA + berechneKathete_b() + hypotenuseC;
		return ergebnis;
	}
	public double berechneFlaeche() {
		double Flacche;
		Flacche = katheteA * berechneKathete_b() * 0.5;
		return Flacche;


	}
	public double berechneKathete_b() {
		double ergebnis;
		ergebnis = Math.sqrt(Math.pow(hypotenuseC,2) - Math.pow(katheteA, 2));
		return ergebnis;
	}

	public double berechneAPlha() {
		double ergebnis;
		ergebnis = Math.toDegrees(    Math.atan(katheteA / berechneKathete_b())    );
		return ergebnis;
	}

	public double berechneBeta() {
		double ergebnis;
		ergebnis = Math.toDegrees(    Math.acos(katheteA / hypotenuseC)        );
		return ergebnis;
	}
}
