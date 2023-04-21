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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     * 
     * Crea una aplicación que a través de una función nos convierta una
     * cantidad de euros introducida por teclado a otra moneda, estas pueden
     * ser a dólares, yenes o libras. La función tendrá como parámetros, la
     * cantidad de euros y la moneda a convertir que será una cadena, este no
     * devolverá ningún valor y mostrará un mensaje indicando el cambio
     *  (void).
     * El cambio de divisas es:
     *   i. * 0.86 libras es un 1 €
     *  ii. * 1.28611 $ es un 1 €
     * iii. * 129.852 yenes es un 1 €
     * 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int euros;
        String cambio;
        System.out.println("Ingrese la cantidad de euros que desea convertir: ");
        euros = leer.nextInt();
        System.out.println("¿A qué moneda la desea convertir, dolares, libras o yenes?");
        cambio = leer.next();
        cambio = cambio.toLowerCase();
        Conversion(euros, cambio);
    }
    public static void Conversion(int euros, String cambio){
        switch(cambio){
            case "libras": System.out.println(euros + " euros a libras son : " + (euros*0.86));
            break;
            case "dolares": System.out.println(euros + " euros a dólares son: " + (euros*1.28611));
            break;
            case "yenes": System.out.println(euros + " euros a yenes son: " + (euros*129.852));
            break;
        }
    }
}
