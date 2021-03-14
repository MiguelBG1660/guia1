package com.senati.eti;

import java.util.Scanner;

class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese radio: ");
	    int radio = sc.nextInt();
		
	    float area =(float)( 3.1416 * Math.pow(radio, 2));
	    
	    float perimetro = (float) (radio * 2 * 3.1416);
	    
	    System.out.println("\n======= Resultados =======");
		System.out.println("Area..............: " + area);
		System.out.println("Perimetro.............: " + perimetro);


	}

}
