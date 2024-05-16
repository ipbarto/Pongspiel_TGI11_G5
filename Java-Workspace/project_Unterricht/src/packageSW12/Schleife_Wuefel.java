package packageSW12;

public class Schleife_Wuefel {
	public static void main(String [] args) 
	{
		int wuerfel1 = 0;
		int wuerfel2 = 0;
		int wuerfelto;

		while(true) {
			wuerfel1 = (int) (Math.random() * 6 + 1);  //6 is the range and 1 the minimum
			wuerfel2 = (int) (Math.random() * 6 + 1);  //6 is the range and 1 the minimum
			wuerfelto = wuerfel1 + wuerfel2;
			if(wuerfelto  <= 6 && wuerfelto >=4) {
				System.out.println(wuerfelto + ", so we are done");
				break;
			}
			else {
				System.out.println(wuerfelto);
			}
		}

	}
}
