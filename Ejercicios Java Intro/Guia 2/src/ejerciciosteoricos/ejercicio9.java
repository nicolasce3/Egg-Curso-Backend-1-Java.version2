/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosteoricos;

import java.util.Scanner;

/**
 *
 * @author Discoxz01 Escriba un programa que lea 20 números. Si el número leído
 * es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el
 * numero cero". El programa deberá calcular y mostrar el resultado de la suma
 * de los números leídos, pero si el número es negativo no debe sumarse. Nota:
 * recordar el uso de la sentencia break.
 */
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, suma = 0, contador = 0;
        do {
            contador = ++contador;
            System.out.println("Ingreso de número " + contador);
            num = leer.nextInt();
            if (num > 0) {
                suma = num + suma;
            }
            if (num == 0) {
                System.out.println("Se capturó el número 0.");
                break;
            }

        } while (contador != 20);
        System.out.println("La suma de los números es: " + suma);
    }

}
