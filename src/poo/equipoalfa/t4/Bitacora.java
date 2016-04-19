/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.equipoalfa.t4;

/**
 * Clase que almacenará todas las transferencias o transacciones de la tienda
 * @author osilru
 */

public class Bitacora {

    public static boolean registrarCompra(String IDTarjeta, String ticket, String cantidad) {
        if (cantidad.equalsIgnoreCase(",") || cantidad.equalsIgnoreCase(".")) {
            return false;
        } else {
            return registrarCompraALista(IDTarjeta, ticket, cantidad);
        }
    }
    
    private static boolean registrarCompraALista(String IDTarjeta, String ticket, String cantidad){                
        if (MonederoElectronico.cargoATarjeta(IDTarjeta, Double.parseDouble(cantidad))){
            throw new UnsupportedOperationException("Falta el método que haga el registro en la base de datos");
        }else{
            return false;
        }        
    }    
    
}
