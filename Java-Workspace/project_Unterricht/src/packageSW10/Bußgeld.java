package packageSW10;

import java.util.Scanner;

public class Bußgeld {
	public static void main(String [] args) 
	{
		double kmh;
		double maxkmh;
		double kmh3;
		
		Scanner tastatur;
		tastatur = new Scanner(System.in);
		
		System.out.println("How fast were you: ");
		kmh = tastatur.nextDouble();
		
		System.out.println("How fast are you allowed to go: ");
		maxkmh = tastatur.nextDouble();
		
		//Toleranz rechnen -3
		kmh3 = kmh - 3;
		
		//IF
		if (kmh3 > maxkmh && kmh3 < (maxkmh + 11))
		{
			System.out.println("pay 20 Euro");
		}
		else if (kmh3 >= (maxkmh + 11) && kmh3 < (maxkmh + 16))
		{
			System.out.println("pay 40 Euro");
		}
		else if (kmh3 >= (maxkmh + 16) && kmh3 < (maxkmh + 21))
		{
			System.out.println("pay 60 Euro");
		}
		else if (kmh3 >= (maxkmh + 21) && kmh3 < (maxkmh + 26))
		{
			System.out.println("pay 100 Euro");
		}
		else if (kmh3 >= (maxkmh + 26) && kmh3 < (maxkmh + 31))
		{
			System.out.println("pay 150 Euro");
		}
		else if (kmh3 >= (maxkmh + 31) && kmh3 < (maxkmh + 41))
		{
			System.out.println("pay 200 Euro");
		}
		else if (kmh3 >= (maxkmh + 41) && kmh3 < (maxkmh + 50))
		{
			System.out.println("pay 320 Euro");
		}
		else if(kmh3 >= (maxkmh + 50))
		{
			System.out.println("are you crazy????? Go to jail");
		}
		else
		{
			System.out.println("everything is allrighty");
		}
		
		
		System.out.println("Programmende");
		
		tastatur.close();
	}
}
