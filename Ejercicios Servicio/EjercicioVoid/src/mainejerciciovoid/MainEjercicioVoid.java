/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejerciciovoid;

import entidades.Persona;
import servicios.ServicioPersona;

/**
 *
 * Crea un método void que reciba un objeto tipo persona como parámetro y
 * utilice el get para mostrar sus atributos. Llama ese método desde el main.
 */
public class MainEjercicioVoid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona = new Persona("Nicolas", 30,"argentino");
        ServicioPersona servicioPersona = new ServicioPersona();    
        servicioPersona.CrearPersona(persona);
    }
    
    
    
    
    
}
