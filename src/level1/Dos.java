package level1;

import java.util.Scanner;

public class Dos {
	
    static int suma(int x, int y) {
        return x + y;
    }
    static int resta(int x, int y) {
        return x - y; 
    }
    static int multiplicacion(int x, int y){
        return x * y;
    }
    static int division(int x, int y){
        return x / y;
    }
    static int modulo(int x, int y){
        return x % y;
    }

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese un número x:");
        int x = ingreso.nextInt();
        System.out.println("Ingrese un número x:");
        int y = ingreso.nextInt();

        int resultado = suma(x, y);

        System.out.println("El resultado de la suma es:\t" + resultado);
        resultado = resta(x, y);
        System.out.println("El resultado de la resta es:\t" + resultado);
        resultado = multiplicacion(x, y);
        System.out.println("El resultado de la multiplicación es:\t" + resultado);
        resultado = modulo(x, y);
        System.out.println("El modulo de " +x+ " % "+ y + " es:\t" + resultado);
        
        ingreso.close();

     
        
    }
}
