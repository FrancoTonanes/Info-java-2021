package level1;

import java.util.Scanner;

public class Ocho {
    static String formateo(String ciudad, String direccion, String edad, String nomb_app){
        String mensaje = String.format("%s - %s - %s - %s", ciudad, direccion, edad, nomb_app);
        return mensaje;
    }

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese su ciudad:  ");
        String city = ingreso.nextLine();
        System.out.print("Ingrese su dirección:  ");
        String adress = ingreso.nextLine();
        System.out.print("Ingrese su edad:  ");
        String edad = ingreso.nextLine();
        System.out.print("Ingrese su nombre:  ");
        String name = ingreso.nextLine();

        String mensaje = formateo(city, adress, edad, name);

        System.out.println(mensaje);
        ingreso.close();
    }
}
