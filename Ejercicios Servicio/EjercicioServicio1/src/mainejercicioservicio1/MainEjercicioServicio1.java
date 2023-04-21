/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioservicio1;

import entidades.CuentaBancaria;
import servicio.CuentaBancariaService;

/**
 *
 * Realizar una clase llamada CuentaBancaria en el paquete Entidades con los
 * siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
 * saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
 * Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
 * a) Método para crear cuenta pidiéndole los datos al usuario. b) Método
 * ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al
 * saldo actual. c) Método retirar(double): recibe una cantidad de dinero a
 * retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de
 * dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0. d)
 * Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar
 * que el usuario no saque más del 20%. e) Método consultarSaldo: permitirá
 * consultar el saldo disponible en la cuenta. f) Método consultarDatos:
 * permitirá mostrar todos los datos de la cuenta.
 */
public class MainEjercicioServicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CuentaBancariaService servicio = new CuentaBancariaService();
        CuentaBancaria cuenta = servicio.crearCuenta();

        servicio.ingresar(cuenta);
        servicio.retirar(cuenta);
        servicio.extraccionRapida(cuenta);
        servicio.consultarSaldo(cuenta);
        servicio.consultarDatos(cuenta);
    }

}
