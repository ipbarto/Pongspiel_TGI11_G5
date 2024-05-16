package packageSW25_za;

import javax.swing.JOptionPane;

import packageSW08.BMI;

public class Person {
	// Attribute
	private String name;
	private int alter;
	private double gewicht;
	private double groesse;
	private char geschlehct;
	
	public Person() {
		name = "Error";
		alter = 1;
		gewicht = 5;
		groesse = 100;
		geschlehct = 'D';
	}
	
	// set-Methoden folgen

	public void setname(String Pname) {
		if(Pname != null) 
		{
			name = Pname;
		}
		else {
			JOptionPane.showMessageDialog(null, "Name eingegeben?");
		}
		
	}
	public void setalter(int Palter) 
	{

		if(Palter>0) {
			alter = Palter;
		}
		
			
		
	}
	public void setgewicht(double Pgewicht) 
	{
		if(Pgewicht>0)
		{
			if(Pgewicht>=5 && Pgewicht<=200) 
			{
				gewicht = Pgewicht;
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Zu schwere Knochen / leichte Knochen");
			}
		}
		else if(Pgewicht==0) 
		{
			JOptionPane.showMessageDialog(null, "Kein Gewicht angegeben");
		}
		else 
		{
			gewicht = Pgewicht * (-1);
		}
	}
	public void setgroesse(double Pgroesse) 
	{
		if(Pgroesse>0) 
		{
			if(Pgroesse>=100 && Pgroesse<=250) 
			{
				groesse = Pgroesse;
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Zu Groß / Klein");
			}
		}
		else if(Pgroesse==0)
		{
			JOptionPane.showMessageDialog(null, "Keine Größe angegeben");
		}
		else 
		{
			groesse = Pgroesse * (-1);
		}
	}
	public void setgeschlecht(char Pgeschlecht) 
	{
		geschlehct = Pgeschlecht;
	}
	
	
	// get-Methoden folgen
	public int getalter() {
		return alter;
	}
	public double getgewicht() {
		return gewicht;
	}
	public double getgroesse() {
		return groesse;
	}
	public String getname() {
		return name;
	}
	public char getgeschlehct() {
		return geschlehct;
	}
	
	// Fachspezifische Methoden folgen
	
	public double berechneBMI() {
		double BMI;
		double groesse_in_m = groesse / 100;
		BMI = (gewicht/(Math.pow(groesse_in_m, 2)));
		return BMI;
	}
	public char Geschlechtanalystic() {
		char newgeschlehct;
		newgeschlehct = Character.toUpperCase(geschlehct);
		if (newgeschlehct != 'M' && newgeschlehct != 'W' && newgeschlehct != 'D') {
			JOptionPane.showMessageDialog(null, "Geschlecht ist unnatürlich");
		}
		return newgeschlehct;
	}
	
	public boolean isNumeric(String strNum)
	{
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	public String BMIname() 
	{
		String bMIString = "";
		double BMI = berechneBMI();
		if(BMI < 16)
		{
			bMIString = "Starkes Untergewicht";
		}
		else if(BMI <= 18.5)
		{
			bMIString = "Leichtes Untergewicht";
		}
		else if (BMI <= 25)
		{
			bMIString = "Normalgewicht";
		}
		else if (BMI <= 30)
		{
			bMIString = "Übergewicht";
		}
		else if (BMI <= 40)
		{
			bMIString = "Adipositas Grad II";
		}
		else if(BMI > 40)
		{
			bMIString = "Extremwerte";
		}
		return bMIString;
	}
	
	public String Saveausgabe(String PAusgabve) {
		String ausgabenString;
		
		ausgabenString = PAusgabve;
		
		return ausgabenString;
	}
}







