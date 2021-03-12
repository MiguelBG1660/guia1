package com.senati.eti;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese lado: ");
	    int lado = sc.nextInt();
	     
	     System.out.print("Ingrese ancho: ");
	     int ancho = sc.nextInt();
	     
	     int area = lado * ancho;
	     int perimetro = lado * 2 + ancho * 2;
	     
	     System.out.println("\n======= Resultados =======");
		 System.out.println("Area..............: " + area);
		 System.out.println("Perimetro.............: " + perimetro);


	}

}
