package level1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		int x = entrada.nextInt();
		
		int resultado = x;
		
		for(int i = x-1; i >= 1; i--) {
			
			resultado = resultado * i;

		}
		
		
		System.out.println("El factorial de es: " + resultado );
		entrada.close();
	}
}
