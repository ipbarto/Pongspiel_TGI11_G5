package packageSW26;

public class Spielbrett {
	private int zahl;
	
	public Spielbrett(){
		zahl = 1;
	}
	public void tippen (int pZahl) {
		zahl = pZahl;
	}
	public Integer getZahl(){
		return zahl;
	}
}
