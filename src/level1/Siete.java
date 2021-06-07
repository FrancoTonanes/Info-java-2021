package level1;

import java.util.Scanner;

public class Siete {
    public static void main(String[] args) {

        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese la palabra que desea Uppear:\t");
        String cadena = ingreso.next();


        for(int i = 0; i < cadena.length(); i++){
            char caracter = cadena.charAt(i);
            int ascii = (int) caracter;
            if(ascii >= 97 && ascii <= 122){
                char conversion = (char) ((char) ascii-32);

                System.out.print(conversion);
            }
        }
        ingreso.close();

        
    }
}
