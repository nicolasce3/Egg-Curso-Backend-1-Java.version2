/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Discoxz01
 */
public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void cargarDatos() {
        Scanner leer = new Scanner(System.in, "UTF-8").useDelimiter("\n");
        System.out.println("Ingrese el número de ISBN: ");
        ISBN = leer.nextInt();
        System.out.println("Ingrese el título del libro: ");
        titulo = leer.next();
        System.out.println("Ingrese el nombre del autor: ");
        autor = leer.next();
        System.out.println("Ingrese el número de páginas: ");
        numPaginas = leer.nextInt();
    }

    public void mostrarDatos(){
        System.out.println("");
        System.out.println("Datos del libro: ");
        System.out.println("Número de ISBN: " + ISBN);
        System.out.println("Título del libro: " + titulo);
        System.out.println("Nombre del autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
    }
    
    
    
}
