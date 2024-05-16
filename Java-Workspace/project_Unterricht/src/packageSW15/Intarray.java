package packageSW15;


public class Intarray {

	public static void main(String[] args) {
		
		int[] Zahlen = new int [10];
		for (int i = Zahlen.length-1; i>=0; i--)
		{
			Zahlen[i] = i*i;
			System.out.println(i + "^2 = " + Zahlen[i]);
		}
		
	}

}
