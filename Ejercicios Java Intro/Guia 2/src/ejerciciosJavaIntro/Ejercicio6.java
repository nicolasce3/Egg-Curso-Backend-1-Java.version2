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
public class Ejercicio6 {

    /**
     * @param args the command line arguments Realizar un programa que pida dos
     * números enteros positivos por teclado y muestre por pantalla el siguiente
     * menú:El usuario deberá elegir una opción y el programa deberá mostrar el
     * resultado por pantalla y luego volver al menú. El programa deberá
     * ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el
     * usuario selecciona la opción 5, en vez de salir del programa
     * directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
     * seguro que desea salir del programa S/N ? Si el usuario selecciona el
     * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el
     * menú.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        System.out.println("Ingrese el primer número: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = leer.nextInt();

        do {
            System.out.println("MENÚ");
            System.out.println("Elija una opción:");
            System.out.println("");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("El resultado de la suma es: " + suma);
                    continue;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resta);
                    continue;
                case 3:
                    int multiplicar = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + multiplicar);
                    continue;
                case 4:
                    double dividir = num1 / num2;
                    System.out.println("El resultado de la división es: " + dividir);
                    continue;
                case 5:

                    System.out.println("¿Está seguro que desea salir del programa S/N ?");
                    String confirma = leer.next();
                    if (confirma.equalsIgnoreCase("S")) {
                        System.out.println("Ha salido del programa.");
                        break;
                    } else {
                        opcion = 0;

                        continue;
                    }

                default:
                    System.out.println("Error.Ingrese una opción válida.");
            }

        } while (opcion != 5);

    }

}
