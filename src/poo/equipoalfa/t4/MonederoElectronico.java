/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.equipoalfa.t4;

/**
 * Esta clase representará la tarjeta, el monedero electronico. Puede crearse un
 * monedero electrónico con un cliente asociado o sin cliente.
 *
 * @author osilru
 */
public class MonederoElectronico {

    //Atributos
//    private Long IDTarjeta;
//    private Long IDMonedero;
//    private double saldo;

    public static boolean pago(String IDTarjeta, String cantidad) {
        double monto = Double.parseDouble(cantidad);
        if (monto > 0) {
            return modificarSaldoDeTablaMonedero(IDTarjeta, obtenerSaldoDeTablaMonedero(IDTarjeta) + monto);
        } else {
            return false;
        }                        
    }
    
    
    protected static boolean cargoATarjeta(String IDTarjeta, double cargo) {
        // Debe sacar el saldo que tenga tal ID        
        double monto = obtenerSaldoDeTablaMonedero(IDTarjeta);        
        // Debe comparar el saldo que se tiene contra el que se pide.
        // Si se tiene suficiente saldo, se debe modificar la base de datos. En caso de no
        // contar con fondos suficientes, el método debe regresar False        
        if (cargo <= monto) {
            monto = monto - cargo;
            return modificarSaldoDeTablaMonedero(IDTarjeta, monto);
        } else {
            return false;
        }
    }
    
    // Obtiene el Saldo que hay en el monedero. En caso de no existir en la base de datos, regresa un número negativo
    private static double obtenerSaldoDeTablaMonedero(String IDTarjeta){        
        throw new UnsupportedOperationException("Falta el método que saque el saldo de la Base de Datos");
    }
    
    // Modifica el saldo el saldo del Monedero en las tablas
    private static boolean modificarSaldoDeTablaMonedero(String IDTarjeta, double monto) {
        throw new UnsupportedOperationException("Falta el Método  que modifique el saldo"); //To change body of generated methods, choose Tools | Templates.
    }
}
