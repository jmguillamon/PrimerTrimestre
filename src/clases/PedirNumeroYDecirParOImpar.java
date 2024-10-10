package clases;

import java.util.Scanner;

public class PedirNumeroYDecirParOImpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número: ");
		int num = sc.nextInt(); 
		
		if (num != 0 && num % 2 == 0) {
			System.out.println("El número " + num + 
					" es par");
		} else if (num != 0 && num % 2 != 0){
			System.out.println("El número " + num + 
					" es impar");
		} else {	
			System.out.println("El número 0 no es ni par ni impar");
		}
		
		sc.close();

	}
}
