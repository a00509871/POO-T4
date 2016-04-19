/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.equipoalfa.t4;

/**
 *
 * @author osilru
 */
public class Cliente {
    
    //Como usaremos una base de datos 
    //Atributos
//    private Long id_cliente;
//    private String Nombre;
//    private String email;    
//    private String MonederoElectronico;
//    private Long idTarjeta;

    //Método que hace la conexión con el GUI. Debe devolver si se pudo agregar o no el cliente.
    public static boolean agregarCliente(String nombreDeCliente, String email, String telefono, String IDTarjeta) {
        return agregarATablaCliente(nombreDeCliente, email, telefono, IDTarjeta);
    }
    
    // Método que conecta con la base de datos o con un archivo (se dejó en un método a parte para poder
    // facilitar el hacer cambios a este método en específico). Deberá devolver TRUE si lo pudo agregar, FALSE en caso contrario)
    private static boolean agregarATablaCliente(String nombreDeCliente, String email, String telefono, String IDTarjeta){
        throw new UnsupportedOperationException("Falta la conexión con la base de Datos");
    }
    
    // Método que regresa el nombre del cliente que posee cierto No. de Tarjeta.
    // Regresa Null si no encontró a un cliente con esa tarjeta
    protected static String obtenerNombreClienteConMonedero(String IDTarjeta){
        throw new UnsupportedOperationException("Falta el método que saque el Nombre del Cliente de la Base de Datos");
    }
    
}
