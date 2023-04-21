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
public class Ejercicio5 {

    /**
     * @param args the command line arguments Una obra social tiene tres clases
     * de socios: ○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un
     * 50% de descuento en todos los tipos de tratamientos. ○ Los socios tipo
     * ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los
     * mismos tratamientos que los socios del tipo A. ○ Los socios que menos
     * aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
     * tratamientos. ○ Solicite una letra (carácter) que representa la clase de
     * un socio, y luego un valor real que represente el costo del tratamiento
     * (previo al descuento) y determine el importe en efectivo a pagar por
     * dicho socio.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String socio;
        double valor;
        System.out.println("Ingrese la letra de socio: ");

        socio = leer.nextLine();
        socio = socio.toUpperCase();
        System.out.println("Ingrese el costo del tratamiento: ");
        valor = leer.nextDouble();

        switch (socio) {
            case "A":
                System.out.println("El costo del tratamiento con un 50% de descuento es de: " + valor / 2 + " pesos.");
                break;
            case "B":
                System.out.println("El costo del tratamiento con un 35% de descuento es de: " + (valor - valor * 0.35) + " pesos.");
                break;
            case "C":
                System.out.println("El costo del tratamiento sin descuento es de: " + valor + " pesos.");
                break;
            default:
                System.out.println("Letra de socio incorrecta.");
        }

    }

}
