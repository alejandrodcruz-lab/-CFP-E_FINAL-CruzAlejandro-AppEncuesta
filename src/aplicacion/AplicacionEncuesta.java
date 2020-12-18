/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import vistas.formularioCliente;

/**
 *
 * @author EntornoVM
 */
public class AplicacionEncuesta {
    
    public static void main(String[] args) {
        
        formularioCliente ventanaEncuesta = new formularioCliente();
        ventanaEncuesta.setResizable(false);
        ventanaEncuesta.setVisible(true);
        ventanaEncuesta.setLocationRelativeTo(null);
        
    }
    
}
