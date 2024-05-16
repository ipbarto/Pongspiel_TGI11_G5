package packageSW20;


public class TEST {
	public static double berechneUmfang(double pa, double pb, double pc) {
		double ergebnis;
		ergebnis = pa + pb + pc;
		return ergebnis;
	}
	public static double berechneFlaeche(double pa, double pb) {
		double Flacche;
		Flacche = pa * pb * 0.5;
		return Flacche;
		
	
	}
	public static double berechneKathete_b(double pa, double pc) {
		double ergebnis;
		ergebnis = Math.sqrt(Math.pow(pc,2) - Math.pow(pa, 2));
		return ergebnis;
	}
	
	public static double berechneAPlha(double pa, double pb) {
		double ergebnis;
		ergebnis = Math.toDegrees(    Math.atan(pa / pb)    );
		return ergebnis;
	}
	
	public static double berechneBeta(double pa, double pc) {
		double ergebnis;
		ergebnis = Math.toDegrees(    Math.acos(pa / pc)        );
		return ergebnis;
	}
}
