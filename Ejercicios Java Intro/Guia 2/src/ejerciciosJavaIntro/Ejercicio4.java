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
public class Ejercicio4 {

    /**
     * @param args the command line arguments Escriba un programa que pida una
     * frase o palabra y valide si la primera letra de esa frase es una ‘A’. Si
     * la primera letra es una ‘A’, se deberá de imprimir un mensaje por
     * pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
     * “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
     *
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una frase o palabra para verificar que la primera letra es 'A': ");
        palabra = leer.nextLine();
        // esta línea descompone la primera letra de la palabra o frase ingresada
        String letraA = palabra.substring(0, 1);

        if (letraA.equalsIgnoreCase("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }

}
