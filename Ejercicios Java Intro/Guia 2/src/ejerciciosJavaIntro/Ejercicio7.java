/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosJavaIntro;

import java.util.Scanner;

/**
 *
 * @author Discoxz01
 * * Realizar un programa que simule el funcionamiento de un dispositivo
    * RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
    * de 5 caracteres de largo, el primer carácter tiene que ser X y el último
    * tiene que ser una O.
    * Las secuencias leídas que respeten el formato se consideran correctas,
     * la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
     * FDE , y toda secuencia distinta de FDE, que no respete el formato se
     * considera incorrecta.
     * Al finalizar el proceso, se imprime un informe indicando la cantidad de
     * lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
     * deberá investigar cómo se utilizan las siguientes funciones de Java
     * Substring(), Length(), equals().
     */

public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int longitud, contadorCorrecto = 0, contadorIncorrecto = -1;
        String secuencia, letraX, letraO;
        do {
            System.out.println("Ingrese una secuencia de 5 caracteres");
            secuencia = leer.nextLine();
            longitud = secuencia.length();
            letraX = secuencia.substring(0,1);
            letraO = secuencia.substring(longitud-1, longitud);
            if (longitud <= 5 && letraX.equalsIgnoreCase("x") && letraO.equalsIgnoreCase("o")){
                contadorCorrecto ++;
            }else{
            //este contador se inicializa en -1 porque cuando se ingresa &&&&& se ejecuta el else
            contadorIncorrecto  ++;}
        } while (!secuencia.equals("&&&&&"));
        
        System.out.println("Lecturas correctas: " + contadorCorrecto);
        System.out.println("Lecturas incorrectas: " + contadorIncorrecto);
        
    }
    
}
