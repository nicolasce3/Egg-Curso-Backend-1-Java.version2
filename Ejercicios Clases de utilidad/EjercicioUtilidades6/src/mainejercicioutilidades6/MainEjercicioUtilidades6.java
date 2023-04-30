/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioutilidades6;

import entidades.Curso;
import java.util.Arrays;
import servicio.CursoServicio;

/**
 *
 * @author Discoxz01
 */
public class MainEjercicioUtilidades6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso curso = new Curso();
        CursoServicio servicio = new CursoServicio();
        servicio.cargarAlumnos(curso);
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(curso.getAlumnos()));
        }
        
        
    }
    
}
