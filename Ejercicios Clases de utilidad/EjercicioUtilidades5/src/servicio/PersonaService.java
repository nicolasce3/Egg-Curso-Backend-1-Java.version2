/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");

    public Persona crearPersona() {
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.println("");
        Date fechaDeNacimiento = fechaDeNacimiento();
        Persona persona = new Persona(nombre,fechaDeNacimiento);
        return persona;
    }

    public Date fechaDeNacimiento() {
        System.out.println("Ingrese el día de su nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        int año = leer.nextInt();
        return new Date(año - 1900, mes - 1, dia);

    }
    
    public int calcularEdad(Persona persona) {

        long milisegundosPorAnio = 31536000000L; // cantidad de milisegundos en un año
        Date fechaActual = new Date();
        long diferencia = fechaActual.getTime() - persona.getFechaDeNacimiento().getTime();
        int edad = (int) Math.round(diferencia / milisegundosPorAnio);

        return edad;

        // se hace el cálculo pasando las fechas a milisegundos para que sea más preciso
    }
       
    public boolean menorQue(int edadPersona, int edadConsultada){
          
         return edadPersona < edadConsultada ;
    }
    
       public void mostrarPersona(Persona persona, int edad){
       System.out.println("Nombre: " + persona.getNombre());
       System.out.println("Fecha de nacimiento: " + persona.getFechaDeNacimiento());
       System.out.println("Edad: " + edad);
   }
    
}