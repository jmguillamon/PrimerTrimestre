package clases;

import java.util.Scanner;

public class SumarDosNumeros {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número 1: ");
		double numero1 = sc.nextDouble();
		
		System.out.println("Número 2: ");
		double numero2 = sc.nextDouble(); 
		
		double resultado = (numero1 + numero2) * 2; 
		
		System.out.println("El resultado de sumar " 
				+ numero1 + " y " + numero2 
				+ " es: " + resultado);
		
		sc.close();
		
	}

}
