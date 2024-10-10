package clases;

import java.util.Scanner;

public class PedirDosNumerosYDecirMayor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número 1: ");
		int num1 = sc.nextInt(); 
		
		System.out.println("Número 2: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("El número " + 
							num1 + " es mayor que " + 
							num2);
		} else if (num1 < num2) {
			System.out.println("El número " + 
					num1 + " es menor que " + 
					num2);
		} else {
			System.out.println(num1 + " y " +  
					num2 + " son iguales");
		}
		
		sc.close();

	}

}
