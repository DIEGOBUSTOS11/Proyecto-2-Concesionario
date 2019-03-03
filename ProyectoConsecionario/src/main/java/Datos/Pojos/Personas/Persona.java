/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Pojos.Personas;

import java.io.Serializable;

/**
 *
 * @author alejandro y diego
 */
public class Persona implements Serializable{
    
    /**
     * Atributos o variables 
     * para la clase Persona
     */
    private String tipoDocumento;
    private int documento;
    private String nombreCompleto;
    private String direccion;
    private String ciudad;
    private String correo;
    private int telefono;
    private boolean estado;
    private int cuentaBancaria;

    /**
     * Constructor inicial 
     * de la clase Persona
     */
    public Persona() {
    }

    /**
     * Constructor cargado con todos
     * los atributos o variables de una persona
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
    public Persona(String tipoDocumento, int documento, String nombreCompleto, String direccion, String ciudad, String correo, int telefono, boolean estado, int cuentaBancaria) {
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
        this.cuentaBancaria = cuentaBancaria;
    }

     /**
      * Metedo getTipoDocumento
      * para obeter de la variable tipoDocumento
      * @return
      */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Metodo setTipoDocumento
     * para modificar o cambiar el 
     * valor de la variable tipoDocumento
     * @param tipoDocumento
     */
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

     /**
      * Metedo getDocumento
      * para obeter de la variable Documento
      * @return
      */
    public int getDocumento() {
        return documento;
    }

    /**
     * Metodo setDocumento
     * para modificar o cambiar el 
     * valor de la variable Documento
     * @param documento
     */
    public void setDocumento(int documento) {
        this.documento = documento;
    }

    /**
      * Metedo getNombreCompleto
      * para obeter de la variable nombreCompleto
      * @return
      */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Metodo setDocumento
     * para modificar o cambiar el 
     * valor de la variable Documento
     * @param nombreCompleto
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
      * Metedo getDireccion
      * para obeter de la variable direccion
      * @return
      */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo setDireccion
     * para modificar o cambiar el 
     * valor de la variable direccion
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
      * Metedo getCiudad
      * para obeter de la variable ciudad
      * @return
      */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Metodo setCiudad
     * para modificar o cambiar el 
     * valor de la variable ciudad
     * @param ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
      * Metedo getCorreo
      * para obeter de la variable correo
      * @return
      */
    public String getCorreo() {
        return correo;
    }

    /**
     * Metodo setCorreo
     * para modificar o cambiar el 
     * valor de la variable correo
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
      * Metedo getTelefono
      * para obeter de la variable Telefono
      * @return
      */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Metodo setTelefono
     * para modificar o cambiar el 
     * valor de la variable telefono
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
      * Metedo getEstado
      * para obeter de la variable estado
      * @return
      */
    public boolean getEstado() {
        return estado;
    }

    /**
     * Metodo setEstado
     * para modificar o cambiar el 
     * valor de la variable estado
     * @param estado
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
      * Metedo getCuentaBancaria
      * para obeter de la variable cuentaBancaria
      * @return
      */
    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    /**
     * Metodo setCuentaBancaria
     * para modificar o cambiar el 
     * valor de la variable cuentaBancaria
     * @param cuentaBancaria
     */
    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    
    
}
