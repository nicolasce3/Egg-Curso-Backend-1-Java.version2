/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class NIFServicio {

    Scanner leer = new Scanner(System.in);

    public void crearNIF(NIF nif) {
        System.out.println("Ingrese su número de DNI: ");
        nif.setDNI(leer.nextInt());

        int posicion = nif.getDNI() % 23;
        nif.setLetra(NIF.getLetrasNIF(posicion));
        System.out.println("Letra " + nif.getLetra());

    }

    public void mostrarNIF(NIF nif) {
        crearNIF(nif);
        System.out.println("El NIF es: " + nif.getDNI() + "-" + nif.getLetra());
    }

}
