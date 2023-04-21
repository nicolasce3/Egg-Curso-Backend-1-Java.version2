/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioservicio3;

import entidades.Persona;
import java.util.Scanner;
import servicios.PersonaServicio;

/**
 *
 * @author Discoxz01
 */
public class MainEjercicioServicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicio servicio = new PersonaServicio();
        Persona [] personas = new Persona[4];

        int resultadosIMC[] = new int[4];
        boolean mayoresEdad[] = new boolean[4];

        for (int i = 0; i < 4; i++) {
            personas[i] = servicio.crearPersona();
            resultadosIMC[i] = servicio.calcularIMC(personas[i]);
            mayoresEdad[i] = servicio.esMayorDeEdad(personas[i]);

        }

        double porcentajePesoBajo = servicio.calcularPorcentajesIMC(resultadosIMC, -1);
        double porcentajePesoIdeal = servicio.calcularPorcentajesIMC(resultadosIMC, 0);
        double porcentajeSobrePeso = servicio.calcularPorcentajesIMC(resultadosIMC, 1);

        System.out.println("El porcentaje de personas con bajo peso es de : " + porcentajePesoBajo + "%");
        System.out.println("El porcentaje de personas con peso ideal es de : " + porcentajePesoIdeal + "%");
        System.out.println("El porcentaje de personas con sobrepeso es de: " + porcentajeSobrePeso + "%");

        double porcentajeMenoresEdad = servicio.calcucarPorcentajeMayorEdad(mayoresEdad, false);
        double porcentajeMayoresEdad = servicio.calcucarPorcentajeMayorEdad(mayoresEdad, true);

        System.out.println("El porcentaje de mayores de edad es de: " + porcentajeMayoresEdad + "%");
        System.out.println("El porcentaje de menores de edad es de: " + porcentajeMenoresEdad + "%");
    }

}
