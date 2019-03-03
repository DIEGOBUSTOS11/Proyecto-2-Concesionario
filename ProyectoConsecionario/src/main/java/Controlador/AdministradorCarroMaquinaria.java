/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Pojos.Carros.CarroMaquinaria;

/**
 *
 * @author diego y alejandro
 */
public class AdministradorCarroMaquinaria extends AdministradorPadre{
   
     /**
     * Objeto de la clase carro estandar
     * Variable global codigoCarroMaquinaria
     */
    CarroMaquinaria nuevoCarroMaquinaria;
    int codigoCarroMaquinaria;
    
    /**
     * Constructor inicial 
     * de la clase AdministradorCarroMaquinaria
     */
    public AdministradorCarroMaquinaria(){
        super();
    }
    
    /**
     * Constructor con carga del objeto CarroMaquinaria
     * @param carroMaquinaria nombre del objeto de la clase CarroMaquinaria
     */
    public AdministradorCarroMaquinaria(CarroMaquinaria carroMaquinaria){
        super();
        nuevoCarroMaquinaria= new CarroMaquinaria();
        nuevoCarroMaquinaria=carroMaquinaria;
    }
    
    /**
     * Constructor con carga de la variabale codigo vehiculo
     * @param codigo numero del codigo de vehiculo
     */
    public AdministradorCarroMaquinaria(int codigo){
        super();
        codigoCarroMaquinaria=codigo;
    }
    
     /**
      * Metodo encargado de agregar
      * carro maquinaria marcado con @Override
      * que esta sobreescribiendo al metodo de la clase
      * padre AdministradorPadre
      */
    @Override
    public void agregar() {
       
        listaDatos.getCarrosMaquinaria().add(nuevoCarroMaquinaria);
        guardarDatos();
        System.out.println("Carro maquinaria agregado correctamente");
    }

    /**
     * Metodo encargado de modificar
     * carro maquinaria marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
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

    /**
     * Metodo encargado de eliminar
     * carro maquinaria marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
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
    
    /**
     * Metodo encargado de ver
     * carro maquinaria marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
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
    
    /**
     * Metodo encargado de listar
     * carro maquinaria marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
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
    
    /**
     * Metodo encargado obtener la 
     * lista de carros Maquinaria
     * @return retorna el objeto 
     * de la clase CarroMaquinaria
     */
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
