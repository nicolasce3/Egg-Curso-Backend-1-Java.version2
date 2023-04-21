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
     * @param args the command line arguments Construya un programa que lea 5
     * palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las
     * va ingresando, construya una “sopa de letras para niños” de tamaño de 20
     * x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en
     * una fila que será seleccionada de manera aleatoria. Una vez concluida la
     * ubicación de las palabras, rellene los espacios no utilizados con un
     * número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de
     * letras creada.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int azar;
        String palabra[] = new String[5];
        String[][] sopa = new String[20][20];

        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese una palabra de entre 3 y caracteres: ");
                palabra[i] = leer.nextLine();

                if (palabra[i].length() > 5 || palabra[i].length() < 3) {
                    System.out.println("Error.");
                }

            } while (palabra[i].length() > 5 || palabra[i].length() < 3);
        }
        for (int i = 0; i < 5; i++) {
            //para evitar que se superpongan verifico que la posicion de la matriz esté vacía
            do {
                azar = (int) Math.floor(Math.random() * 20);
            } while (sopa[azar][0] != null);
//con este bucle for voy cargando cada letra en cada posicion de la matriz
            for (int j = 0; j < palabra[i].length(); j++) {
//la variable azar selecciona aleatoriamente la fila que se llenará
                sopa[azar][j] = palabra[i].substring(j, j + 1);
            }
        }
// para llenar los espacios vacios
        for (int i = 0; i < 20; i++) {

            for (int j = 0; j < 20; j++) {
                //este condicional verifica que el espacio de la matríz esté vacío para llenarlo de números
                if (sopa[i][j] == null) {
                    azar = (int) Math.floor(Math.random() * 10);
                    sopa[i][j] = Integer.toString(azar);
                }

            }

        }
//imprime la matrix
        for (int i = 0;
                i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                System.out.print(" " + sopa[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
