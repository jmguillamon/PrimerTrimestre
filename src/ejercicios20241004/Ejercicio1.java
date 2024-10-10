package ejercicios20241004;

import java.util.Scanner;

/*
 * Pedir por pantalla un texto y decir la longitud, el carácter en la primera posición y el carácter de la última posición
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cadena: ");
		String cadena = sc.nextLine(); 
		
		System.out.println("Longitud: " + cadena.length());
		System.out.println("Primer carácter: " + cadena.charAt(0));
		System.out.println("Último carácter: " + cadena.charAt(cadena.length()-1));
		
		
		sc.close();
	}

}
