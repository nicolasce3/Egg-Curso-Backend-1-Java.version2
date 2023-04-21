/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
     * diferente a cada una. A continuación, realizar las instrucciones
     * necesarias para que: B tome el valor de C, C tome el valor de A, A tome
     * el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
     * valores finales de cada variable. Utilizar sólo una variable auxiliar.
     */ 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A, B ,C, D, aux = 0 ;
        System.out.println("Ingrese el valor de A: ");
        A = leer.nextInt();
        System.out.println("Ingrese el valor de B: ");
        B = leer.nextInt();
        System.out.println("Ingrese el valor de C: ");
        C = leer.nextInt();
        System.out.println("Ingrese el valor de D: ");
        D = leer.nextInt();
        
        System.out.println();
        System.out.println();
        System.out.println("Valores iniciales de las variables: ");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println();
        System.out.println("Reasignación de valores: ");
        System.out.println("A toma el valor de D: " + A);
        System.out.println("B toma el valor de C: " + B);
        System.out.println("C toma el valor de A: " + C);
        System.out.println("D toma el valor de B: " + D);
 
         
    }
    
}
