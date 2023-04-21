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
public class compañeroejem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
        int cantidad = 10;
        String numCadena = "";
        String num;
        int valorCadena;
        for (int j = 0; j < cantidad; j++) {
            System.out.println("Ingrese un número");
            num = leer.next();
            numCadena += num;
        }
        for (int i = 0; i < cantidad; i++) {
            System.out.print(Integer.valueOf(numCadena.substring(i, i + 1)));
            for (int j = 0; j < Integer.valueOf(numCadena.substring(i, i + 1)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
