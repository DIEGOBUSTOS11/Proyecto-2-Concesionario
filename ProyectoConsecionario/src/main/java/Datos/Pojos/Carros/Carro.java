/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Pojos.Carros;

import java.io.Serializable;

/**
 *
 * @author alejandro y diego
 */
public class Carro implements Serializable {
    
    /**
     * Atributos o variables 
     * para la clase Carro
     */
    private int codigoVehiculo;
    private String referencia;
    private String modelo;
    private String marca;
    private String matricula;
    private int precio;
    private boolean estado;
    private String color;
    private int cantidad;
    private int cantidadMinima;

    /**
     * Constructor cargado con todos
     * los atributos o variables de un carro
     * @param codigoVehiculo codigo del 
     * vehicuelo para identificarlos
     * @param referencia  referencia del carro
     * @param modelo modelo del carro
     * @param marca marca del carro
     * @param matricula matricula del carro
     * @param precio precio del carro 
     * @param estado estado del carro
     * @param color clor del carro
     * @param cantidad cantidad de carros 
     * @param cantidadMinima  cantida minima de carros
     */
    public Carro(int codigoVehiculo, String referencia, String modelo, String marca, String matricula, int precio, boolean estado, String color, int cantidad, int cantidadMinima) {
        this.codigoVehiculo = codigoVehiculo;
        this.referencia = referencia;
        this.modelo = modelo;
        this.marca = marca;
        this.matricula = matricula;
        this.precio = precio;
        this.estado = estado;
        this.color = color;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
    }

    /**
     * Constructor inicial 
     * de la clase Carro
     */
    public Carro() {
    }
    
    /**
      * Metedo getReferencia
      * para obeter de la variable referencia
      * @return
      */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Metodo setReferencia 
     * para modificar o cambiar el 
     * valor de la variable referencia
     * @param referencia 
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

      /**
      * Metedo getCantidad
      * para obeter de la variable cantidad
      * @return
      */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Metodo setCantidad 
     * para modificar o cambiar el 
     * valor de la variable cantidad
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

     /**
      * Metedo getCantidadMinima
      * para obeter de la variable cantidad Minima
      * @return
      */
    public int getCantidadMinima() {
        return cantidadMinima;
    }

    /**
     * Metodo setCantidadMinima
     * para modificar o cambiar el 
     * valor de la variable cantidad Minima
     * @param cantidadMinima
     */
    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }
    
    /**
      * Metedo getCodigoVehiculo
      * para obeter de la variable codigo Vehiculo
      * @return
      */
    public int getCodigoVehiculo() {
        return codigoVehiculo;
    }
    /**
     * Metodo setCodigoVehiculo
     * para modificar o cambiar el 
     * valor de la variable codigo vehiculo
     * @param codigoVehiculo
     */
    public void setCodigoVehiculo(int codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    /**
      * Metedo getModelo
      * para obeter de la variable modelo
      * @return
      */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo setModelo
     * para modificar o cambiar el 
     * valor de la variable modelo
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
      * Metedo getMarca
      * para obeter de la variable marca
      * @return
      */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo setMarca
     * para modificar o cambiar el 
     * valor de la variable Marca
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
      * Metedo getMatricula
      * para obeter de la variable matricula
      * @return
      */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Metodo setMatricula
     * para modificar o cambiar el 
     * valor de la variable Matricula
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
      * Metedo getPrecio
      * para obeter de la variable Precio
      * @return
      */
    public int getPrecio() {
        return precio;
    }

    /**
     * Metodo setPrecio
     * para modificar o cambiar el 
     * valor de la variable Precio
     * @param precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
     
    /**
      * Metedo getEstado
      * para obeter de la variable Estado
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
      * Metedo getColor
      * para obeter de la variable Color
      * @return
      */
    public String getColor() {
        return color;
    }

    /**
     * Metodo setColor
     * para modificar o cambiar el 
     * valor de la variable color
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
