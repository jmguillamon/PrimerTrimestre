package clases;

import java.util.Scanner;

public class PedirNombreYSaludar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre: ");
		String nombre = sc.nextLine(); 
		
		if (nombre.length() > 0) {
			System.out.println("Hola " + nombre);
		} else {
			System.out.println("No ha introducido ningún nombre");
		}
		
		
		sc.close();
		
	}

}
