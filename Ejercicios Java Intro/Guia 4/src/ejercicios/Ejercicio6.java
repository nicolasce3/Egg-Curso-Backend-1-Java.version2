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
 *
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments Un cuadrado mágico 3 x 3 es una
     * matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
     * sus columnas y sus diagonales son idénticas. Crear un programa que
     * permita introducir un cuadrado por teclado y determine si este cuadrado
     * es mágico o no. El programa deberá comprobar que los números introducidos
     * son correctos, es decir, están entre el 1 y el 9.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int suma, suma1 = 0;
        boolean filas = true, columnas = true, diagonal = true, diagonalInversa = true;

        int[][] matriz = new int[3][3];

//llenado la matriz mágica de 3x3 con números de 0 a 9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese un número para asignarle un valor a la posición " + (i) + "," + (j) + " del vector: ");
                    matriz[i][j] = leer.nextInt();
                    if (matriz[i][j] < 0 || matriz[i][j] > 9) {
                        System.out.println("Error. Sólo están permitidos números entre 0 y 9");
                        System.out.println("");
                    }
                } while (matriz[i][j] < 0 || matriz[i][j] > 9);
            }
        }

//verificar si las filas suman lo mismo
        for (int i = 0; i < 3; i++) {
            suma = 0;
            //el bucle for "j" suma todos los elementos de una misma fila
            for (int j = 0; j < 3; j++) {
                suma += matriz[i][j];
            }
            //este if garantiza que en la primera vuelta se tenga el valor que da la primera fila
            //este valor se va a utilizar para comparar con todas las demas(filas, columnas y diagonales)
            if (i == 0) {
                suma1 = suma;
                //cuando i sea distinto de cero entonces se compara el resultado de la primera fila con las demás filas
            } else if (suma != suma1) {
                filas = false;
                break;
            }
        }
//for para verificar diagonal normal
        for (int j = 0; j < 3; j++) {
            suma = 0;
            for (int i = 0; i < 3; i++) {
                suma += matriz[j][i];

            }
            if (suma != suma1) {
                columnas = false;
            }
        }
        //la variable suma se vuelve a inicializar en cero para que no arrastre la suma del for anterior
        suma = 0;
        //for para verificar la diagonal inversa
        for (int i = 0; i < 3; i++) {
            int j = i;
            suma += matriz[i][j];

        }
        if (suma != suma1) {
            diagonal = false;
        }
        suma = 0;
        for (int i = 2; i > -1; i--) {
            int j = i;
            suma += matriz[i][j];

        }
        if (suma != suma1) {
            diagonalInversa = false;
        }

        if (filas && columnas && diagonal && diagonalInversa) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica");
        }
    }

}
