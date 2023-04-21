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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     * Realice un programa para que el usuario adivine el resultado de una
     * multiplicación entre dos números generados aleatoriamente entre 0 y 10.
     * El programa debe indicar al usuario si su respuesta es o no correcta. En
     * caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
     * su respuesta nuevamente. Para realizar este ejercicio investigue como
     * utilizar la función Math.random() de Java.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int  num;
        double numSecreto1, numSecreto2, multiplicacion;
        numSecreto1 = (Math.random()* 10 + 1);
        numSecreto2 = (Math.random()* 10 + 1);
        multiplicacion = numSecreto1*numSecreto2;
        System.out.println(numSecreto1 +"*"+ numSecreto2);
        // transforma un double en un int y la función math.round lo redondea al más cercano
        // otra manera sin recurrir al casteo es la siguiente System.out.printf("%.0f", multiplicacion);
        int multiplicacion1 = (int) Math.round(multiplicacion);
        System.out.println(multiplicacion1);
        do {
             System.out.println("Adivine el número : ");
        num = leer.nextInt();
        if(num != multiplicacion1){
            System.out.println("Respuesta incorrecta.");
        }
        } while (num != multiplicacion1);
        
        System.out.println("Respuesta correcta.");
       
    }
    
}
