/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.ParDeNumeros;

/**
 *
 * @author Discoxz01
 */
public class ParDeNumerosService {

    public void mostrarValores(ParDeNumeros numeros) {
        System.out.println("Número 1: " + numeros.getNum1());
        System.out.println("Número 2: " + numeros.getNum2());
    }

    public double devolverMayor(ParDeNumeros numeros) {
        return Math.max(numeros.getNum1(), numeros.getNum2());
    }

    public int calcularPotencia(ParDeNumeros numeros) {
        double mayor = devolverMayor(numeros);
        double menor = Math.min(numeros.getNum1(), numeros.getNum2());
        int mayor1 = (int) Math.round(mayor);
        int menor1 = (int) Math.round(numeros.getNum2());

        return (int) Math.pow(mayor, menor);
    }

    public double calculaRaiz(ParDeNumeros numeros) {

        double menor = Math.min(numeros.getNum1(), numeros.getNum2());
        double menor1 = Math.abs(numeros.getNum2());
        return Math.sqrt(menor1);
    }
}
