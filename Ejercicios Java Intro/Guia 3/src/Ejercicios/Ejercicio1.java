/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     * * Crea una aplicación que le pida dos números al usuario y este pueda
     *  elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
     *  una función para cada operación matemática y deben devolver sus
     *  resultados para imprimirlos en el main.
     * 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        System.out.println("Ingrese el primer número: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = leer.nextInt();
        System.out.println("Ingrese una opción");
        opcion = leer.nextInt();
        
             int suma = Sumar(num1,num2);
             int resta = Restar(num1,num2);
             int multiplicar = Multiplicar(num1,num2);
             int division = Dividir(num1,num2);
        switch(opcion){
            case 1: System.out.println("El resultado de la suma es: " + suma);
            break;
            case 2:System.out.println("El resultado de la resta : " + resta);
            break;
            case 3:System.out.println("El resultado de la multiplicación es: " + multiplicar);
            break;
            case 4: System.out.println("El resultado de la división es :" + division);
            break;
            default: System.out.println("Ha salido del sistema.");
        }
        
        
        
    }
    public static int Sumar(int num1,int num2){
        int suma;
        suma = num1+num2;
        
        return suma;
    }
   
    public static int Restar(int num1, int num2){
        int resta;
        resta = num1-num2;
        return resta;
    }
    
    public static int Multiplicar(int num1, int num2){
        int multiplicar;
        multiplicar = num1*num2;
        return multiplicar;
    }
    
    public static int Dividir(int num1, int num2){
        int division;
        division = num1/num2;
        return division;
    }
    
}
