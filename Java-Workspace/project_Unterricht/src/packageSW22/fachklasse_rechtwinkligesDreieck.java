package packageSW22;

public class fachklasse_rechtwinkligesDreieck {

	// Eigene Attribute für die Berechnung
	public double hypotenuseC;
	public double katheteA;
	
	
	// Konstruktor folgt
	public fachklasse_rechtwinkligesDreieck() {
		hypotenuseC = 1;
		katheteA = 1;
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
