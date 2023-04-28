/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Discoxz01
 */
public class ParDeNumeros {
    private double num1;
    private double num2;

    public  ParDeNumeros() {
     this.num1 = Math.random()*10;
     this.num2 = Math.random()*10;
//  Utilizar un constructor sin parámetros permite que los valores aleatorios sean generados 
//   automáticamente cada vez que se crea un objeto de la clase "ParDeNumeros".
//
//   Si se utilizara un constructor con parámetros para inicializar "num1" con valores aleatorios, se requeriría 
//   que el usuario proporcione un valor aleatorio cada vez que se cree un objeto de la clase, lo cual 
//   podría no ser práctico o adecuado dependiendo de la situación.
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
    
    
}
