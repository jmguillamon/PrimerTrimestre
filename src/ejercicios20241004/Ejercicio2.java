package ejercicios20241004;

import java.util.Scanner;

/*
 * Pedir un texto, comprobar si el texto es de longitud > 0. En caso de que lo sea, solicitar una posición y comprobar si la posición es mayor o igual a la longitud del texto. Si es correcto, mostrar en pantalla el carácter de la posición introducida
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cadena: ");
		String cadena = sc.nextLine(); 
		
		if (cadena.length() > 0) {
			System.out.println("Posición (de 1 a " + cadena.length() + "): ");
			int posicion = sc.nextInt(); 
			
			if (posicion > 0 && posicion <= cadena.length()) {
				System.out.println("El carácter en la posición " + 
										posicion + " es: " + 
										cadena.charAt(posicion-1));
				
			} else {
				System.out.println("Ha introducido una posición no válida");
			}
		} else {
			System.out.println("No has introducido ninguna cadena de texto");
		}
		
		
		
		
		sc.close();

	}

}
