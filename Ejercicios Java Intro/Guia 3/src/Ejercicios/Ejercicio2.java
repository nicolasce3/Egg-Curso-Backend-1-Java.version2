/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     *  Diseñe una función que pida el nombre y la edad de N personas e
     * imprima los datos de las personas ingresadas por teclado e indique si
     * son mayores o menores de edad. Después de cada persona, el programa
     * debe preguntarle al usuario si quiere seguir mostrando personas y frenar
     * cuando el usuario ingrese la palabra “No”.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int personas;
        System.out.println("Ingrese el número de personas: ");
        personas = leer.nextInt();
        Registro(personas);
    }
    
    
    public static void Registro( int personas){
        String opcion;
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < personas; i++) {
            
            System.out.println("Ingrese el nombre de la persona " + (i+1));
            String nombre = leer.next();
            
            System.out.println("Ingrese la edad de la persona: ");
            int edad = leer.nextInt();
            if(edad >17){
                System.out.println(nombre + " es mayor de edad.");
                
            }else{
                System.out.println(nombre + " es menor de edad.");
            }
            System.out.println("Desea continuar?");
            opcion = leer.next();
            if(opcion.equalsIgnoreCase("no")){
               //también se puede usar el break para detener el bucle for
                i =  personas;
            }
        }
        
        
    }
    
    
}
