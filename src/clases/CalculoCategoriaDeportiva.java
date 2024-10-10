package clases;

import java.util.Scanner;

public class CalculoCategoriaDeportiva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Edad: ");
		int edad = sc.nextInt(); 
		
		/*
		Querubin: 3  4
		Prebenjamin: 5 y 8
		Benjamines: 9 y 10 años.
		Alevines: 11 y 12 años.
		Infantiles: 13 y 14 años.
		Cadetes: 15 y 16 años.
		Juveniles: 17 y 19 años.
		Senior: > 19
		 */ 
		
		
	switch (edad) {
		case 0, 1, 2: 
			System.out.println("Muy pequeño");
			break;
		case 3, 4: 
			System.out.println("Querubín");
			break;
		case 5, 6, 7, 8: 
			System.out.println("Prebenjamin");
			break;
		case 9, 10: 
			System.out.println("Benjamin");
			break;
		case 11, 12: 
			System.out.println("Alevin");
			break;
		case 13, 14:
			System.out.println("Infantil");
			break;
		case 15, 16: 
			System.out.println("Cadete");
			break;
		case 17, 18, 19: 
			System.out.println("Juvenil");
			break;
		default: 
			System.out.println("Senior");
				
		
	}
		
		if (edad >= 0 && edad <= 2) {
			System.out.println("Muy pequeño");
		} else if (edad == 3 || edad == 4) {
			System.out.println("Querubín");
		} else if (edad >=5 && edad <= 8) {
			System.out.println("Prebenjamin");
		} else if (edad == 9 || edad == 10) {
			System.out.println("Benjamin");
		} else if (edad == 11 || edad == 12) {
			System.out.println("Alevin");
		} else if (edad == 13 || edad == 14) {
			System.out.println("Infantil");
		} else if (edad == 15 || edad == 16) {
			System.out.println("Cadete");
		} else if (edad >= 17 && edad <= 19) {
			System.out.println("Juvenil");
		} else {
			System.out.println("Senior");
		}
		
		sc.close();

	}

}
