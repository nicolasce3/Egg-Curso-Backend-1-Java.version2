/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra;

import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     * Escriba un programa que lea números enteros. Si el número es múltiplo
     * de cinco debe detener la lectura y mostrar la cantidad de números
     * leídos, la cantidad de números pares y la cantidad de números impares.
     * Al igual que en el ejercicio anterior los números negativos no deben
     * sumarse. Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, par = 0, impar = 0,contador=0;
        
        do {
            System.out.println("Ingrese un número entero: ");
            num = leer.nextInt();
            if(num>0){
                contador++;
            } if(num % 2 == 0){
                par++;
            }else{
                impar++;
            }
            
        } while (num % 5 != 0);
        
        System.out.println("Números ingresados: " + contador);
        System.out.println("Números pares: " + par);
        System.out.println("Números impares : " + impar);
        
    }
    
}
