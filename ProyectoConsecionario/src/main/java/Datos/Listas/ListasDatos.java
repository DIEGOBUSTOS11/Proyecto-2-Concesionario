/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Listas;

import Datos.Pojos.Carros.CarroDeportivo;
import Datos.Pojos.Carros.CarroEstandar;
import Datos.Pojos.Carros.CarroMaquinaria;
import Datos.Pojos.Carros.CarroPersonalizado;
import Datos.Pojos.Personas.Cliente;
import Datos.Pojos.Personas.Empleado;
import Datos.Pojos.Ventas.Venta;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author alejandro y diego
 */
public class ListasDatos implements Serializable{
    /**
     * Lista de carrosDeportivos
     * Lista de carrosMaquinaria
     * Lista de carrosPersonalizados
     * Lista de carrosEstandar
     * Lista de clientes
     * Lista de empleados
     * Lista de ventas
     */
     private ArrayList<CarroDeportivo> carrosDeportivos =new ArrayList<>();
     
     private ArrayList<CarroMaquinaria> carrosMaquinaria =new ArrayList<>();
     
     private ArrayList<CarroPersonalizado> carrosPersonalizados =new ArrayList<>();
     
     private ArrayList<CarroEstandar> carrosEstandar =new ArrayList<>();
     
     private ArrayList<Cliente> clientes =new ArrayList<>();
     
     private ArrayList<Empleado> empleados =new ArrayList<>();
    
     private ArrayList<Venta> ventas =new ArrayList<>();

     
     /**
      * Metedo getCarrosDeportivos 
      * para obeter o motras la lista 
      * de CarroDeportivo
      * @return  los carros 
      * deportivos de esa lista
      */
    public ArrayList<CarroDeportivo> getCarrosDeportivos() {
        return carrosDeportivos;
    }
    
    /**
     * Metodo setCarrosDeportivos
     * para modificar o cambiar el valor
     * de los atributos de la lista 
     * CarroDeportivo
     * @param carrosDeportivos 
     */
    public void setCarrosDeportivos(ArrayList<CarroDeportivo> carrosDeportivos) {
        this.carrosDeportivos = carrosDeportivos;
    }

    /**
      * Metedo getCarrosMaquinaria 
      * para obeter o motras la lista 
      * de CarroMaquinaria
      * @return  los carros 
      * maquinaria de esa lista
      */
    public ArrayList<CarroMaquinaria> getCarrosMaquinaria() {
        return carrosMaquinaria;
    }

    /**
     * Metodo setCarrosMaquinaria
     * para modificar o cambiar el valor
     * de los atributos de la lista 
     * CarroMaquinaria
     * @param carrosMaquinaria
     */
    public void setCarrosMaquinaria(ArrayList<CarroMaquinaria> carrosMaquinaria) {
        this.carrosMaquinaria = carrosMaquinaria;
    }

    /**
      * Metedo getCarrosPersonalizados
      * para obeter o motras la lista 
      * de CarroPersonalizados
      * @return  los carros 
      * personalizado de esa lista
      */
    public ArrayList<CarroPersonalizado> getCarrosPersonalizados() {
        return carrosPersonalizados;
    }

    /**
     * Metodo setCarrosPersonalizado
     * para modificar o cambiar el valor
     * de los atributos de la lista 
     * CarroPersonalizado
     * @param carrosPersonalizados
     */
    public void setCarrosPersonalizados(ArrayList<CarroPersonalizado> carrosPersonalizados) {
        this.carrosPersonalizados = carrosPersonalizados;
    }
    
    /**
      * Metedo getCarrosEstandar
      * para obeter o motras la lista 
      * de CarroEstandar
      * @return  los carros 
      * estandar de esa lista
      */
    public ArrayList<CarroEstandar> getCarrosEstandar() {
        return carrosEstandar;
    }

    /**
     * Metodo setCarrosEstandar
     * para modificar o cambiar el valor
     * de los atributos de la lista 
     * CarroEstandar
     * @param carrosEstandar
     */
    public void setCarrosEstandar(ArrayList<CarroEstandar> carrosEstandar) {
        this.carrosEstandar = carrosEstandar;
    }

    /**
      * Metedo getClientes
      * para obeter o motras la lista 
      * de Cliente
      * @return  los 
      * clientes de esa lista
      */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    /**
     * Metodo setClientes
     * para modificar o cambiar el valor
     * de los atributos de la lista 
     * Cliente
     * @param clientes
     */
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
      * Metedo getEmpleados
      * para obeter o motras la lista 
      * de Empleado
      * @return  los 
      * empleados de esa lista
      */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Metodo setEmpleados
     * para modificar o cambiar el valor
     * de los atributos de la lista 
     * Empleado
     * @param empleados
     */
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
      * Metedo getVentas
      * para obeter o motras la lista 
      * de Venta
      * @return  los 
      * ventas de esa lista
      */
    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    /**
     * Metodo setVentas
     * para modificar o cambiar el valor
     * de los atributos de la lista 
     * Empleado
     * @param ventas
     */
    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    } 
}
