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
public class Ejercicio4 {

    /**
     * @param args the command line arguments Los profesores del curso de
     * programación de Egg necesitan llevar un registro de las notas adquiridas
     * por sus 10 alumnos para luego obtener una cantidad de aprobados y
     * desaprobados. Durante el período de cursado cada alumno obtiene 4 notas,
     * 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones
     * de cada nota son: Primer trabajo práctico evaluativo 10% Segundo trabajo
     * práctico evaluativo 15% Primer Integrador 25% Segundo integrador 50% Una
     * vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
     * Al final del programa los profesores necesitan obtener por pantalla la
     * cantidad de aprobados y desaprobados, teniendo en cuenta que solo
     * aprueban los alumnos con promedio mayor o igual al 7 de sus notas del
     * curso.
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] vector = new int[10][4];
        double promedio[] = new double[10];
        int practicoEvaluativo1 = 0, practicoEvaluativo2 = 0, integrador1 = 0, integrador2 = 0;
        int aprobados = 0, desaprobados = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                do {
                    if (j == 0) {
                        System.out.println("Ingrese la nota del primer trabajo práctico evaluativo del alumno " + (i + 1) + ":");
                        vector[i][j] = leer.nextInt();
                        practicoEvaluativo1 = vector[i][j];
                    }
                    if (j == 1) {
                        System.out.println("Ingrese la nota del segundo trabajo práctico evaluativo del alumno " + (i + 1) + ":");
                        vector[i][j] = leer.nextInt();
                        practicoEvaluativo2 = vector[i][j];
                    }
                    if (j == 2) {
                        System.out.println("Ingrese la nota del primer integrador del alumno " + (i + 1) + ":");
                        vector[i][j] = leer.nextInt();
                        integrador1 = vector[i][j];
                    }
                    if (j == 3) {
                        System.out.println("Ingrese la nota del segundo integrador del alumno " + (i + 1) + ":");
                        vector[i][j] = leer.nextInt();
                        integrador2 = vector[i][j];
                    }

                    if (vector[i][j] > 10 || vector[i][j] < 1) {
                        System.out.println("Error. Solo se permiten notas entre 1 y 10.");
                    }
                } while (vector[i][j] > 10 || vector[i][j] < 1);

                if (j == 3) {
                    promedio[i] = (practicoEvaluativo1 * 0.10) + (practicoEvaluativo2 * 0.15) + (integrador1 * 0.25) + (integrador2 * 0.50);
                }
                if (promedio[i] >= 7) {
                    aprobados++;

                } else {
                    desaprobados++;
                }

                System.out.println("Promedio" + promedio[i]);
            }

        }
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
}
