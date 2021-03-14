package com.senati.eti;

import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese base: ");
	    int base = sc.nextInt();
	     
	     System.out.print("Ingrese altura: ");
	     int altura = sc.nextInt();
	     
	     float area = (base * altura) / 2;
	   
	     System.out.println("\n======= Resultados =======");
		 System.out.println("Area..............: " + area);
		
	     
	     

	}

}
