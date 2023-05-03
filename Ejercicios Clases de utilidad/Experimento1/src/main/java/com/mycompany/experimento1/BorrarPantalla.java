/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.experimento1;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class BorrarPantalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
         String[] meses = new String[12];
        Date fecha = new Date();
        for (int i = 0; i < 12; i++) {
            fecha.setMonth(i);  // establecer el mes de la fecha
            meses[i] = fecha.getMonth() + 1 + "";  // obtener el número del mes y guardarlo en el array
        }
        // mostrar los meses del año
        for (int i = 0; i < 12; i++) {
            System.out.println(meses[i]);
        }
        
    }
    
}
