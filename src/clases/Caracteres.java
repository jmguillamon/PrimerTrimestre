package clases;

import java.util.Scanner;

public class Caracteres {
	public static void main(String args[]) {
		
//		char c = '0';
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un carácter:");
		
		
		char c = sc.nextLine().charAt(0);
		
		System.out.println(c + " -> " + (int)c);*/
		
		int numSiguiente = 5647;
		System.out.println(numSiguiente + " -> '" + (char)numSiguiente + "'");
		numSiguiente = numSiguiente + 1;
		System.out.println(numSiguiente + " -> '" + (char)numSiguiente + "'");
		numSiguiente = numSiguiente + 1;
		System.out.println(numSiguiente + " -> '" + (char)numSiguiente + "'");
		
		
		//System.out.println('A' + 'B');
		//System.out.println("A" + "B");
		
		//c =(char)(c + 1);
		//System.out.println(c + " -> " + (int)c);
		
		//sc.close();
	}
}
