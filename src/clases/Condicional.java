package clases;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Número 1: ");
		int n1 = sc.nextInt();
		System.out.println("Número 2: ");
		int n2 = sc.nextInt();
		
		
		
		boolean b = n1 > n2;
		System.out.println(b);
		
		
		
		
		// if (b == true) {}
		if (n1 > n2) {
			System.out.println("El número " + n1 + " es mayor que " + n2);
		} else {
			System.out.println("El número " + n1 + " es menor o igual que " + n2);
		}
		
		
		sc.close();
		

	}

}
