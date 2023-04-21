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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, var1 = 0, var2 = 1, var3 = 2, var4 = 3;
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un número entre 1 y 20: ");
            num = leer.nextInt();

            if (num > 20 || num < 1) {
                i--;
                System.out.println("Error.Escriba un número entre 1 y 20");
                continue;
            }
            if (i == 0) {
                var1 = num;
            }
            if (i == 1) {
                var2 = num;
            }
            if (i == 2) {
                var3 = num;
            }
            if (i == 3) {
                var4 = num;
            }
        }
        System.out.println("");
        System.out.print(var1+" ");
        for (int i = 0; i < var1; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(var2+" ");
        for (int i = 0; i < var2; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(var3+" ");
        for (int i = 0; i < var3; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(var4+" " );
        for (int i = 0; i < var4; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
