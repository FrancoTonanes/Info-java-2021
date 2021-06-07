package level1;

import java.util.Scanner;

public class Cinco {
	
    static int suma_sucesiva(int x, int y){
        int suma = 0;
        for(int i=1; i <= y;i++){
            suma = suma + x;
        }
        return suma;
    }
    public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);
    	System.out.print("Ingrese un número x: ");
        int x = entrada.nextInt();
        System.out.print("Ingrese un número y: ");
        int y = entrada.nextInt();
        int resultado = suma_sucesiva(x, y);
        System.out.println("Resultado: " + resultado);
        entrada.close();
    }
}
