/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Pojos.Carros;

import java.io.Serializable;

/**
 *
 * @author alejandro
 */
public class Carro implements Serializable {
    
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

    public Carro() {
    }
    
    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }
    
    
    
    public int getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public void setCodigoVehiculo(int codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
