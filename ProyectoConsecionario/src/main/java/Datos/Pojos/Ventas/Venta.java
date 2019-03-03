/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Pojos.Ventas;

import java.io.Serializable;

/**
 *
 * @author alejandro y diego
 */
public class Venta implements Serializable{
   
    /**
     * Atributos o variables 
     * para la clase Venta
     */
    private int codigoVehiculo;
    private int tipoVehiculo; 
    private int documentoCliente;
    private int documentoEmpleado;
    private String tipoPago;
    private int precio;
    private int cuotas;
    private int saldo;

    /**
     * Constructor inicial 
     * de la clase Venta
     */
    public Venta(){
        super();
    }

    /**
     * Constructor cargado con todos
     * los atributos o variables de una venta
     * @param codigoVehiculo
     * @param tipoVehiculo
     * @param documentoCliente
     * @param documentoEmpleado
     * @param tipoPago
     * @param precio
     * @param cuotas
     * @param saldo 
     */
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

    /**
      * Metedo getTipoVehiculo
      * para obeter de la variable tipoVehiculo
      * @return
      */
    public int getTipoVehiculo() {
        return tipoVehiculo;
    }

    /**
     * Metodo setTipoVehiculo
     * para modificar o cambiar el 
     * valor de la variable tipoVehiculo
     * @param tipoVehiculo
     */
    public void setTipoVehiculo(int tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    /**
      * Metedo getCodigoVehiculo
      * para obeter de la variable CodigoVehiculo
      * @return
      */
    public int getCodigoVehiculo() {
        return codigoVehiculo;
    }

    /**
     * Metodo setCodigoVehiculo
     * para modificar o cambiar el 
     * valor de la variable codigoVehiculo
     * @param codigoVehiculo
     */
    public void setCodigoVehiculo(int codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    /**
      * Metedo getDocumentoCliente
      * para obeter de la variable documentoCliente
      * @return
      */
    public int getDocumentoCliente() {
        return documentoCliente;
    }

    /**
     * Metodo setDocumentoCliente
     * para modificar o cambiar el 
     * valor de la variable documentoCliente
     * @param documentoCliente
     */
    public void setDocumentoCliente(int documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    /**
      * Metedo getDocumentoEmpleado
      * para obeter de la variable documentoEmpleado
      * @return
      */
    public int getDocumentoEmpleado() {
        return documentoEmpleado;
    }

    /**
     * Metodo setDocumentoEmpleado
     * para modificar o cambiar el 
     * valor de la variable documentoEmpleado
     * @param documentoEmpleado
     */
    public void setDocumentoEmpleado(int documentoEmpleado) {
        this.documentoEmpleado = documentoEmpleado;
    }

    /**
      * Metedo getTipoVehiculo
      * para obeter de la variable tipoPago
      * @return
      */
    public String getTipoPago() {
        return tipoPago;
    }

    /**
     * Metodo setTipoPago
     * para modificar o cambiar el 
     * valor de la variable tipoPago
     * @param tipoPago
     */
    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    /**
      * Metedo getPrecio
      * para obeter de la variable precio
      * @return
      */
    public int getPrecio() {
        return precio;
    }

     /**
     * Metodo setPrecio
     * para modificar o cambiar el 
     * valor de la variable precio
     * @param precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
      * Metedo getCuotas
      * para obeter de la variable cuotas
      * @return
      */
    public int getCuotas() {
        return cuotas;
    }

    /**
     * Metodo setCuotas
     * para modificar o cambiar el 
     * valor de la variable cuotas
     * @param cuotas
     */
    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    /**
      * Metedo getSaldo
      * para obeter de la variable saldo
      * @return
      */
    public int getSaldo() {
        return saldo;
    }

    /**
     * Metodo setSaldo
     * para modificar o cambiar el 
     * valor de la variable saldo
     * @param saldo
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
}
