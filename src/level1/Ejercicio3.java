package level1;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese un número: ");
		
		int x = entrada.nextInt();
	
		String numeros = "";
		
		for(int i = 1; i <= x; i++) {
			numeros += String.valueOf(i);
			System.out.println(numeros);
			
		}
		entrada.close();

	}
}
