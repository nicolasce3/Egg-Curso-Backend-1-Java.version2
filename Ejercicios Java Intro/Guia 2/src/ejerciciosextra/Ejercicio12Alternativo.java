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
public class Ejercicio12Alternativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 10; j++) {
        for (int k = 0; k < 10; k++) {
            String numCadenaI = (i == 3) ? "E" : Integer.toString(i);
            String numCadenaJ = (j == 3) ? "E" : Integer.toString(j);
            String numCadenaK = (k == 3) ? "E" : Integer.toString(k);

            if (!numCadenaI.equals("E") && !numCadenaJ.equals("E") && !numCadenaK.equals("E")) {
                System.out.println(numCadenaI + "-" + numCadenaJ + "-" + numCadenaK);
            } else {
                System.out.println(numCadenaI + "-" + numCadenaJ + "-" + numCadenaK);
            }
        }
    }
}
    }
    
}
