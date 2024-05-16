package packageSW28;

import java.util.Arrays;

public class Lottospiel {
	
	private int[] tipp = new int [6];
	private int[] ziehung = new int[6] ; 
	private int[] richtige = new int[6];
	private int anzahlRichtige;
	private boolean otherway = false;
	
	public Lottospiel() {
		for(int i = 0; i<richtige.length; i++) {
			richtige[i] = 0;
		}
	}
	public Lottospiel(int pAnzahl) {
		anzahlRichtige = pAnzahl;
	}
	
	public void setTipp(int pIndex, int pZahl) {
		this.tipp[pIndex] = pZahl;
	}
	public int getTipp(int pIndex) {
		return tipp[pIndex];
	}
	public int getZeihung(int pIndex) {
		return ziehung[pIndex];
	}
	public int getRichtige(int pIndex) {
		return richtige[pIndex];
	}
	
	public int ermittleZufallszahl(int pMin, int pMax) {
		int zahl = 0;
		return zahl;
	}
	public void startZufallszahl() {
		for (int i = 0   ;  i<=5  ; i++)
		{
			ziehung[i] = (int) (Math.random()*49 +1);		
		}
		
	}
	public void sortiereZufallszahl() {
		Arrays.sort(ziehung);
		/*for(int i=0; i<=5; i++) {
			for(int j=i+1; j<=ziehung.length; j++) {
				if(ziehung[i] > ziehung[j]) {
					
				}
			}
		}
		*/
	}
	public int berechneAnzahlRichtige() {
		anzahlRichtige = 0;
		for(int i=0; i<richtige.length; i++) {
			for(int j=0;j<richtige.length;j++) {
				if(tipp[i] == ziehung[j]) {
					anzahlRichtige++;
				}
			}
		}
		return anzahlRichtige;
	}
	public void berechneDieRichtigenZahlen() {
		for(int i=0; i<richtige.length; i++) {
			for(int j=0;j<richtige.length;j++) {
				if(tipp[i] == ziehung[j]) {
					richtige[i] = tipp[i];
					otherway = true;
				}
				if(otherway==false) {
					richtige[i] = 0;
				}
			}
		}
	}
}
