package level2;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<String>();
        
        while(true){
            System.out.println("Ingrese una ciudad favorita o 0 para salir: ");
            String ciudad = ingreso.nextLine();
            
            if(ciudad.equals("0")){
                break;
            }else{
                ciudades.add(ciudad);
            }
            
        }
        for(int i=0; i<ciudades.size(); i++){
            System.out.println("#" + (i+1) +" " + ciudades.get(i));
        }
        ingreso.close();
        
    }
}
