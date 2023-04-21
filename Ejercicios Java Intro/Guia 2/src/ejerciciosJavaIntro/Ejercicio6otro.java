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
public class Ejercicio6otro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        String opcion;
        String acept = "";
        do {

            
            

            do {
                System.out.println("---------- MENU ----------");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Ingrese una Opción:");
                opcion = leer.nextLine();
                switch (opcion) {
                    case "1":
                        System.out.println("la suma de los numeros es " + (num1 + num2));
                        break;
                    case "2":
                        System.out.println("la resta " + (num1 - num2));
                        break;
                    case "3":
                        System.out.println("el resultado de la multiplicacion es " + (num1 * num2));
                        break;
                    case "4":
                        System.out.println("el resultado de la division es " + (num1 / num2));
                        break;
                    case "5":
                        System.out.println("esta seguro s/n?");
                        acept = leer.nextLine();
                        if (opcion.equals("s")) {
                            acept = opcion;
                        }
                        break;
                }

            } while (!opcion.equals("5"));

        } while (!acept.equalsIgnoreCase("s"));

    }

}
