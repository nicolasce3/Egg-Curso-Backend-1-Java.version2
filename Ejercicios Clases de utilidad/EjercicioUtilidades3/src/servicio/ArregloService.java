/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Arrays;

/**
 *
 * @author Discoxz01
 */
public class ArregloService {

    public void inicializarA(double[] A) {
        for (int i = 0; i < 50; i++) {
            A[i] = (int) (Math.random() * 100);

        }
    }

    public void mostrar(double[] vector) {
        System.out.println(Arrays.toString(vector));

    }

    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
        for (int i = 0; i < arreglo.length / 2; i++) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }
    }

    public void inicializarB(double[] A, double[] B) {
        for (int i = 0; i < 10; i++) {
            B[i] = A[i];
        }
        double variable = 0.5;
        Arrays.fill(B, 10, 20, variable);
    }
}
