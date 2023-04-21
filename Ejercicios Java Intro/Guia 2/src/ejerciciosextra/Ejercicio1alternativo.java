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
public class Ejercicio1alternativo {

    /**
     * @param args the command line arguments
     * * Dado un tiempo en minutos,
     * calcular su equivalente en días y horas. Por ejemplo, si el usuario
     * ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
     * horas.
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de minutos: ");
       int minutos = leer.nextInt();
       int dias , horas ;
       
       horas = minutos / 60;
        dias = horas / 24;
        horas = horas % 24;
        
        System.out.println("Días: " + dias + " horas: " + horas);
        
       
       
        
    }
    
}
