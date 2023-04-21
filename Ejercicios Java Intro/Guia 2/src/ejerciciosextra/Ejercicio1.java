/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra;

import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments 
     * Dado un tiempo en minutos,
     * calcular su equivalente en días y horas. Por ejemplo, si el usuario
     * ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
     * horas.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int minutos, horas, dias, conversion;
        System.out.println("Ingrese la cantidad de minutos: ");
        minutos = leer.nextInt();

        if ((24 * 60) <= minutos) {
            dias = minutos / 1440;
            horas = minutos / 60;
            conversion = horas - 24 * dias;
            System.out.println(dias + " dia, " + conversion + " horas");
        /**
         los else if siguientes sirven para diferenciar 1 hora de dos horas en adelante en caso 
         de que sea menor a 1440 (un día en minutos)
        */
        } else if (120 <= minutos) {
            horas = minutos / 60;
            System.out.println(horas + " horas.");
        }else if (60 <= minutos && 120 > minutos) {
            horas = minutos/60;
            System.out.println(horas + " hora.");
        //este else se ejecuta en caso de que la variable minutos sea menor a 60
        }else {
            System.out.println("Minutos: " + minutos);
        }
    
    }

}
