package clases;

public class VariableMasMas {
	public static void main(String args[]) {
		
		int i = 0;
		System.out.println(i); // 0
		i = i + 1;
		System.out.println(i); // 1
		
		i++;
		System.out.println(i); // 2
		
		++i;
		System.out.println(i); // 3
		
		System.out.println(i++); // 3
		
		System.out.println(++i); // 5
		
		
		System.out.println(i--); // 5 -> 4
		System.out.println(i); // 4
		System.out.println(--i); // 3
		
		
		i = i + 2;
		System.out.println(i);
		
		i+=2; 
		System.out.println(i);
		
		String s = "Hola";
		
		//s = s + "Adios";
		s+="Adios";
		
		System.out.println(s);
		
	}
}
