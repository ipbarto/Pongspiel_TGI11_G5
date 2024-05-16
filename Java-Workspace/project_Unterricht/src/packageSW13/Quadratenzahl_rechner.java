package packageSW13;

import java.util.Scanner;

public class Quadratenzahl_rechner {

	public static void main(String[] args) {
		
		Scanner tastatur;
        tastatur = new Scanner(System.in);

        System.out.println("x \t x' \t x'");
        System.out.println("--------------------");
        int xQuadrat = 0;
        int xHochdrei = 0;
        int haufig;


        while (true) {
            System.out.println("Want to start? (Ja/Nein)");
            String antwort = tastatur.nextLine();

            if (antwort.equalsIgnoreCase("Ja")) {
                System.out.println("Anzahl der Menge, die man machen soll: ");
                haufig = tastatur.nextInt();
                haufig ++;

                for(int i = 1; i < haufig; i = i + 1){
                    xQuadrat = i * i;
                    xHochdrei= i * i * i;
                    System.out.println(i + "\t" + xQuadrat + "\t" + xHochdrei);
                }
            }
            else{
                break;
            }
            }




        }
    
    

		
	}


