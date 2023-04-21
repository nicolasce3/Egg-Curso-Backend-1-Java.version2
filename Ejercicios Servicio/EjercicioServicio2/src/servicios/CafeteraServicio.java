/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class CafeteraServicio {

    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }

    public void servirTaza(Cafetera cafetera, int tamanioTaza) {
        if (cafetera.getCantidadActual() < tamanioTaza) {
            System.out.println("La taza no se pudo llenar y quedó con " + cafetera.getCantidadActual() + " ml de café.");
            tamanioTaza = cafetera.getCantidadActual();
            cafetera.setCantidadActual(0);
        } else {
            System.out.println("La taza se llenó " + tamanioTaza + "ml de café.");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanioTaza);
        }

    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafetera) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de café que desear ingresar en la cafetera: ");
        int cantidadCafe = leer.nextInt();
        if (cantidadCafe > cafetera.getCapacidadMaxima()) {
            System.out.println("La cantidad de café ingresada es superior a la capacidad máxima. La cafetera se ha llenado. ");
        } else {
            cafetera.setCantidadActual(cantidadCafe + cafetera.getCantidadActual());
            System.out.println("La cantidad actual en la cafetera es de : " + cafetera.getCantidadActual());
        }

    }

}
