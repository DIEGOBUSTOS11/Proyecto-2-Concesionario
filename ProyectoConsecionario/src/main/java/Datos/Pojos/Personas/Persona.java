/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Pojos.Personas;

import java.io.Serializable;

/**
 *
 * @author alejandro
 */
public class Persona implements Serializable{
    
    private String tipoDocumento;
    private int documento;
    private String nombreCompleto;
    private String direccion;
    private String ciudad;
    private String correo;
    private int telefono;
    private boolean estado;
    private int cuentaBancaria;

    public Persona() {
    }

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

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    
    
}
