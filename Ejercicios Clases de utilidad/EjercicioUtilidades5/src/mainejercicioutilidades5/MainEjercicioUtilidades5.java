/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioutilidades5;

import entidades.Persona;
import java.util.Date;
import servicio.PersonaService;

/**
 *
 * @author Discoxz01
 */
public class MainEjercicioUtilidades5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService servicio = new PersonaService();
        Persona persona = servicio.crearPersona();
        
        int edad = servicio.calcularEdad(persona);
        boolean edadConsultada = servicio.menorQue(edad, 40);
        System.out.println("¿Es menor que la edad consultada?" + edadConsultada);
        servicio.mostrarPersona(persona, edad);
    }
    
}
