/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioutilidades2;

import entidades.ParDeNumeros;
import servicios.ParDeNumerosService;

/**
 *
 * @author Discoxz01
 */
public class MainEjercicioUtilidades2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumeros numeros = new ParDeNumeros();
        ParDeNumerosService servicio = new ParDeNumerosService();
        servicio.mostrarValores(numeros);
        
        System.out.println("El número mayor es: " + servicio.devolverMayor(numeros));
         System.out.println("El cálculo de la potencia es: " + servicio.calcularPotencia(numeros));
         System.out.println("La raíz del número menor es: " + servicio.calculaRaiz(numeros));
    }
    
}
