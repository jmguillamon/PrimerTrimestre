package clases;

import java.util.Scanner;

public class CalculadoraSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca número 1: ");
		int num1 = sc.nextInt(); 
		System.out.println("Introduzca número 2: ");
		int num2 = sc.nextInt();
		System.out.println("Introduzca una opción: (1 o +, 2 o -, 3 o *, 4 o /)");
		sc.nextLine(); 
		String opcion = sc.nextLine(); 
		
		int resultado = 0; 
		boolean opcionCorrecta = true; 
		
		switch (opcion) {
			case "1", "+": 
				resultado = num1 + num2;
				break;
			case "2", "-":
				resultado = num1 - num2;
				break;
			case "3", "*":
				resultado = num1 * num2;
				break;
			case "4", "/":
				resultado = num1 / num2;
				break;
			default: 
				opcionCorrecta = false;
				
		}
		
		System.out.println(opcionCorrecta ? "El resultado es: " + resultado : "Error en la opción");
		
	
		
		
		
		
		sc.close();

	}

}
