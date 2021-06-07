package level2;

import java.util.ArrayList;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        ArrayList<Integer> horas = new ArrayList<>();
        ArrayList<Integer> sueldo = new ArrayList<>();
        ArrayList<Integer> total_semana = new ArrayList<>();
        ArrayList<Integer> total_final = new ArrayList<>();

        String[] semana_dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        for(String i : semana_dias){
            System.out.println("Ingrese cantidad de horas para el " + i);
            int h = ingreso.nextInt();
            System.out.println("Ingrese la remuneración por hora para el " + i);
            int s = ingreso.nextInt();
            horas.add(h);
            sueldo.add(s);
        }
        int total = 0;
        for(int i = 0; i < horas.size(); i++){
            int x = horas.get(i) * sueldo.get(i);
            total_semana.add(x);
            total += x;
        }
        total_final.add(total);

        System.out.println("Salario por semana: " + total_semana);
        System.out.printf("Total final por semana: $" + total_final.get(0));
        ingreso.close();
    } 
}
