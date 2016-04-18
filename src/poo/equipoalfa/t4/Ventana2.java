/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.equipoalfa.t4;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
/**
 *
 * @author jesus_ignacio_159, osilru
 */
public class Ventana2 extends JFrame implements ActionListener {
    
    
    //Declaramos las propiedades
    private JButton btnAceptar, btnCancelar;    
    private JFormattedTextField txtIDTarjeta, txtTicket,txtCantidad;

    //Constructor
    public Ventana2() {
        super("Registro de Compras");
        setSize(400, 200);  //Establecemos las dimensiones del formulario (ancho x alto)
        setLocation(440, 100); //Establecemos la ubicación en pantalla (x,y)
        setResizable(false); //Para que no se pueda modificar el tamaño de la ventana

        //Paso 2. Vamos a crear una etiqueta
        JLabel lblIDTarjeta = new JLabel("No. Tarjeta:");
        JLabel lblTicket = new JLabel("No. Ticket: ");
        JLabel lblCantidad = new JLabel("Cantidad:");
        
        //Paso 3. Vamos a crear un campo de texto
        //JFormattedTextField que limita el que solo se pueda escribir hast aun número de 20 dígito
        txtIDTarjeta = new JFormattedTextField(createFormatter("####################"));
        txtTicket = new JFormattedTextField(createFormatter("####################"));
        //JFormatedTextField que solo permite numeros y coma
        txtCantidad = new JFormattedTextField(createAuxFormatter("********************"));
        
        //Paso 4. Vamos a crear un botón.
        btnAceptar = new JButton("Aceptar");
        btnCancelar = new JButton("Cancelar");

        //Paso 5. Vamos a crear el contenedor.
        JPanel pnlContenido = new JPanel(null); //Gestor nulo, util al usar setBounds

        //Paso 6. Ubicamos los elementos en el contenedor
        lblIDTarjeta.setBounds(10, 30, 80, 15); //x,y, ancho y alto
        txtIDTarjeta.setBounds(80, 25, 290, 25);
        lblTicket.setBounds(10, 60, 80, 10);
        txtTicket.setBounds(80, 55, 290, 25);
        lblCantidad.setBounds(10, 90, 60, 10);
        txtCantidad.setBounds(80, 85, 290, 25);
        btnAceptar.setBounds(100, 120, 90, 25);
        btnCancelar.setBounds(200, 120, 90, 25);

        //Paso 7. Agreguemos los componentes al contenedor
        pnlContenido.add(lblIDTarjeta);
        pnlContenido.add(txtIDTarjeta);
        pnlContenido.add(lblTicket);
        pnlContenido.add(txtTicket);
        pnlContenido.add(lblCantidad);
        pnlContenido.add(txtCantidad);
        pnlContenido.add(btnAceptar);
        pnlContenido.add(btnCancelar);

        //Paso 8. Asociamos el contenedor a la ventana
        setContentPane(pnlContenido);

        //Paso 9. Escucha de eventos.
        btnAceptar.addActionListener(this);
        btnCancelar.addActionListener(this);

        //Paso 10. Hacemos visible la ventana
        setVisible(true);
    }

    private void salir() {
        dispose();
    }
    
    // Código para verificar que se agrege un MaskFormatter correcto que solo permita números, . y ,
    private MaskFormatter createAuxFormatter(String s) {
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter(s);
            formatter.setValidCharacters("0123456789.,");
        } catch (java.text.ParseException exc) {
            System.err.println("formatter is bad: " + exc.getMessage());
            System.exit(-1);
        }
        return formatter;
    }
    
        // Código para verificar que se agrege un MaskFormatter correcto
    private MaskFormatter createFormatter(String s) {
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter(s);
        } catch (java.text.ParseException exc) {
            System.err.println("formatter is bad: " + exc.getMessage());
            System.exit(-1);
        }
        return formatter;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {
            String IDTarjeta = txtIDTarjeta.getText();
            String ticket = txtTicket.getText();
            String cantidad = txtCantidad.getText();            

        // Similar a Ventana 1, en el if debería ir el argumento que checa lo que 
//            if (Bitacora.registrarCompra(IDTarjeta, ticket, cantidad){
//                JOptionPane.showMessageDialog(null, "Se ha registrado con éxito", "", -1);
//                salir();
//            } else{
//                JOptionPane.showMessageDialog(null, "No se ha podido registrar", "Advertencia", 0);                
//            }
        } else {
            salir();
        }
    }
}
    