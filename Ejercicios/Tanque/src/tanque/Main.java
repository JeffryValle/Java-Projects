
package tanque;

import java.util.Scanner;

/**
 *
 * @author jeffr
 */
public class Main {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Tanque t = new Tanque();
        int op;
        float depositar, retirar;
        do{
        System.out.println("********************");
        System.out.println("***** Vehiculo *****");
        System.out.println("1) Agregar agua ");
        System.out.println("2) Quitar Agua ");
        System.out.println("3) Ver estado del tanque");
        System.out.println("4) Ver estado del tanque en porcentaje");
        System.out.println("5) Salir");
        System.out.print("Seleccion una opcion: ");
        op = s.nextInt();
        switch (op) {
            case 1: 
                // Capacidad maxima del tanque 1000 litros
                System.out.println("Ingrese cantidad a depositar: ");
                depositar = s.nextFloat();
                t.DepositarAgua(depositar);
                break;
            case 2: 
                System.out.println("Ingrese cantidad a retirar: ");
                retirar = s.nextFloat();
                t.RetirarAgua(retirar);
                break;
            case 3: 
                System.out.println("Estado del tanque: " + t.CantidadAgua() + " litros");
                break;
            case 4: 
                System.out.println("Estado del tanque en porcentaje: " + t.CAPorcentaje() + " %"); 
                break;
            case 5: 
                System.out.println("**** CERRANDO TANQUE****"); 
                break;
            default: System.out.println("Opcion no valida");
        }
        }while(op != 5);
    }
    }
