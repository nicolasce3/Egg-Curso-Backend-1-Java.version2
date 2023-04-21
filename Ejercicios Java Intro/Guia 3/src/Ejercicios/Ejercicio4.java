/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     *
     * Crea una aplicación que nos pida un número por teclado y con una función
     * se lo pasamos por parámetro para que nos indique si es o no un número
     * primo, debe devolver true si es primo, sino false. Un número primo es
     * aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es
     * primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un número para verificar si es primo o no: ");
        num = leer.nextInt();
        boolean retorno = Primo(num);
        System.out.println(retorno);
    }

    public static boolean Primo(int num) {
        int siPrimo = 0;
        boolean primo = false;
        for (int i = 1; i < num+1; i++) {
            //este bloque if sirve para verificar cuantas veces N dividido por 1 hasta N da 0.
            // la variable siPrimo va a acumulando la cantidad de veces que el resto de la division da 0
            if (num % i == 0) {
                siPrimo++;
            }
            // si el contador siPrimo vale más que dos (lo que quiere decir que no solo es divisible por 1 y por si mismo
            // entonces el número si es primo y la variable booleana "primo" se le asigna un verdadero y se cierra el bucle
            if (siPrimo > 2) {
                primo = true;
                break;

            }
        }
        return primo;
    }
    
}
