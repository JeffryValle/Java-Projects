
package vehiculo;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Vehiculo v1 = new Vehiculo();
        int op;
        do{
        System.out.println("********************");
        System.out.println("***** Vehiculo *****");
        System.out.println("1) Acelerar");
        System.out.println("2) Frenar");
        System.out.println("3) Ver estado");
        System.out.println("4) Salir");
        System.out.print("Seleccion una opcion: ");
        op = s.nextInt();
        switch (op) {
            case 1: 
                v1.Acelerar("En marcha");
                break;
            case 2: 
                v1.Frenar("Detenido");
                break;
            case 3: 
                System.out.println("Estado del Vehiculo: " + v1.getEstado());
                break;
            case 4: 
                System.out.println("****Apagando vehiculo****"); 
                break;
            default: System.out.println("Opcion no valida");
        }
        }while(op != 4);
    }
    
}
