package packageSW29;

public class Wuerfel {
	private int augen;
	
	public Wuerfel(){
		augen = 0;
	}
	public void setWuerfel(int Pwuerfel) {
		augen = Pwuerfel;
	}
	
	public Integer getaugen() {
		return augen;
	}
	
	int zufallswurf() {
		int zahl;
		zahl = (int) (Math.random()*6 +1);
		return zahl;
	}
}

