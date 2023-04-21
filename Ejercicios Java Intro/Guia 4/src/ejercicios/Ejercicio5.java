/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments Realice un programa que compruebe
     * si una matriz dada es antisimétrica. Se dice que una matriz A es
     * antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada
     * de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta
     * de una matriz A se denota por AT y se obtiene cambiando sus filas por
     * columnas (o viceversa).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        boolean antiSimetrica = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor de la posición " + (i) + "," + (j) + " de la matriz A: ");
                matrizA[i][j] = leer.nextInt();

            }

        }
        System.out.println("Matriz A: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("  " + matrizA[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("Matriz A transpuesta: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("  " + matrizA[j][i] + "  ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matrizA[i][j] != -matrizA[j][i]) {
                    antiSimetrica = false;
                    break;
                }
                if (!antiSimetrica) {
                    break;
                }
            }
        }

        if (antiSimetrica) {
            System.out.println("La matriz A es antisimétrica");
        } else {
            System.out.println("La matriz A no es antisimétrica");
        }
    }

}
