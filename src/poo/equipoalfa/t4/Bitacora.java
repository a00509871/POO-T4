/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.equipoalfa.t4;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que almacenará todas las transferencias o transacciones de la tienda
 * @author osilru
 */

public class Bitacora {

    public static boolean registrarCompra(String IDTarjeta, String ticket, String cantidad) {
        return registrarCompraALista(IDTarjeta, ticket, cantidad);
    }
    
    private static boolean registrarCompraALista(String IDTarjeta, String ticket, String cantidad){                
        if (cargoATarjeta(IDTarjeta, Double.parseDouble(cantidad))){
            throw new UnsupportedOperationException("Falta el método que haga el registro en la base de datos");
        }else{
            return false;
        }        
    }
    
    private static boolean cargoATarjeta(String IDTarjeta, double cargo){
        // Debe sacar el saldo que tenga tal ID
        
        // Debe comparar el saldo que se tiene contra el que se pide.
        // Si se tiene suficiente saldo, se debe modificar la base de datos. En caso de no
        // contar con fondos suficientes, el método debe regresar False
        
 
        throw new UnsupportedOperationException("Falta el método que haga el registro en la base de datos");
    }
    
}
