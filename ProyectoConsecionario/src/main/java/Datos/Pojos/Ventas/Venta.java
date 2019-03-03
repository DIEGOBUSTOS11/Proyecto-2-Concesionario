/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Pojos.Ventas;

import java.io.Serializable;

/**
 *
 * @author alejandro
 */
public class Venta implements Serializable{
   
    private int codigoVehiculo;
    private int tipoVehiculo; 
    private int documentoCliente;
    private int documentoEmpleado;
    private String tipoPago;
    private int precio;
    private int cuotas;
    private int saldo;

    public Venta(){
        super();
    }

    public Venta(int codigoVehiculo, int tipoVehiculo, int documentoCliente, int documentoEmpleado, String tipoPago, int precio, int cuotas, int saldo) {
        this.codigoVehiculo = codigoVehiculo;
        this.tipoVehiculo = tipoVehiculo;
        this.documentoCliente = documentoCliente;
        this.documentoEmpleado = documentoEmpleado;
        this.tipoPago = tipoPago;
        this.precio = precio;
        this.cuotas = cuotas;
        this.saldo = saldo;
    }

    public int getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(int tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public void setCodigoVehiculo(int codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    public int getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(int documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public int getDocumentoEmpleado() {
        return documentoEmpleado;
    }

    public void setDocumentoEmpleado(int documentoEmpleado) {
        this.documentoEmpleado = documentoEmpleado;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
}
