/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra;

/**
 *
 * @author Discoxz01 Necesitamos mostrar un contador con 3 dígitos X X X , que
 * muestre los números del 0 0 0 al 9 9 9, con la particularidad que cada vez
 * que aparezca un 3 lo sustituya por una E. Ejemplo: 0 0 0 0 0 1 0 0 2 0 0 E 0
 * 0 4 0 1 2 0 1 E Nota: investigar función equals() y como convertir números a
 * String.
 *
 *
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i != 3 && j != 3 && k != 3) {
                        System.out.println(i + "-" + j + "-" + k);
                    }
                    if (i == 3) {
                        String numCadena = Integer.toString(i);
                        numCadena = "E";
                        System.out.println(numCadena + "-" + j + "-" + k);
                    }
                    if (j == 3) {
                        String numCadena2 = Integer.toString(j);
                        numCadena2 = "E";
                        System.out.println(i + "-" + numCadena2 + "-" + k);
                    }
                    if (k == 3) {
                        String numCadena3 = Integer.toString(k);
                        numCadena3 = "E";

                        System.out.println(i + "-" + j + "-" + numCadena3);
                    }

                }
            }
        }
    }

}
