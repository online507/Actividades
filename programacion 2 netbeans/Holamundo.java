/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.holamundo;

import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.util.Scanner;

/**
 *
 * @author checho
 */
public class Holamundo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        stri nombre;
        int edad;
        float altura;
        int numerotelefono;
        
                
        System.out.println("Visitante digite sus datos porfavor");
        
        
        
        System.out.print("Digite su nombre");
        nombre = entrada.nextLine() ;
        
        System.out.print("Digite su altura");
        altura = entrada.nextFloat();
        
        System.out.print("Digite su edad: " );
        edad = entrada.nextInt();
        
        System.out.print("Digite su numero telefono");
        numerotelefono = entrada.nextInt();
       
        
        System.out.println("Visitante sus datos son los siguientes: ");
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su altura es: "+ altura);
        System.out.println("Su edad es: "+ edad);
        System.out.println("Su numero telefono es: "+numerotelefono);
        
        
        
        
    }
}
