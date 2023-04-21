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
public class Ejercicio2 {

    /**
     * @param args the command line arguments Escriba un programa que averigüe
     * si dos vectores de N enteros son iguales (la comparación deberá detenerse
     * en cuanto se detecte alguna diferencia entre los elementos).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de los vectores :");
        int n = leer.nextInt();

        int vector[] = new int[n];
        int vector2[] = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) Math.floor(Math.random() * 1);
            vector2[i] = (int) Math.floor(Math.random() * 1);
            System.out.println(vector[i] + " = " + vector2[i]);
            if (vector[i] != vector2[i]) {
                System.out.println("Los elementos son distintos. ");
                break;
            }

        }
        //if (i == n) {
         //   System.out.println("Los elementos son iguales");
       // }
    }
}


