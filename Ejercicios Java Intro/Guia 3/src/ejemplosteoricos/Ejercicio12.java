/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosteoricos;

import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     * 
     * Crea un procedimiento EsMultiplo
     * que reciba los dos números pasados por el
     * usuario, validando que el primer número múltiplo del segundo e imprima si el
     * primer número es múltiplo del segundo, sino informe que no lo son.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el primer número: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = leer.nextInt();
        validarMultiplo(num1,num2);
    }
    
    public static void validarMultiplo(int num1,  int num2) {
        
       if(num1%num2 == 0) {
           System.out.println("Es múltiplo.");
       }else{
           System.out.println("No es múltiplo: ");
       }
        
    }
}
