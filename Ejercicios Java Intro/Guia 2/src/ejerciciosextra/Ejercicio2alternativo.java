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
public class Ejercicio2alternativo {

    /**
     * @param args the command line arguments
     */
   /*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
diferente a cada una. A continuación, realizar las instrucciones necesarias 
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D 
tome el valor de B. Mostrar los valores iniciales y los valores finales de cada 
variable. Utilizar sólo una variable auxiliar.

 */






    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int a = 10;
        int b = 15;
        int c = 20;
        int d = 25;
        int aux;
        
        System.out.println("Valores iniciales");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
        System.out.println("D = "+d);
        System.out.println("Valores convertidos");
        aux=a;
        a=d;
        System.out.println("A = "+a);
        a=aux;
        aux=b;
        b=c;
        System.out.println("B = "+b);
        b=aux;
        aux=c;
        c=a;
        System.out.println("C = "+c);
        d=b;
        System.out.println("D = "+d);
        
        
               
        
    }
         
    
}
