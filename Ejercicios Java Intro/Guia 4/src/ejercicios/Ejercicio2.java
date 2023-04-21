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
public class Ejercicio2 {

    /**
     * @param args the command line arguments Realizar un algoritmo que llene un
     * vector de tamaño N con valores aleatorios y le pida al usuario un número
     * a buscar en el vector. El programa mostrará dónde se encuentra el numero
     * y si se encuentra repetido
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector :");
        int n = leer.nextInt();
        boolean encontrado = false;
        int posicion = 0, buscar, contador = -1, vector[] = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) Math.floor(Math.random() * 5);

        }
        System.out.println("Ingrese un número para buscarlo en el vector: ");
        buscar = leer.nextInt();
        for (int i = 0; i < n; i++) {

            if (buscar == vector[i]) {
                if (contador == -1) {
                    posicion = i;
                    contador++;
                    encontrado = true;
                } else {
                    contador++;
                }
            }
        }

        if (encontrado == true) {
            if (contador > 0) {
                System.out.println("El número buscado está en la posición " + (posicion) + " del vector");
                System.out.println("El número buscado se repite " + contador + " veces.");
                System.out.println("");
            } else {
                System.out.println("El número buscado está en la posición " + (posicion) + " del vector");
                System.out.println("El número buscado no se repite.");
            }
        } else {
            System.out.println("El número no se encuentra en el vector.");
        }

        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + ", ");
        }

    }
}
