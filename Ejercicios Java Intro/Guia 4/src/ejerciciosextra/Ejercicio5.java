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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     * Realizar un programa que llene una matriz de tamaño NxM con valores
     * aleatorios y muestre la suma de sus elementos.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, m, suma = 0;
        System.out.println("Ingrese la cantidad de filas de la matriz: ");
        n = leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz: ");
        m = leer.nextInt();
        int [][] matriz = new int [n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                matriz[i][j] = (int)Math.floor(Math.random()*10);
                suma+=matriz[i][j];
                System.out.println(suma);
            }
        }
        
        System.out.println("La suma de todos sus elementos es: " + suma);
    }
    
}
