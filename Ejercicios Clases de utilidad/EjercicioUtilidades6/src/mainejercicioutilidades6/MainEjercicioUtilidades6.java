/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioutilidades6;

import entidades.Curso;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import servicio.CursoServicio;

/**
 *
 * @author Discoxz01
 */
public class MainEjercicioUtilidades6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Curso curso = new Curso();
        CursoServicio servicio = new CursoServicio();
      
        servicio.crearCurso(curso);
        try {
            Robot limpiar = new Robot();
            limpiar.keyPress(KeyEvent.VK_CONTROL);
            limpiar.keyPress(KeyEvent.VK_L);
            limpiar.keyRelease(KeyEvent.VK_CONTROL);
            limpiar.keyRelease(KeyEvent.VK_L);
            // Esperar un momento antes de continuar
            Thread.sleep(100);
        } catch (AWTException e) {
            System.out.println("Error al limpiar la pantalla: " + e.getMessage());
        }
        System.out.println("La ganancia por el curso es de: " + servicio.calcularGanancia(curso) + " pesos.");
        
        
    }
    
}
