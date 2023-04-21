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
public class Ejercicio7dowhile {

    /**
     * @param args the command line arguments Realice un programa que calcule y
     * visualice el valor máximo, el valor mínimo y el promedio de n números
     * (n>0). El valor de n se solicitará al principio del programa y los
     * números serán introducidos por el usuario. Realice dos versiones del
     * programa, una usando el bucle “while” y otra con el bucle “do - while”.
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n, num, min = 0, max = 0, promedio = 0, contador = 0;

        System.out.println("Ingrese la cantidad de números: ");
        n = leer.nextInt();

        do {

            contador++;
            System.out.println("Ingrese un número: ");
            num = leer.nextInt();
            promedio = (promedio + num);
            if (contador == 1) {
                min = num;
                max = num;
            } else if (min > num) {
                min = num;
            } else if (max < num) {
                max = num;
            }

        } while (n > contador);

        System.out.println("El mínimo es: " + min);
        System.out.println("El máximo es: " + max);
        System.out.println("El promedio es: " + promedio/contador);
        
        
    }

}
