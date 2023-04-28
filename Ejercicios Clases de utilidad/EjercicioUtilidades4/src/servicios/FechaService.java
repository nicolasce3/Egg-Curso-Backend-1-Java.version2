/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class FechaService {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");

    public Date fechaDeNacimiento() {
        System.out.println("Ingrese el día de su nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        int año = leer.nextInt();
        return new Date(año - 1900, mes - 1, dia);
        //  Este método debería devolver un objeto Date que representa la fecha ingresada por el usuario,/
//  utilizando el formato "año-mes-día". Es importante tener en cuenta que el mes debe ser un número
//  entre 0 y 11, donde 0 representa enero y 11 representa diciembre, y que el año debe ser el año actual 
//  menos 1900. Al imprimir el objeto Date devuelto, se mostrará la fecha en el formato predeterminado
//  de Java, que es "EEE MMM dd HH:mm:ss zzz yyyy", donde "EEE" es el nombre abreviado del
//  día de la semana, "MMM" es el nombre abreviado del mes, "dd" es el día del mes, 
//  "HH:mm:ss" es la hora, minuto y segundo, "zzz" es la zona horaria y "yyyy" es el año.
    }

    public Date fechaActual() {

        Date fechaActual = new Date();
        return fechaActual;
    }

    public int calcularEdad(Date fechaDeNacimiento, Date fechaActual) {

        long milisegundosPorAnio = 31536000000L; // cantidad de milisegundos en un año
        long diferencia = fechaActual.getTime() - fechaDeNacimiento.getTime();
        int edad = (int) Math.round(diferencia / milisegundosPorAnio);

        return edad;

        // se hace el cálculo pasando las fechas a milisegundos para que sea más preciso
    }

    public int calcularEdad2(Date fechaDeNacimiento, Date fechaActual) {
        int edad = fechaActual.getYear() - fechaDeNacimiento.getYear();
        if (fechaDeNacimiento.getMonth() > fechaActual.getMonth()
                || (fechaDeNacimiento.getMonth() == fechaActual.getMonth() && fechaDeNacimiento.getDate() > fechaActual.getDate())) {
            edad--;
        }
        return edad;
        // se hace el cálculo pasando las fechas a años
    }

}
