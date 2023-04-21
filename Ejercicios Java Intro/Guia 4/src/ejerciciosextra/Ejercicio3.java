/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra;

/**
 *
 * @author Discoxz01
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments Crear una función rellene un
     * vector con números aleatorios, pasándole un arreglo por parámetro.
     * Después haremos otra función o procedimiento que imprima el vector.
     *
     */
    public static void main(String[] args) {
        int vector[] = new int[5];
        Rellenar(vector);
        ImprimirMatrix(vector);
    }

    public static void Rellenar(int vector[]) {
        for (int i = 0; i < 5; i++) {
            vector[i] = (int) (Math.random() * 20);
        }
    }

    public static void ImprimirMatrix(int vector[]) {
        for (int i = 0; i < 5; i++) {
            System.out.println(vector[i]);
        }
    }
}
