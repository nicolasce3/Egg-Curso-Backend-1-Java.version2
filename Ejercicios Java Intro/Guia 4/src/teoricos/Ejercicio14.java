/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoricos;

import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     * Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
     * compañeros de equipo
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String equipo [] = new String [5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre: ");
            equipo[i] = leer.nextLine();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre del compañero " + (i+1) + " :" + equipo[i]);
        }
    }
    
}
