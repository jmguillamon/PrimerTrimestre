package clases;

import java.util.Scanner;

public class CalculadoraIf {
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una opción:");
		
		// CADENA DE TEXTO
		
		String cadena = sc.nextLine(); 	
		if (cadena.equals("1") || cadena.equals("+")) {
			System.out.println("Sumar");
		} else if (cadena.equals("2") || cadena.equals("-")) {
			System.out.println("Restar");
		} else if (cadena.equals("3") || cadena.equals("*")) {
			System.out.println("Multiplicar");
		} else if (cadena.equals("4") || cadena.equals("/")) {
			System.out.println("Dividir");
		} else {
			System.out.println("Error en la opción");
		}
		
		// CARACTERES
		/*String cadena = sc.nextLine();
		
		char opcion = cadena.charAt(0);
		
				
		if (cadena.length() == 1) {
			if (opcion == '1' || opcion == '+') {
				System.out.println("Sumar");
			} else if (opcion == '2' || opcion == '-') {
				System.out.println("Restar");
			} else if (opcion == '3' || opcion == '*') {
				System.out.println("Multiplicar");
			} else if (opcion == '4' || opcion == '/') {
				System.out.println("Dividir");
			} else {
				System.out.println("Error en la opción");
			}
		
		} else {
			System.out.println("Error en la opción");
		} */
		
		// NÚMEROS
		/*int opcion = sc.nextInt();
		
		if (opcion == 1) {
			System.out.println("Sumar");
		} else if (opcion == 2) {
			System.out.println("Restar");
		} else if (opcion == 3) {
			System.out.println("Multiplicar");
		} else if (opcion == 4) {
			System.out.println("Dividir");
		} else {
			System.out.println("Error en la opción");
		}*/
		
		
		sc.close();
	}
}
