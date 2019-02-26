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
import Datos.Pojos.Carros.Personas.Cliente;
import Datos.Pojos.Carros.Personas.Empleado;
import Datos.Pojos.Ventas.Venta;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author alejandro
 */
public class ListasDatos implements Serializable{
    
     private ArrayList<CarroDeportivo> carrosDeportivos =new ArrayList<>();
     
     private ArrayList<CarroMaquinaria> carrosMaquinaria =new ArrayList<>();
     
     private ArrayList<CarroPersonalizado> carrosPersonalizados =new ArrayList<>();
     
     private ArrayList<CarroEstandar> carrosEstandar =new ArrayList<>();
     
     private ArrayList<Cliente> clientes =new ArrayList<>();
     
     private ArrayList<Empleado> empleados =new ArrayList<>();
    
     private ArrayList<Venta> ventas =new ArrayList<>();

    public ArrayList<CarroDeportivo> getCarrosDeportivos() {
        return carrosDeportivos;
    }

    public void setCarrosDeportivos(ArrayList<CarroDeportivo> carrosDeportivos) {
        this.carrosDeportivos = carrosDeportivos;
    }

    public ArrayList<CarroMaquinaria> getCarrosMaquinaria() {
        return carrosMaquinaria;
    }

    public void setCarrosMaquinaria(ArrayList<CarroMaquinaria> carrosMaquinaria) {
        this.carrosMaquinaria = carrosMaquinaria;
    }

    public ArrayList<CarroPersonalizado> getCarrosPersonalizados() {
        return carrosPersonalizados;
    }

    public void setCarrosPersonalizados(ArrayList<CarroPersonalizado> carrosPersonalizados) {
        this.carrosPersonalizados = carrosPersonalizados;
    }

    public ArrayList<CarroEstandar> getCarrosEstandar() {
        return carrosEstandar;
    }

    public void setCarrosEstandar(ArrayList<CarroEstandar> carrosEstandar) {
        this.carrosEstandar = carrosEstandar;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
     
     
}
