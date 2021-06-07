package level2;

import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        ArrayList<String> fizzBuzz = new ArrayList<>();
        int x;
        int y;
        while(true){
            System.out.println("Ingrese un entero:");
            x = ingreso.nextInt();
            System.out.println("Ingrese un entero mayor:");
            y = ingreso.nextInt();
            if(y > x){
                break;
            }else{
                System.out.println("El primer entero debe ser menor");
            }
        }

        for (int i = x; i < y; i++) {
            if(i%2==0 && i%3==0){
                fizzBuzz.add("Fizz-Buzz");
            }else if(i%2==0){
                fizzBuzz.add("Fizz");
            }else if(i%3==0){
                fizzBuzz.add("Buzz");
            }else{
                fizzBuzz.add(String.valueOf(i));
            }
        }

        System.out.println(fizzBuzz);
        ingreso.close();
    }
}
