package ejercicios20241004;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		final int anioActual = 2024;
		
		System.out.println("Año: ");
		int anio = sc.nextInt();
		
		boolean anioBisiesto = false;
		
		if (anio % 4 == 0 && anio % 100 != 0
				|| anio % 400 == 0) {
			anioBisiesto = true;
		}
		String verbo = "";
		if (anio < anioActual) {
			verbo = "fue";
		} else if (anio > anioActual){
			verbo = "será";
		} else {
			verbo = "es";
		}
		
		System.out.println(anioBisiesto ? "El año " + anio + " " + verbo + " bisiesto" : 
			"El año " + anio + " no " + verbo + " bisiesto");
		
		
		
	}
		
}
