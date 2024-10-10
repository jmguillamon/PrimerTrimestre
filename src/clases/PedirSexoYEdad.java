package clases;

import java.util.Scanner;

public class PedirSexoYEdad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su sexo (H/M): ");
		char sexo = sc.nextLine().charAt(0);
		
		
		System.out.println("Introduzca su edad: ");
		int edad = sc.nextInt();
		
		
		if (sexo != 'H' && sexo != 'M' || (edad < 1 || edad > 100)) {
			System.out.println("Error");
		} else {
			String cadena = "Eres "; 
			
			if (sexo == 'M') {
				cadena = cadena + "mujer";
			} else {
				cadena = cadena + "hombre";
				if (edad >= 18) {
					cadena += ". Eres mayor de edad";
				}
			}
			
			System.out.println(cadena);
			
		}
		
		sc.close();

	}

}
