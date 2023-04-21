/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosJavaIntro;

import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments Escriba un programa en el cual se
     * ingrese un valor límite positivo, y a continuación solicite números al
     * usuario hasta que la suma de los números introducidos supere el límite
     * inicial.
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite, num, suma = 0;
        System.out.println("Ingrese un valor límite positivo: ");
        limite = leer.nextInt();
        do {
            System.out.println("Ingrese un número para sumar y pasar el límite: ");
            num = leer.nextInt();
            suma = suma + num;
        } while (limite > suma);
        System.out.println("Se ha pasado el límite.");
    }

}
