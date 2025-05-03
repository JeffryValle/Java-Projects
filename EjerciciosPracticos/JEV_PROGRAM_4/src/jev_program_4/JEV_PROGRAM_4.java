/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jev_program_4;

/**
 *
 * @author jeffr
 */
import java.util.Scanner;
public class JEV_PROGRAM_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("***************************");
        System.out.println("*  Jeffry Espinal Valle   *");
        System.out.println("*      20212000761        *");
        System.out.println("***************************");     
        Scanner p = new Scanner(System.in);        
        
        int x=1, s, fact=1;
        
         System.out.print("Digite el numero: ");
         s = p.nextInt();        
        while(x<=s)
        {
            fact*=x;
            x++;
        }
        System.out.println();
        System.out.println("El factorial de "+s+" es: "+fact);
        System.out.println();
    }
    
}
