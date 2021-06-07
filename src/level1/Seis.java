package level1;

import java.util.Scanner;

public class Seis {
    static int potencia(int x, int y){
        int potencia = 1;
        for(int i=1; i <= y;i++){
            potencia = potencia * x;
        }
        return potencia;
    }
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese un numero x:\t");
        int x = ingreso.nextInt();
        System.out.print("Ingrese un numero y:\t");
        int y = ingreso.nextInt();
        int resultado = potencia(x, y);
        System.out.println("La potencia de " + x + " elevado a " + y + " es: " +resultado);
        ingreso.close();
    }
}
