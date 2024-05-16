package packageSW08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {
	public static void main(String[] args) 
{
	System.out.println("A programm to calculate the BMI");
	DecimalFormat nk3;
	nk3 = new DecimalFormat("#.#");
	double kg;
	double m;
	double bmi;
	double age;
	
	Scanner tastatur;
	tastatur = new Scanner(System.in);
	System.out.println("Please enter your age");
		age = tastatur.nextDouble();
	if (19 < age && age < 25)
	{	
		// enter weight and height
		System.out.println("Please enter your weight");
			kg = tastatur.nextDouble();
		System.out.println("Please enter your height");
			m = tastatur.nextDouble();
			
		// calculating the BMI	
		bmi = 10000 * (kg / (Math.pow(m, 2))) ;
		
		System.out.println("Your BMI is: " + nk3.format(bmi));
		
		if (20 < bmi && bmi < 25)
			{	
			System.out.println("Your BMI is OK");
			}
		else if (20 > bmi)
			{
			System.out.println("BMI too low");
			}
		else
			{
			System.out.println("Your BMI too high");
			}
		
		
		
	}
	else if (19 > age)
		{
		System.out.println("You are too young");
		}
	else
		{
		System.out.println("too old");
		}

	tastatur.close();
	}
}
