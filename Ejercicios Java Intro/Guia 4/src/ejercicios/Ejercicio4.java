/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Discoxz01
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments Realizar un programa que rellene
     * un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la
     * matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
     * cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        System.out.println("Matriz A: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);
                System.out.print(" " + matrizA[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Matriz B: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j] = matrizA[j][i];
                System.out.print(" " + matrizB[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
