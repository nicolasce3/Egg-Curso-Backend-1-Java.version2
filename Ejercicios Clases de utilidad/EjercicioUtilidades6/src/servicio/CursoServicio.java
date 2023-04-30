/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class CursoServicio {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");

    public void cargarAlumnos(Curso curso) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1) + ":");
            curso.getAlumnos()[i] = leer.next();
        }
    }
    
    public void crearCurso(Curso curso){
        System.out.println("Ingrese el nombre del curso: ");
        curso.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por día: ");
        curso.setCantidadHorasPorDia(leer.nextInt());
    }
    
}
