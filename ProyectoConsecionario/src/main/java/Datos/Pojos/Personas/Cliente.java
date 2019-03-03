/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Pojos.Personas;

/**
 *
 * @author alejandro y diego
 */
public class Cliente extends Persona{

    /**
     * Constructor inicial 
     * de la clase Cliente
     */
    public Cliente() {
        super();
    }
 
    /**
     * Constructor con los atributos
     * de la clase de Cliente
     * @param tipoDocumento
     * @param documento
     * @param nombreCompleto
     * @param direccion
     * @param ciudad
     * @param correo
     * @param telefono
     * @param estado
     * @param cuentaBancaria 
     */
    public Cliente(String tipoDocumento, int documento, String nombreCompleto, String direccion, String ciudad, String correo, int telefono, boolean estado, int cuentaBancaria) {
        super(tipoDocumento, documento, nombreCompleto, direccion, ciudad, correo, telefono, estado, cuentaBancaria);
    }
  
}
