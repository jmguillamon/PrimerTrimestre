package ejercicios20241004;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mes: ");
		int mes = sc.nextInt();
		String sMes = "";
		
		boolean mesCorrecto = true;
		
		switch (mes) {
			case 1:
				sMes = "Enero"; 
				break;
			case 2:
				sMes = "Febrero";
				break;
			case 3:
				sMes = "Marzo";
				break;
			case 4:
				sMes = "Abril";
				break;
			case 5:
				sMes = "Mayo";
				break;
			case 6:
				sMes = "Junio";
				break;
			case 7:
				sMes = "Julio";
				break;
			case 8:
				sMes = "Agosto";
				break;
			case 9:
				sMes = "Septiembre";
				break;
			case 10:
				sMes = "Octubre";
				break;
			case 11:
				sMes = "Noviembre";
				break;
			case 12:
				sMes = "Diciembre";
				break;
			default:
				mesCorrecto = false;
		}
		
		if (mesCorrecto) {
			System.out.println("El mes introducido es: " + sMes);
		} else {
			System.out.println("Error en el mes introducido");
		}
		sc.close();
	}
}
