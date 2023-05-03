/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");

    public void crearJuego(Ahorcado ahorcado) {

        System.out.println("Ingrese una palabra de entre 2 y 20 caracteres: ");
        String palabra = leer.next();
        while (palabra.length() > 20 || palabra.length() < 2) {
            System.out.println("Extensión incorrecto. Ingrese una palabra de entre 2 y 20 caracteres: ");
            palabra = leer.next();
        }
        int l = palabra.length();
        palabra = palabra.toLowerCase();
        ahorcado.setPalabraBuscar(new String[l]);
        for (int i = 0; i < l; i++) {
            ahorcado.getPalabraBuscar()[i] = palabra.substring(i, i + 1);
        }

        System.out.println("Ingrese la cantidad de jugadas máximas: ");
        ahorcado.setJugadasMaximas(leer.nextInt());
        while (ahorcado.getJugadasMaximas() < 1) {
            System.out.println("Ingrese un número mayor a cero.");
            ahorcado.setJugadasMaximas(leer.nextInt());
        }

    }

    public void longitud(Ahorcado ahorcado) {
        int longitud1 = ahorcado.getPalabraBuscar().length;
        System.out.println("La longitud de la palabra es de " + longitud1 + " letras.");
    }

    public boolean buscar(Ahorcado ahorcado, String letra) {

        boolean encontrada = false;
        for (int i = 0; i < ahorcado.getPalabraBuscar().length; i++) {
            if (letra.equals(ahorcado.getPalabraBuscar()[i])) {               
                return encontrada = true;             
            }

        }
        return false;
    }

    public void encontradas(Ahorcado ahorcado) {
        int intentos = ahorcado.getJugadasMaximas();
        int letrasEncontradas = ahorcado.getLetrasEncontradas();
        do {
            System.out.println("Ingrese una letra para buscarla en la palabra: ");
            String letra = leer.next();
            letra = letra.toLowerCase();
            boolean encontrada = buscar(ahorcado, letra);
            if (encontrada == true) {
                System.out.println(encontrada);
                System.out.println("La letra pertenece a la palabra.");
                letrasEncontradas++;
            } else {
                System.out.println(encontrada);
                System.out.println("La letra no pertenece a la palabra.");
                intentos--;
            }

            System.out.println("Número de letras encontradas, faltantes: (" + (letrasEncontradas) + "-" + (letrasEncontradas-ahorcado.getPalabraBuscar().length) + ")");
            intentos(intentos);
        } while (intentos != 0 && letrasEncontradas != ahorcado.getPalabraBuscar().length);
        if (ahorcado.getPalabraBuscar().length == letrasEncontradas) {
            System.out.println("Ha descubierto toda la palabra.");

        } else {
            System.out.println("Ha agotado todos sus intentos.");
        }
    }

    public void intentos(int intentos) {
        System.out.println("Número de oportunidades restantes: " + intentos);
    }

    public void juego(Ahorcado ahorcado) {
        crearJuego(ahorcado);
        longitud(ahorcado);
        encontradas(ahorcado);
    }

}
