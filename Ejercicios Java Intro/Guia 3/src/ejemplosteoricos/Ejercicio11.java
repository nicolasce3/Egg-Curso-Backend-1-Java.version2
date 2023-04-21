/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosteoricos;

import java.util.Scanner;

/**
 *
 * @author Discoxz01 Escribir un programa que procese una secuencia de
 * caracteres ingresada por teclado y terminada en punto, y luego codifique la
 * palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por
 * el carácter que se indica en la tabla y el resto de los caracteres
 * (incluyendo a las vocales acentuadas) se mantienen sin cambios.
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String frase;
      do {
        System.out.println("Ingrese la frase: ");
        frase = leer.nextLine();
        } while (!frase.endsWith("."));
      
        System.out.println("");
        String retorno =transformarFrase(frase);
        
        System.out.println("Frase transformada : " + retorno);

    }

 public static String transformarFrase(String frase) {
    String armandoFrase = "";
    
    for (int i = 0; i < frase.length(); i++) {
        String letra = frase.substring(i, i + 1);

        if (letra.matches("[AEIOUaeiou]")) {
            switch (letra.toLowerCase()) { 
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
            }
        }

        armandoFrase += letra;
    }
    
    return armandoFrase;
}
}
