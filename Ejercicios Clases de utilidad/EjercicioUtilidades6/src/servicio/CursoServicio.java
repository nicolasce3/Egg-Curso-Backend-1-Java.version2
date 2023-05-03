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
            System.out.println("Nombre: " + curso.getAlumnos()[i]);
        }
    }

    public void crearCurso(Curso curso) {
        System.out.println("Ingrese el nombre del curso: ");
        curso.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por día (entre 1 y 6): ");
        curso.setCantidadHorasPorDia(leer.nextInt());
        while (curso.getCantidadHorasPorDia() > 6 || curso.getCantidadHorasPorDia() < 1) {
            System.out.println("Cantidad de horas erróneas.");
            System.out.println("Ingrese la cantidad de horas por día (entre 1 y 6): ");
            curso.setCantidadHorasPorDia(leer.nextInt());
        }
        do {
            System.out.println("Ingrese la cantidad de días por semana(entre 1 y 7): ");
            curso.setCantidadDiasSemana(leer.nextInt());
            if (curso.getCantidadDiasSemana() > 7 || curso.getCantidadDiasSemana() < 1) {
                System.out.println("Cantidad de días errónea. ");
            }
        } while (curso.getCantidadDiasSemana() > 7 || curso.getCantidadDiasSemana() < 1);

        do {
            System.out.println("Turno: ¿mañana o tarde?: ");
            curso.setTurno(leer.next());
            if (!curso.getTurno().equalsIgnoreCase("Mañana") && !curso.getTurno().equalsIgnoreCase("Tarde")) {
                System.out.println("Error. Ingrese un turno correcto");
            }
        } while (!curso.getTurno().equalsIgnoreCase("Mañana") && !curso.getTurno().equalsIgnoreCase("Tarde"));

        System.out.println("¿Precio por hora?");
        curso.setPrecioPorHora(leer.nextDouble());
        System.out.println("");
        System.out.println("Cargar alumnos: ");
        cargarAlumnos(curso);
    }

    public double calcularGanancia(Curso curso) {
        return curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getAlumnos().length * curso.getCantidadDiasSemana();
    }
}
