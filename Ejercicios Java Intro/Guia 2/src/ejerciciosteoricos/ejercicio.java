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
public class ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        int num;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            num = input.nextInt();

            // Imprimir el número y los asteriscos correspondientes en una sola línea utilizando bucles for anidados
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println(" " + num);
        }
    }
    
}
