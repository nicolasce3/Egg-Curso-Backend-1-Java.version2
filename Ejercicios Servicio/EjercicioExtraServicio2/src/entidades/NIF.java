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
public class NIF {

    private int DNI;
    private String letra;

    private static final String[] LETRAS_NIF = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
//  LETRAS_NIF sería un atributo de la clase NIF que asigna en un vector o arreglo cada letra en cada posición.
//  El orden dentro de las llaves determina el orden dentro del vector (de izquierda a derecha, de 0 a 23,) 
//  Podría ser declarado como un atributo de instancia o como un atributo de clase 
//  (usando la palabra clave static). Si se declara como un atributo de instancia,
//  cada objeto de la clase NIF tendría su propia copia de la variable LETRAS_NIF. Si se declara como 
//  un atributo de clase, todas las instancias de la clase NIF compartirían la misma copia de la 
//  variable LETRAS_NIF. En este caso, como LETRAS_NIF es un valor fijo para todas las
//  nstancias de la clase NIF, sería apropiado declararlo como un atributo de clase y 
//  marcarlo como "private static final".

//    Si LETRAS_NIF se declara como un atributo de instancia, cada objeto de la clase NIF tendría su propia 
//    copia de la variable. Esto significa que cada vez que se crea un nuevo objeto NIF, se crearía una 
//    nueva copia de LETRAS_NIF, lo cual no tendría sentido ya que el valor de LETRAS_NIF es el
//    mismo para todas las instancias de la clase NIF.
// Por ejemplo, supongamos que se crean dos objetos NIF llamados nif1 y nif2. Si LETRAS_NIF es un 
// atributo de instancia, cada objeto tendría su propia copia de LETRAS_NIF, lo cual consumiría más 
// memoria de lo necesario y dificultaría la mantenibilidad del código.
//
// Además, si se quisiera cambiar el valor de LETRAS_NIF para todas las instancias de la clase NIF, 
// habría que cambiar el valor en cada instancia individualmente, lo cual sería tedioso y propenso a 
// errores. Por estas razones, es más apropiado declarar LETRAS_NIF como un atributo de clase.
    public static String getLetrasNIF(int posicion) {
        return LETRAS_NIF[posicion];
    }
//    Como LETRAS_NIF es un campo privado de la clase NIF, no se puede acceder directamente 
//    desde la clase NIFServicio. Es por eso que se crea un método público en la 
//    clase NIF para acceder al campo privado LETRAS_NIF. P

    public NIF() {
    }

    public NIF(int DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

}
