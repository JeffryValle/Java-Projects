
package tienda;

import java.util.Scanner;

/**
 *
 * @author jeffr
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Producto p = new Producto();
        int op, a, b;
        do{
        System.out.println("********************");
        System.out.println("***** Producto *****");
        System.out.println("1) Agregar cantidad: ");
        System.out.println("2) Eliminar cantidad: ");
        System.out.println("3) Ver productos en existencia");
        System.out.println("4) Salir");
        System.out.print("Seleccion una opcion: ");
        op = s.nextInt();
        switch (op) {
            case 1: 
                System.out.println("Ingrese cantidad a agregar: ");
                a = s.nextInt();
                p.Aumentar(a);
                break;
            case 2: 
                System.out.println("Ingrese cantidad a eliminar: ");
                b = s.nextInt();
                p.Disminuir(b);
                break;
            case 3: 
                System.out.println("Cantidad de Producto: " + p.VerProducto());
                break;
            case 4: 
                System.out.println("****Cerrando Tienda****"); 
                break;
            default: System.out.println("Opcion no valida");
        }
        }while(op != 4);
    }
    
    }
