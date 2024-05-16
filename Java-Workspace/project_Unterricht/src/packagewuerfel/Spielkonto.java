package packagewuerfel;

public class Spielkonto {
	private int kontostand;
	
	public Spielkonto(){
		kontostand = 0;
	}
	public void setKontostand(int Pkonstostand) {
		kontostand = Pkonstostand;
	}
	public Integer getKontostand() {
		return kontostand;
	}
	public void abheben(int Pbetrag) {
		kontostand -= Pbetrag;
	}
	public void einzahlen(int Pbetrag) {
		kontostand += Pbetrag;
	}
}
