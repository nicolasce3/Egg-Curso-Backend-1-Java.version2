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
public class Cadena {
    private String frase;
    private int longitudFrase;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitudFrase = frase.length();
//  En la clase Cadena, la longitud de la cadena se calcula a partir del atributo frase. 
//  Por lo tanto, no es necesario pasar la longitud como parámetro en el constructor,
//  ya que se puede calcular automáticamente a partir de la frase.
//
//  Si se permitiera que la longitud se pasara como parámetro en el constructor, existiría la
//  posibilidad de que la longitud no coincidiera con la longitud real de la cadena, lo que 
//  podría generar errores en la lógica de la clase. Por lo tanto, es mejor calcular la 
//  longitud de manera automática en el constructor a partir del atributo frase.
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }

    public void setLongitudFrase(int longitudFrase) {
        this.longitudFrase = longitudFrase;
    }
}

