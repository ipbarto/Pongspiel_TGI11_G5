package packageSW08;


import java.util.Scanner;



public class Punkt_xy_ {
	public static void main(String[] args) 
	{

		Scanner tastatur;
		tastatur = new Scanner(System.in);
		
		double x;
		double y;
		
		System.out.println("Where is the x coordinate: ");
		x = tastatur.nextDouble();
		
		System.out.println("Where is the y coordinate: ");
		y = tastatur.nextDouble();
		
		System.out.println("Your coordinates are: x = " + x + " ; y = " + y);
		
		if (x > 0 && y > 0)
			{
			System.out.println("Your point is in the first quadrants");
			}
		
		else if (x < 0 && y > 0)
			{
			System.out.println("Your point is in the second quadrants");
			}
		
		else if (x < 0 && y < 0)
			{
			System.out.println("Your point is in the third quadrants");
			}
		
		else if (x > 0 && y < 0)
			{
			System.out.println("Your point is in the fourth quadrants");
			}
		
		if (x == 0)
			{
			System.out.println("x is on the X-axis");	
			}
		
		if (y == 0)
			{
			System.out.println("x is on the y-axis");	
			}
			
		if (x == 0 && y == 0)
			{
			System.out.println("x is on the X- and y-axis");	
			}
	
		
		tastatur.close();
	}

}
