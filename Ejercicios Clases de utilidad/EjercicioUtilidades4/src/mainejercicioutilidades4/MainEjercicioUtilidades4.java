/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioutilidades4;

import java.util.Date;
import servicios.FechaService;

/**
 *
 * @author Discoxz01
 */
public class MainEjercicioUtilidades4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService servicio = new FechaService();

        Date fechaYo = servicio.fechaDeNacimiento();
        Date fechaActual = servicio.fechaActual();
        System.out.println("Mi edad es: " + servicio.calcularEdad(fechaYo, fechaActual));

    }

}
