/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioextrautilidades2;

import entidades.Ahorcado;
import servicio.AhorcadoService;

/**
 *
 * @author Discoxz01
 */
public class MainEjercicioExtraUtilidades2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ahorcado ahorcado = new Ahorcado();
        AhorcadoService servicio = new AhorcadoService();
        
        servicio.juego(ahorcado);
    }
    
}
