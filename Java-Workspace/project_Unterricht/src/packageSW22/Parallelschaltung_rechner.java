package packageSW22;

public class Parallelschaltung_rechner {

	public double R1, R2, U, P, I1, I2;

	public Parallelschaltung_rechner() {

		R1 = 1;
		R2 = 1;
		U = 1;
		P = 1;
		I1 = 1;
		I2 = 1;

	}

	public double GesWiderstand() {
		double ergebnis;
		ergebnis = R1 * R2 / ( (R1+R2));
		return ergebnis;
	}
	public double GesStrom() {
		double ergebnis;
		ergebnis = U / GesWiderstand();
		return ergebnis;
	}
	public double Strom1() {
		double ergebnis;
		ergebnis = U / R1;
		return ergebnis;
	}
	public double Strom2() {
		double ergebnis;
		ergebnis = U / R2;
		return ergebnis;
	}
	public double Power() {
		double ergebnis;
		ergebnis = U * GesStrom();
		return ergebnis;
	}

}
