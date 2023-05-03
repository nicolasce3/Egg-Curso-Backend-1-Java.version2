/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercioextrautilidades1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.util.Scanner;

/**
 *
 * Crea una clase en Java donde declares una variable de tipo array de Strings
 * que contenga los doce meses del año, en minúsculas. A continuación, declara
 * una variable mesSecreto de tipo String, y hazla igual a un elemento del array
 * (por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que
 * adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo
 * hace, pedir que vuelva a intentar adivinar el mes secreto. Un ejemplo de
 * ejecución del programa podría ser este: Adivine el mes secreto. Introduzca el
 * nombre del mes en minúsculas: febrero No ha acertado. Intente adivinarlo
 * introduciendo otro mes: agosto ¡Ha acertado!
 */
public class MainEjercioExtraUtilidades1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
//
//        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
//        Locale.setDefault(new Locale("es", "ES")); // establecer el idioma en español
//        Month[] meses = Month.values();  //crea un array con todos los meses del año
//        String[] mesesStr = new String[meses.length]; //crear un array con la longitud del array de meses
//        for (int i = 0; i < meses.length; i++) {
//            mesesStr[i] = meses[i].getDisplayName(TextStyle.FULL, Locale.getDefault()).toLowerCase();
////     Primero, se utiliza meses[i] para acceder al objeto Month correspondiente al mes en la posición i 
////     del array meses. Luego, se llama al método getDisplayName() en este objeto para obtener el nombre completo del mes en el idioma y estilo especificados.
////
////     El primer argumento de getDisplayName() es un objeto TextStyle que especifica el estilo en el que se desea
////     el nombre del mes. En este caso, se utiliza TextStyle.FULL para obtener el nombre completo del mes.
////
////     El segundo argumento es el objeto Locale que se utilizará para obtener el nombre del mes. En este caso,
////     se utiliza Locale.getDefault() para obtener el idioma predeterminado establecido anteriormente.
////
////     Por último, se llama al método toLowerCase() en el resultado de getDisplayName() para convertir el nombre 
////     del mes en minúscula antes de asignarlo a mesesStr[i]. De esta manera, el array mesesStr contendrá 
////     los nombres completos de los doce meses en minúscula en el idioma predeterminado
//        }
//        String mesSectreto = mesesStr[8];
//        System.out.println("Adivina el mes secreto: ");
//        String adivinarMes = leer.next();
//        adivinarMes = adivinarMes.toLowerCase();
//        while (!adivinarMes.equals(mesesStr[8])) {
//            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
//            adivinarMes = leer.next();
//            adivinarMes = adivinarMes.toLowerCase();
//        }
//
//        try {
//            Robot limpiar = new Robot();
//            limpiar.keyPress(KeyEvent.VK_CONTROL);
//            limpiar.keyPress(KeyEvent.VK_L);
//            limpiar.keyRelease(KeyEvent.VK_CONTROL);
//            limpiar.keyRelease(KeyEvent.VK_L);
//            // Esperar un momento antes de continuar
//            Thread.sleep(100);
//        } catch (AWTException e) {
//            System.out.println("Error al limpiar la pantalla: " + e.getMessage());
//        }
//        System.out.println("¡Ha acertado!");

//-----------------------------------------------------------------------------------------------------------------------------------------------
        
        

// String[] meses = new String[12];
//        for (int i = 0; i < 12; i++) {
//            meses[i] = Month.of(i + 1).getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
//        }
//       
//        ------------------------------------------------------------------------------------------------------------------------------------------
//        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = mes[8];
        System.out.println("Adivina el mes secreto: ");
        String adivinarMes = leer.next();
        adivinarMes = adivinarMes.toLowerCase();
        while (!adivinarMes.equals(mes[8])) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            adivinarMes = leer.next();
            adivinarMes = adivinarMes.toLowerCase();
        }
        
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
        System.out.println("¡Ha acertado!");
        
    }
}
