/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosteoricos;

import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num1 = leer.nextInt();
        System.out.println("Ingres el segundo número: ");
        num2 = leer.nextInt();
        if (25 < num1 & 25 < num2) {
            System.out.println("Ambos números son mayores que 25");

        } else if (25 < num1 || 25 < num2) {
            System.out.println("Uno de los números es mayor que 25");
        } else {
            System.out.println("Ninguno de los números es mayor que 25");

        }
    }
}
