/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioutilidades1;

import entidades.Cadena;
import servicios.CadenaServicio;

/**
 *
 * @author Discoxz01
 */
public class MainEjercicioUtilidades1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cadena cadena = new Cadena("Casa blanca");
        CadenaServicio servicio = new CadenaServicio();
        servicio.mostrarVocales(cadena);
        servicio.invertirFrase(cadena);
        servicio.vecesRepetido(cadena);
        servicio.compararLongitud(cadena);
        servicio.unirFrases(cadena);
        servicio.remplazarletraA(cadena);
        servicio.contiene(cadena);
    }
    
}
