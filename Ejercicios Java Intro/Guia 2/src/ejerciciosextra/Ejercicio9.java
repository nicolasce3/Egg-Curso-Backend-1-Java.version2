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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     * 
     * Simular la división usando solamente restas. Dados dos números enteros
     * mayores que uno, realizar un algoritmo que calcule el cociente y el
     * residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
     * obtener un resultado menor que el divisor, este resultado es el residuo, y
     * el número de restas realizadas es el cociente.
     * Por ejemplo: 50 / 13 
     * 50 – 13 = 37 una resta realizada
     * 37 – 13 = 24 dos restas realizadas
     * 24 – 13 = 11 tres restas realizadas
     * dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
     * 3.
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int num1, num2, cociente = 0,residuo, resultado;
        do{
        System.out.println("Ingrese un número mayor que 1 : ");
        num1 = leer.nextInt();
        }while(num1<= 1);
        do {
            System.out.println("Ingrese otro número mayor que 1");
            num2 = leer.nextInt();
        } while (num2 <= 1);
        resultado = num1 - num2;
        System.out.println(num1+" - "+ num2 + " = " + resultado);
        cociente++;
        do {
             cociente++; 
             resultado = resultado - num2;
            System.out.println(resultado+" - "+ num2 + " = " + resultado);
        } while (resultado > num2);
        
        
        System.out.println("El residuo es " + resultado  + " y el cociente es " + cociente);
        
    }
    
}
