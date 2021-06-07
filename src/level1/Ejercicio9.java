package level1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra");
        
        String palabra = in.nextLine();
        
        palabra = palabra.toLowerCase();
        
        System.out.println("Ingrese una letra");
        
        char letra = in.nextLine().toLowerCase().charAt(0);

        int count = 0;

        for(int i=0; i < palabra.length(); i++){
            char caracter = palabra.charAt(i);
            if(letra == caracter){
                count++;
            }
        }

        System.out.println("La letra "+ letra + " se repite " + count + " veces en la palabra");

        in.close();


    }
}
