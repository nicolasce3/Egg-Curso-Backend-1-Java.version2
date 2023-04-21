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
public class Ejercicio3 {

    /**
     * @param args the command line arguments Recorrer un vector de N enteros
     * contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos,
     * etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector :");
        int contador = 0, n = leer.nextInt();

        int vector[] = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100000);
            System.out.println(vector[i]);
            do {
                vector[i] = vector[i] / 10;
                contador++;
            } while (vector[i] != 0);
            System.out.println("Digitos : " + contador);
            contador = 0;
        }
        
    }

}
