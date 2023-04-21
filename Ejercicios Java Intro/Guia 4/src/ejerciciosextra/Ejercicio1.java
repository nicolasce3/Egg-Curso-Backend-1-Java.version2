/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra;

import ejercicios.*;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     * Realizar un algoritmo que calcule la suma de todos los elementos de un
     * vector de tamaño N, con los valores ingresados por el usuario.
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector :");
        int suma = 0 , n = leer.nextInt();
        
        int vector[] = new int [n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un número para asignarle un valor a la posición " + (i+1) + " del vector: ");
            vector[i]= leer.nextInt();
            suma =vector[i]+suma;
        }
        
        System.out.println("El valor de la suma es " + suma);
       
    }
    
}
