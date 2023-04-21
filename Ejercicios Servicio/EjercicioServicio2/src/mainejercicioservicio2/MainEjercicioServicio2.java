/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioservicio2;

import entidades.Cafetera;
import java.util.Scanner;
import servicios.CafeteraServicio;

/**
 *
 * Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con
 * los atributos capacidadMáxima (la cantidad máxima de café que puede contener
 * la cafetera) y cantidadActual (la cantidad actual de café que hay en la
 * cafetera). Agregar constructor vacío y con parámetros así como setters y
 * getters. Crear clase CafeteraServicio en el paquete Servicios con los
 * siguiente: a) Método llenarCafetera(): hace que la cantidad actual sea igual
 * a la capacidad máxima. b) Método servirTaza(int): se pide el tamaño de una
 * taza vacía, el método recibe el tamaño de la taza y simula la acción de
 * servir la taza con la capacidad indicada. Si la cantidad actual de café “no
 * alcanza” para llenar la taza, se sirve lo que quede. El método le informará
 * al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó
 * la taza. c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
 * d) Método agregarCafe(int): se le pide al usuario una cantidad de café, el
 * método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
public class MainEjercicioServicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la capacidad máxima de la cafetera: ");
        int capacidadMaxima = leer.nextInt();

        Cafetera cafetera = new Cafetera(capacidadMaxima, 0);
        CafeteraServicio servicio = new CafeteraServicio();

        servicio.llenarCafetera(cafetera);
        System.out.println("Ingrese el tamaño de la taza: ");
        int tamanioTaza = leer.nextInt();
        servicio.servirTaza(cafetera, tamanioTaza);

        System.out.println("¿Desea vaciar la cafetera?");
        String opcion = leer.next();
        if (opcion.equalsIgnoreCase("si")) {
            servicio.vaciarCafetera(cafetera);
            System.out.println("La cafetera se ha vaciado.");
        }

        servicio.agregarCafe(cafetera);
    }

}
