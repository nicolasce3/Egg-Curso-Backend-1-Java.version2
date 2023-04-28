/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioutilidades3;

import servicio.ArregloService;

/**
 *
 * @author Discoxz01
 */
public class EjercicioUtilidades3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] A = new double[50];
        double [] B = new double[20];
        ArregloService servicio = new ArregloService();
        servicio.inicializarA(A);
        System.out.println("Mostrar A: ");
        servicio.mostrar(A);
        servicio.ordenar(A);
        System.out.println("Mostrar A ordenado de mayor a menor:");
        servicio.mostrar(A);
        System.out.println("");
        servicio.inicializarB(A, B);
        System.out.println("Mostrar B:");
        servicio.mostrar(B);
        
      
    }
    
}
