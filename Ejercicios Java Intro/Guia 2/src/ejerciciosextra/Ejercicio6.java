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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     * Leer la altura de N personas y determinar el promedio de estaturas que
     * se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
     * general.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int personas,contadorBajo = 0, contadorGeneral = 0;
        double  estatura, promedioBajo = 0, promedioGeneral = 0;
        System.out.println("Ingrese la cantidad de personas: ");
        personas = leer.nextInt();
        for (int i = 1; i < personas+1; i++) {
            System.out.println("Ingrese la estatura de la persona " + i + " :");
            estatura = leer.nextDouble();
            
            contadorGeneral++;
            promedioGeneral = (estatura + promedioGeneral);
            
            if(estatura < 1.60){
                contadorBajo++;
                promedioBajo = (estatura + promedioBajo);}
           
        }
        if(contadorBajo > 0){
        promedioBajo = promedioBajo/contadorBajo;
         System.out.println("El promedio de los que miden menos de 1,60 es de : " + promedioBajo);}
        if(contadorGeneral>0){
       promedioGeneral= promedioGeneral/contadorGeneral;
            System.out.println("El promedio general es de : " + promedioGeneral);}
        
        
        
    }
    
    }
