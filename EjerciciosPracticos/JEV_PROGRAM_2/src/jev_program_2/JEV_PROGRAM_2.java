/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jev_program_2;

/**
 *
 * @author jeffr
 */
import java.util.Scanner;
public class JEV_PROGRAM_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("***************************");
        System.out.println("*  Jeffry Espinal Valle   *");
        System.out.println("*      20212000761        *");
        System.out.println("***************************");     
        Scanner p = new Scanner(System.in);

        int a, z=1;
        System.out.print("Digite un numero: ");
        a = p.nextInt();
        
        if(a>0){
            while(z<=a)
                {while(z%2==0)
                    {System.out.println(z);
                    z++;}
                        z++;}}
        else { 
            z=-1;
          while(z>=a)
        {
            while(z%2==0)
            {System.out.println(z); 
            z--;} 
            z--;}}
}   
}

