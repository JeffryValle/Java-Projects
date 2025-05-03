/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jev_program_1;

/**
 *
 * @author jeffr
 */
import java.util.Scanner;
public class JEV_PROGRAM_1 {

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
        for (int i = 1; i <=8; i++) {
            System.out.print(" * ");
            for (int j = 1; j <8; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        
        System.out.println();
        
    }
    
}
