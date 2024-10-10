package ejercicios20241004;

import java.util.Scanner;

/*
 * Pedir un número y usando una variable booleana comprobar si el número es negativo o positivo. La variable booleana se utilizará al final para mostrar un mensaje dependiendo de si es true o false
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número: ");
		int numero = sc.nextInt(); 
		
		
		/*boolean positivo;
		
		if (numero >= 0) {
			positivo = true;
		} else {
			positivo = false;
		} */
		
		boolean positivo = numero >= 0;
		
		/*if (positivo) {
			System.out.println("El número " + numero + " es positivo");
		} else {
			System.out.println("El número " + numero + " es negativo");
		}*/
		
		System.out.println(positivo ? 
							"El número " + numero + " es positivo" : 
							"El número " + numero + " es negativo");
		
	
		sc.close(); 

	}

}
