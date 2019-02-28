/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Pojos.Personas;

/**
 *
 * @author alejandro
 */
public class Cliente extends Persona{

    public Cliente() {
    }
 
    public Cliente(String tipoDocumento, int documento, String nombreCompleto, String direccion, String ciudad, String correo, int telefono, boolean estado, int cuentaBancaria) {
        super(tipoDocumento, documento, nombreCompleto, direccion, ciudad, correo, telefono, estado, cuentaBancaria);
    }
  
}
