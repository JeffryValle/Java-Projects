/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import java.util.Scanner;

/**
 *
 * @author jeffr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Rectangulo r1 = new Rectangulo();
        float x1, x2, y1, y2, base, altura;
        int op;
        do{
        System.out.println("********************");
        System.out.println("***** Vehiculo *****");
        System.out.println("1) Area");
        System.out.println("2) Perimetro");
        System.out.println("3) Diagonal");
        System.out.println("4) Salir");
        System.out.print("Seleccion una opcion: ");
        op = s.nextInt();
        switch (op) {
            case 1: 
                System.out.println("Digite coordenada x1: "); x1 = s.nextFloat();
                System.out.println("Digite coordenada x2: "); x2 = s.nextFloat();
                System.out.println("Digite coordenada y1: "); y1 = s.nextFloat();
                System.out.println("Digite coordenada y2: "); y2 = s.nextFloat();
                base = x2-x1;
                altura=y2-y1;
                System.out.println("El area es: " + r1.Area(base, altura) + " unidades cuadradas");
                break;
            case 2: 
                System.out.println("Digite coordenada x1: "); x1 = s.nextFloat();
                System.out.println("Digite coordenada x2: "); x2 = s.nextFloat();
                System.out.println("Digite coordenada y1: "); y1 = s.nextFloat();
                System.out.println("Digite coordenada y2: "); y2 = s.nextFloat();
                base = x2-x1;
                altura=y2-y1;
                System.out.println("El perimetro es: " + r1.Perimetro(base, altura) + " unidades");
                break;
            case 3: 
                System.out.println("Digite coordenada x1: "); x1 = s.nextFloat();
                System.out.println("Digite coordenada x2: "); x2 = s.nextFloat();
                System.out.println("Digite coordenada y1: "); y1 = s.nextFloat();
                System.out.println("Digite coordenada y2: "); y2 = s.nextFloat();
                base = x2-x1;
                altura=y2-y1;
                System.out.println("La diagonal es: " + r1.Diagonal(base, altura) + " unidades");
                break;
            case 4: 
                System.out.println("**** CERRANDO PROGRAMA****"); 
                break;
            default: System.out.println("Opcion no valida");
        }
        }while(op != 4);
    }
   
}
   
