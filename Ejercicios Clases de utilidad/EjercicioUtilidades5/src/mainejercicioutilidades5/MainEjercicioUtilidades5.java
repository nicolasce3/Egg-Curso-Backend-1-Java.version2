/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioutilidades5;

import entidades.Persona;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;


import servicio.PersonaService;

/**
 *
 * @author Discoxz01
 */
public class MainEjercicioUtilidades5 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        PersonaService servicio = new PersonaService();
        Persona persona = servicio.crearPersona();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
        int edad = servicio.calcularEdad(persona);
        boolean edadConsultada = servicio.menorQue(edad, 40);
        try {
            Robot limpiar = new Robot();
            limpiar.keyPress(KeyEvent.VK_CONTROL);
            limpiar.keyPress(KeyEvent.VK_L);
            limpiar.keyRelease(KeyEvent.VK_CONTROL);
            limpiar.keyRelease(KeyEvent.VK_L);
            // Esperar un momento antes de continuar
            Thread.sleep(100);
        } catch (AWTException e) {
            System.out.println("Error al limpiar la pantalla: " + e.getMessage());
        }
        System.out.println("Ingrese un número: ");
        int num = leer.nextInt();
        System.out.println("¿Es menor que la edad consultada?" + edadConsultada);
        servicio.mostrarPersona(persona, edad);
        System.out.println(num);
    }

}
