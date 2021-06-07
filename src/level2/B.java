package level2;

import java.util.ArrayList;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Integer> numeros = new ArrayList<>();

        for(int i = 0; i<5; i++){
            System.out.println("Ingrese un número: ");
            Integer n = entrada.nextInt();
            numeros.add(n);
        }
        
        System.out.println("La lista posee " + numeros.size() + " elementos: " + numeros);

        numeros.add(0, 100);
        numeros.add(99);
        System.out.println("La lista posee " + numeros.size() + " elementos: " + numeros);
        entrada.close();
    }
}
