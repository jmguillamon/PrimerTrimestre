package clases;

import java.util.Scanner;

public class WhilePedirNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int numero = -1;
		while(numero != 0) {
			System.out.println("Número: ");
			numero = sc.nextInt();
			
			System.out.println("El número introducido es: " + numero);
		}
		
		System.out.println("Fin del programa");
		
		sc.close();

	}

}
