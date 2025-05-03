/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jev_program_5;

/**
 *
 * @author jeffr
 */
import java.util.Scanner;
public class JEV_PROGRAM_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("***************************");
        System.out.println("*  Jeffry Espinal Valle   *");
        System.out.println("*      20212000761        *");
        System.out.println("***************************");     
        Scanner p = new Scanner(System.in);  
        System.out.println();
        
        int x=0, a;
        System.out.print("Digite un numero: ");
        x = p.nextInt();
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            a = i*x;
        System.out.println(x+" x "+i+"  = "+a );            
        }
                    System.out.println();

    }
    
}
