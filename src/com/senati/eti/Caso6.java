package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		// Aplicar CAST: convertir un tipo de dato a otro
		int rp1 = (int) Math.pow(5,  3);
		
		float rp2 = (float) Math.pow(81.0, 1/2.0);
		
		float rp3 = (float) Math.pow(125.0, 1/3.0);
		
		float rp4 = (float) Math.pow(256.0, 1/4.0) + (float) Math.pow(25.0, 1/2.0);
		
		System.out.println("\n======= Resultados =======");
		System.out.println("Resultado 1..............: " + rp1);
		System.out.println("Resultado 2.............: " + rp2);
		System.out.println("Resultado 3.............: " + rp3);
		System.out.println("Resultado 4.............: " + rp4);



	}

}
