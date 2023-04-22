/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioextraservicio1;

import entidades.Raices;
import servicio.RaicesServicio;

/**
 *
 * @author Discoxz01
 */
public class MainEjercicioExtraServicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Raices raices = new Raices(1, 4, 1);
        RaicesServicio servicio = new RaicesServicio();
        servicio.calcularRaiz(raices);
    }

}
