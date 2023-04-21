/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Raices;

/**
 *
 * @author Discoxz01
 */
public class RaicesServicio {

    public double getDiscriminante(Raices raices) {

        return Math.pow(raices.getB(), 2) - 4 * raices.getA() * raices.getC();

    }

    public boolean tieneRaices(Raices raices) {
        return getDiscriminante(raices) >= 0;
    }

    public boolean tieneRaiz(Raices raices) {
        return getDiscriminante(raices) == 0;
    }

    public void obteneRaices(Raices raices) {
        if (tieneRaices(raices) == true) {
            double x1 = -raices.getB() + Math.sqrt(Math.pow(raices.getB(), 2)) - (4 * raices.getA() * raices.getC()) / (2 * raices.getA());
            double x2 = -raices.getB() - Math.sqrt(Math.pow(raices.getB(), 2)) - (4 * raices.getA() * raices.getC()) / (2 * raices.getA());
            System.out.println("La primer solución posible es : " + x1);
            System.out.println("La segunda solución posible es: " + x2);
        }else{
            System.out.println("No hay soluciones posibles.");
        }
    }

}
