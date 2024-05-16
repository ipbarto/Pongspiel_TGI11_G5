package packageSW18;

public class Parallelschaltung_rechner {
	
	public double U;
	public double R1;
	public double R2;
	public double Iges;
	public double Rges;


	public  double GesWiderstand() {
		double ergebnis;
		ergebnis = R1 * R2 / ( (R1+R2));
		return ergebnis;
	}
	public  double GesStrom() {
		double ergebnis;
		ergebnis = U / Rges;
		return ergebnis;
	}
	public  double Strom1() {
		double ergebnis;
		ergebnis = U / R1;
		return ergebnis;
	}
	public  double Strom2() {
		double ergebnis;
		ergebnis = U / R2;
		return ergebnis;
	}
	public  double Power() {
		double ergebnis;
		ergebnis = U * Iges;
		return ergebnis;
	}

}
