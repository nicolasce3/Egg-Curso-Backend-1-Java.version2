/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra;

import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments Realizar un programa que complete
     * un vector con los N primeros números de la sucesión de Fibonacci.
     * Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
     * números: 1, 1, 2, 3, 5, 8, 13, 21, 34, ... Donde cada uno de los números
     * se calcula sumando los dos anteriores a él. Por ejemplo: La sucesión del
     * número 2 se calcula sumando (1 +1) Análogamente, la sucesión del número 3
     * es (1+2) , Y la del 5 es 2+ 3 , Y así sucesivamente… La sucesión de
     * Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
     * Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1 Fibonaccin = 1
     * para todo n <=1 Por lo tanto, si queremos calcular el término “n” debemos
     * escribir una función que reciba como parámetro el valor de “n” y que
     * calcule la serie hasta llegar a ese valor.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n; // el número de elementos que deseas en la sucesión de Fibonacci
        System.out.println("Ingrese el valor del término 'n' que desea calcular: ");
        n = leer.nextInt();
        int[] vectorFib = new int[n]; // vector para almacenar la sucesión

        llenarFibonacci(vectorFib, n); // Llamamos a la función para llenar el vector con la sucesión

        // Imprimir la sucesión de Fibonacci
        for (int i = 0; i < n; i++) {
            System.out.print(vectorFib[i] + " ");
        }
    }

    public static void llenarFibonacci(int[] vectorFib, int n) {
        // Inicializar los primeros dos elementos
        vectorFib[0] = 1;
        vectorFib[1] = 1;

        // Calcular los siguientes elementos de la sucesión
        for (int i = 2; i < n; i++) {
            vectorFib[i] = vectorFib[i - 1] + vectorFib[i - 2];
        }
    }
}
