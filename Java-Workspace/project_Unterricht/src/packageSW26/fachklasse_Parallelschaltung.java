package packageSW26;

public class fachklasse_Parallelschaltung {

	private double R1, R2, U;
	
	public fachklasse_Parallelschaltung() {
		R1 = 1;
		R2 = 1;
		U = 1;
	}

	
	public fachklasse_Parallelschaltung(double R1, double R2, double U) {

		this.R1 = R1;
		this.R2 = R2;
		this.U = U;


	}
	
	
	//set_methoden
	public void setSpannung(double pSpannung) {
		if(pSpannung>0) {
			U = pSpannung;
		}
		else {
			U = pSpannung * (-1);
		}
		
	}
	public void setWiderstan1(double pWiderstand1) {
		if(pWiderstand1>0) {
			R1 = pWiderstand1;
		}
		else {
			R1 = pWiderstand1 * (-1);
		}

	}
	public void setWiderstan2(double pWiderstand2) {
		if(pWiderstand2>0) {
			R2 = pWiderstand2;
		}
		else {
			R2 = pWiderstand2 * (-1);
		}
	}
	
	//get Methode
	public double getSpannung() {
		return U;
	}
	public double getWiderstand1() {
		return R1;
	}
	public double getWiderstand2() {
		return R2;
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
