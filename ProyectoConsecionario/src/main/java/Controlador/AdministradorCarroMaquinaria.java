/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Pojos.Carros.CarroMaquinaria;

/**
 *
 * @author ferch
 */
public class AdministradorCarroMaquinaria extends AdministradorPadre{
   
    CarroMaquinaria nuevoCarroMaquinaria;
    int codigoCarroMaquinaria;
    
    public AdministradorCarroMaquinaria(){
        super();
    }
    
    public AdministradorCarroMaquinaria(CarroMaquinaria carroMaquinaria){
        super();
        nuevoCarroMaquinaria= new CarroMaquinaria();
        nuevoCarroMaquinaria=carroMaquinaria;
    }
    
    public AdministradorCarroMaquinaria(int codigo){
        super();
        codigoCarroMaquinaria=codigo;
    }
    
    @Override
    public void agregar() {
       
        listaDatos.getCarrosMaquinaria().add(nuevoCarroMaquinaria);
        guardarDatos();
        System.out.println("Carro maquinaria agregado correctamente");
    }

    @Override
    public void modificar() {

        boolean existe=false;
       
        for (CarroMaquinaria  carroMaquinaria : listaDatos.getCarrosMaquinaria()) {

            if (carroMaquinaria.getCodigoVehiculo()== nuevoCarroMaquinaria.getCodigoVehiculo()) {
                existe=true;
                carroMaquinaria.setCantidad(nuevoCarroMaquinaria.getCantidad());
                carroMaquinaria.setCantidadMinima(nuevoCarroMaquinaria.getCantidadMinima());
                carroMaquinaria.setCodigoVehiculo(nuevoCarroMaquinaria.getCodigoVehiculo());
                carroMaquinaria.setColor(nuevoCarroMaquinaria.getColor());
                carroMaquinaria.setEstado(nuevoCarroMaquinaria.getEstado());
                carroMaquinaria.setMarca(nuevoCarroMaquinaria.getMarca());
                carroMaquinaria.setMatricula(nuevoCarroMaquinaria.getMatricula());
                carroMaquinaria.setModelo(nuevoCarroMaquinaria.getModelo());
                carroMaquinaria.setPrecio(nuevoCarroMaquinaria.getPrecio());
                carroMaquinaria.setReferencia(nuevoCarroMaquinaria.getReferencia());
            }
        }
         if(!existe){
            System.out.println("Carro maquinaria no encontrado");
        }else{
            System.out.println("Carro maquinaria modificado");
            guardarDatos();
        }
    }

    @Override
    public void eliminar() {
        int indice = 0;

        boolean existe=false;
        for (CarroMaquinaria carroMaquinaria : listaDatos.getCarrosMaquinaria()) {

            if (carroMaquinaria.getCodigoVehiculo()== codigoCarroMaquinaria) {

                existe=true;
                listaDatos.getCarrosMaquinaria().remove(indice);
                break;
            }
            indice++;
        }
        if(!existe){
            System.out.println("Carro maquinaria no encontrado");
        }else{
            System.out.println("Carro estandar eliminado");
            guardarDatos();
        }
        
    }
    
    @Override
    public void ver() {
        
        boolean existe=false;
        for (CarroMaquinaria carroMaquinaria : listaDatos.getCarrosMaquinaria()) {

            if (carroMaquinaria.getCodigoVehiculo()== codigoCarroMaquinaria) {

                System.out.println("Cantidad: " + carroMaquinaria.getCantidad());
                System.out.println("Cantidad Minima: " + carroMaquinaria.getCantidadMinima());
                System.out.println("Codigo Vehiculo: " + carroMaquinaria.getCodigoVehiculo());
                System.out.println("Color: " + carroMaquinaria.getColor());
                System.out.println("Estado: " + carroMaquinaria.getEstado());
                System.out.println("Marca: " + carroMaquinaria.getMarca());
                System.out.println("Matricula: " + carroMaquinaria.getMatricula());
                System.out.println("Modelo: " + carroMaquinaria.getModelo());
                System.out.println("Precio: " + carroMaquinaria.getPrecio());
                System.out.println("Referencia: " + carroMaquinaria.getReferencia());
     
                existe=true;
                break;
            }
        }
        if(!existe){
            System.out.println("Carro maquinaria no encontrado");
        }

    }
    
    @Override
    public void listar() {
        int indice = 1;
        cargarDatos();
        for (CarroMaquinaria carroMaquinaria : listaDatos.getCarrosMaquinaria()) {

            System.out.println("Cantidad: " + carroMaquinaria.getCantidad());
            System.out.println("Cantidad Minima: " + carroMaquinaria.getCantidadMinima());
            System.out.println("Codigo Vehiculo: " + carroMaquinaria.getCodigoVehiculo());
            System.out.println("Color: " + carroMaquinaria.getColor());
            System.out.println("Estado: " + carroMaquinaria.getEstado());
            System.out.println("Marca: " + carroMaquinaria.getMarca());
            System.out.println("Matricula: " + carroMaquinaria.getMatricula());
            System.out.println("Modelo: " + carroMaquinaria.getModelo());
            System.out.println("Precio: " + carroMaquinaria.getPrecio());
            System.out.println("Referencia: " + carroMaquinaria.getReferencia());
            
            indice++;
        }
        if(indice==1){
            System.out.println("No existen carros maquinarias registrados");
        }
    }
    
     public CarroMaquinaria obtener() {
        
        boolean existe=false;
        for (CarroMaquinaria carroMaquinaria : listaDatos.getCarrosMaquinaria()) {

            if (carroMaquinaria.getCodigoVehiculo()== codigoCarroMaquinaria) {

                return carroMaquinaria;   
            }
        }
        if(!existe){
            System.out.println("Carro maquinaria no encontrado");
        }
        return null;
    }
            
    
}
