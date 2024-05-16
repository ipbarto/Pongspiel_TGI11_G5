package packageSW08;
import java.text.DecimalFormat;
import java.util.Scanner;
public class BerechnungKatheteRechtwinkligesDreieck 
{
	public static void main(String[] args) 
	{
		System.out.println("Programm zur Berechnung von Gr��en im Rechtwinkligen Dreieck");
		DecimalFormat nk3;
		nk3 = new DecimalFormat("#.###");
		double a;
		double b;
		double c;
		double U;
		double A;
		double alpha;
		double beta;
		Scanner tastatur;
		tastatur = new Scanner(System.in);
		System.out.print("a = ");
		a = tastatur.nextDouble();
		System.out.print("c = ");
		c = tastatur.nextDouble();
		if (c > a)	//OK
		{	
			b = Math.sqrt(Math.pow(c,2) - Math.pow(a, 2));
			U = c + a + b;
			A = 0.5 * a * b;
			alpha = Math.atan(a / b);
			beta = Math.acos(a / c);
			System.out.println("b = " +  nk3.format(b));
			System.out.println("U = " + nk3.format(U));
			System.out.println("A = " + nk3.format(A));
			System.out.println("Alpha = " + nk3.format(Math.toDegrees(alpha)));
			System.out.println("Beta = " + nk3.format(Math.toDegrees(beta)));
		}
		else
		{
			System.out.println("Error: a is greater than c" );
		}
			
			
		System.out.println("Programmende");
		tastatur.close();
	}
}
