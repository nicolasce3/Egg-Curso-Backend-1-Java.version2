/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class CuentaBancariaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese el número de cuenta: ");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI: ");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese el saldo actual: ");
        double saldoActual = leer.nextInt();

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public void ingresar(CuentaBancaria cuenta) {

        System.out.println("Ingrese la cantidad que desea depositar a su saldo actual: ");
        double cantidad = leer.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad);
        System.out.println("Se ha depositado " + cantidad + " en la cuenta.");

    }

    public void retirar(CuentaBancaria cuenta) {

        System.out.println("Ingrese la cantidad que desea retirar: ");
        double retiro = leer.nextDouble();
        if (cuenta.getSaldoActual() < retiro) {

            cuenta.setSaldoActual(0);
            System.out.println("El montó a retirar era mayor así que se dejó la cuenta en 0.");
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            System.out.println("Se ha retirado " + retiro + " de la cuenta");
        }

    }

    public void extraccionRapida(CuentaBancaria cuenta) {
        double retiro;
        do {
            System.out.println("Ingrese un monto menor o igual al 20% de su saldo");
            retiro = leer.nextDouble();

            if (retiro > cuenta.getSaldoActual() * 0.20) {
                System.out.println("Error. Ingrese un valor menor al 20% de su saldo.");
            }

        } while (retiro > cuenta.getSaldoActual() * 0.20);

    }

    public void consultarSaldo(CuentaBancaria cuenta){
        String opcion;
        System.out.println("¿Desea consultar el saldo?");
        opcion = leer.next();
        if(opcion.equalsIgnoreCase("si")){
            System.out.println("Su saldo es: " + cuenta.getSaldoActual());
        }
        
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
        String opcion;
        System.out.println("¿Desear consultar sus datos?");
        opcion = leer.next();
        if(opcion.equalsIgnoreCase("SI")){
            System.out.println("Sus datos son: ");
            System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
            System.out.println("DNI: " + cuenta.getDniCliente());
            System.out.println("Saldo: " + cuenta.getSaldoActual());
        }
            
        
    }
    
    
    
}
