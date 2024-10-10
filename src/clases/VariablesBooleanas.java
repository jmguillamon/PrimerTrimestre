package clases;

public class VariablesBooleanas {
	public static void main(String args[]) {
		
		boolean b = false; 
		System.out.println(b);
		
		b = true; 
		System.out.println(b);
		
		int n1 = 2; 
		int n2 = 3;
		
		
		b = n1 == n2;
		System.out.println(b); // -> FALSE
		
		b = n1 > n2;
		System.out.println(b); // -> FALSE
		
		b = n1 < n2;
		System.out.println(b); // -> TRUE
		
		b = n1 >= n2;
		System.out.println(b); // -> FALSE
		
		b = n1 <= n2;
		System.out.println(b); // -> TRUE
		
		b = n1 != n2;
		System.out.println(b); // -> TRUE
		
		
		b = n1 > n2 || n1 != n2; // TRUE 
		
		b = n1 > n2 && n1 != n2; // FALSE
		
		b = n1 > n2 || n1 % 2 == 0; // TRUE
		
		b = n1 > n2 || n2 % 2 == 0; // FALSE
		
		b = !(n1 > n2); // TRUE;
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(b);
		
		
		
		
		
	}
}
