/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class PersonaServicio {

    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo(H,M,O):  ");
        char sexo = leer.next().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Error. Ingrese el sexo nuevamente: ");
            sexo = leer.next().charAt(0);
        }
        System.out.println("Ingrese el peso: ");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la altura: ");
        double altura = leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);

        if (imc < 20) {
            System.out.println("La persona está por debajo de su peso ideal.");
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("La persona está en su peso ideal.");
            return 0;
        } else {
            System.out.println("La persona tiene sobrepeso.");
            return 1;
        }

    }

    public double calcularPorcentajesIMC(int[] resultados, int valor) {
        int contador = 0;
        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i] == valor) {
                contador++;
            }
        }

        return (double) (contador / 4) * 100;
    }

    public double calcucarPorcentajeMayorEdad(boolean[] resultados, boolean valor) {
        int contador = 0;
        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i] == valor) {
                contador++;
            }
        }
        return (double) (contador / 4) * 100;
    }
}
