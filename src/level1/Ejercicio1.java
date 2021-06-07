package level1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombre = entrada.next();
		
		System.out.println("\nHola " + nombre + "!!!");
		
		entrada.close();
	}
}
