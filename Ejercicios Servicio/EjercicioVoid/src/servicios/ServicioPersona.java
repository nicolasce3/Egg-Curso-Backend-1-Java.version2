/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;

/**
 *
 * @author Discoxz01
 */
public class ServicioPersona {

    public void CrearPersona(Persona persona) {
        String nombre = persona.getNombre();
        int edad = persona.getEdad();
        String nacionalidad = persona.getNacionalidad();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nacionalidad: " + nacionalidad);

    }

}
