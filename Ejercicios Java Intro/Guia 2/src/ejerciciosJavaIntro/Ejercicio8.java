/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
 * lo siguiente:
  * * * *
  *      *
  *      *
  * * * *
 */
package ejerciciosJavaIntro;

import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int lados;
        System.out.println("Ingrese la cantidad de lados del cuadrado: ");
        lados = leer.nextInt();
        for (int i = 0; i < lados; i++) {
            System.out.print("* ");
        }

        System.out.println("");

        for (int i = 0; i < lados  ; i++) {
            System.out.print("* ");
            for (int j = 0; j < lados-2  ; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println("");
        }

        for (int i = 0; i < lados ; i++) {
            System.out.print("* ");
        }

        System.out.println("");

    }

}
