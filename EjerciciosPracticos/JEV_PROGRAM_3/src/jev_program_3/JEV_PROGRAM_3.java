/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jev_program_3;

/**
 *
 * @author jeffr
 */
import java.util.Scanner;
public class JEV_PROGRAM_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("***************************");
        System.out.println("*  Jeffry Espinal Valle   *");
        System.out.println("*      20212000761        *");
        System.out.println("***************************");     
        Scanner p = new Scanner(System.in);
        
        int x=1, n=0, z=0, suma=0;
        while(x>0) {
            System.out.print("Digite un numero: ");
            x = p.nextInt();  

            if(x>=0)
            {   suma++; n = n+x; }
            
            if(x >=70)
            {z++;}
         x++;
        }
        System.out.println("");
        System.out.println(" **** Programa finalizado *****");
        System.out.println(n);
        System.out.println("El promedio de los numeros es: "+(n/suma));
        System.out.println(+z+" numero(s) fueron mayores o igual a 70 ");
    
    }
    
}
