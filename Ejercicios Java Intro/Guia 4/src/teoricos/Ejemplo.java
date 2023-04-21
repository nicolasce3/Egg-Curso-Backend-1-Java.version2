/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoricos;

/**
 *
 * @author Discoxz01
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vector[] = new int[5]; // Le ponemos la dimension al vector
// Puedo asignar valores de esta manera
        vector[0] = 3;
// Asigno valores mediante el for
        for (int i = 0; i < 5; i++) {
            vector[i] = i + 3;
        }
// Muestro el vector
        for (int i = 0; i < 5; i++) {
            System.out.println("[" + vector[i] + "]");
        }

        String[][] matriz = new String[3][3];

// Puedo asignar valores de esta manera
        matriz[0][0] = "A";
// Asigno valores mediante el For
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = "A";
            }
        }
// Muestro la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

}


