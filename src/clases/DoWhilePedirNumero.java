package clases;

import java.util.Scanner;

public class DoWhilePedirNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int contador = 0; 
		int suma = 0;
		// Hago un do while
		do {
			System.out.println("Número: ");
			numero = sc.nextInt();
			contador++;
			suma += numero; // -> suma = suma + numero
		} while (numero != 0);
		
		System.out.println("Ha introducido " + contador + " números");
		System.out.println("El total es: " + suma);
		System.out.println("Fin del programa");
		
		
		
		
		sc.close();

	}

}
