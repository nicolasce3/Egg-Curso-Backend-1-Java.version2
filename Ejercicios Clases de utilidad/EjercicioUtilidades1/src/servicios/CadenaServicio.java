/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class CadenaServicio {

    public void mostrarVocales(Cadena cadena) {

        int contadorVocales = 0;
        for (int i = 0; i < cadena.getLongitudFrase(); i++) {
            String letra = cadena.getFrase().substring(i, i + 1).toLowerCase();
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                contadorVocales++;
            }

        }
        System.out.println("La cantidad de vocales que hay en la frase es de: " + contadorVocales);
    }

    public void invertirFrase(Cadena cadena) {

        String fraseInvertida = "";
        for (int i = cadena.getLongitudFrase(); i > 0; i--) {
            fraseInvertida += cadena.getFrase().substring(i - 1, i).toLowerCase();
        }
        System.out.println("Frase invertidad: " + fraseInvertida);
    }

    public void vecesRepetido(Cadena cadena) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
        System.out.println("Ingrese un caracter para contar cuántas veces se repite: ");
        String caracter = leer.next();
        int contador = 0;
        for (int i = 0; i < cadena.getLongitudFrase(); i++) {
            String letra = cadena.getFrase().substring(i, i + 1).toLowerCase();
            if (caracter.equals(letra)) {
                contador++;
            }

        }
        System.out.println("La letra ingresada se repite " + contador + " veces.");

    }

    public void compararLongitud(Cadena cadena) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
        System.out.println("Ingrese una nueva frase: ");
        String frase2 = leer.next();
        if (cadena.getLongitudFrase() == frase2.length()) {
            System.out.println("Las frases tienen la misma longitud.");
        } else {
            System.out.println("Las frase no tienen la misma longitud.");
        }

    }

    public void unirFrases(Cadena cadena) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
        System.out.println("Ingrese una nueva frase: ");
        String frase3 = leer.next();
        String fraseConcatenada = cadena.getFrase() + frase3;
        System.out.println("Frase concatenada: " + fraseConcatenada);
    }

    public void remplazarletraA(Cadena cadena) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
        System.out.println("Ingrese el caracter que desea remplazar por la letra A: ");
        String letra4 = leer.next();
        String conversion = "";

        for (int i = 0; i < cadena.getLongitudFrase(); i++) {
            String letra = cadena.getFrase().substring(i, i + 1).toLowerCase();

            if (letra.equals("a")) {
                conversion += letra4;
            } else {
                conversion += letra;
            }
        }
        System.out.println("La conversión es:  " + conversion);
    }

    public void contiene(Cadena cadena) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
        System.out.println("Ingrese el caracter que desea buscar: ");
        String letra5 = leer.next();
        boolean confirmado = false;

        for (int i = 0; i < cadena.getLongitudFrase(); i++) {
            String letra = cadena.getFrase().substring(i, i + 1).toLowerCase();

            if (letra.equals(letra5)) {
                confirmado = true;
                break;
            }
        }
        System.out.println(confirmado);
    }

}
