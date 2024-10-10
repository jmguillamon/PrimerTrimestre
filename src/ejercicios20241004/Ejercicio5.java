package ejercicios20241004;

import java.util.Scanner;

/**
 * Pedir un usuario y una contraseña y utilizando una variable booleana mostrar un mensaje diciendo si los datos son correctos o incorrectos. Comparar los datos introducidos con datos fijos (usuario = pepe y contraseña = pepe2004)
 */

public class Ejercicio5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		final String USUARIO = "pepe";
		final String PASSWORD = "pepe2024";
		
		System.out.println("User: ");
		String user = sc.nextLine(); 
		
		System.out.println("Password: ");
		String pass = sc.nextLine(); 
		
		boolean usuarioCorrecto = user.equals(USUARIO);
		boolean passCorrecto = pass.equals(PASSWORD);
		
		if (usuarioCorrecto && passCorrecto) {
			System.out.println("El usuario es correcto");
		} else if (usuarioCorrecto && !passCorrecto) {
			System.out.println("El password introducido es incorrecto");
		} else if (!usuarioCorrecto && passCorrecto) {
			System.out.println("El usuario introducido es incorrecto");
		} else {
			System.out.println("El usuario y password introducidos son incorrectos");
		}
		
		sc.close(); 
	}
}
