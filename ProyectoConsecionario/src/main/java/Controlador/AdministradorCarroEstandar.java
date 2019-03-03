/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Pojos.Carros.CarroEstandar;

/**
 *
 * @author diego y alejandro
 */
public class AdministradorCarroEstandar extends AdministradorPadre{
    
    /**
     * Objeto de la clase carro estandar
     * Variable global codigoCarroEstandar
     */
    CarroEstandar nuevoCarroEstandar;
    int codigoCarroEstandar;
    
    /**
     * Constructor inicial 
     * de la clase AdministradorCarroEstandar
     */
    public AdministradorCarroEstandar(){
        super();
    }
    
    /**
     * Constructor con carga del objeto CarroEstandar
     * @param carroEstandar nombre del objeto de la clase CarroEstandar
     */
    public AdministradorCarroEstandar(CarroEstandar carroEstandar){
        super();
        nuevoCarroEstandar= new CarroEstandar();
        nuevoCarroEstandar=carroEstandar;
    }
    
    /**
     * Constructor con carga de la variabale codigo vehiculo
     * @param codigo numero del codigo de vehiculo
     */
    public AdministradorCarroEstandar(int codigo){
        super();
        codigoCarroEstandar=codigo;   
    }
    
    /**
      * Metodo encargado de agregar
      * carro estandar marcado con @Override
      * que esta sobreescribiendo al metodo de la clase
      * padre AdministradorPadre
      */
    @Override
    public void agregar() {
       
        listaDatos.getCarrosEstandar().add(nuevoCarroEstandar);
        guardarDatos();
        System.out.println("Carro estandar agregado correctamente");
    }

     /**
     * Metodo encargado de modificar
     * carro estandar marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
    @Override
    public void modificar() {

        boolean existe=false;
       
        for (CarroEstandar  carroEstandar : listaDatos.getCarrosEstandar()) {

            if (carroEstandar.getCodigoVehiculo()== nuevoCarroEstandar.getCodigoVehiculo()) {
                existe=true;
                carroEstandar.setCantidad(nuevoCarroEstandar.getCantidad());
                carroEstandar.setCantidadMinima(nuevoCarroEstandar.getCantidadMinima());
                carroEstandar.setCodigoVehiculo(nuevoCarroEstandar.getCodigoVehiculo());
                carroEstandar.setColor(nuevoCarroEstandar.getColor());
                carroEstandar.setEstado(nuevoCarroEstandar.getEstado());
                carroEstandar.setMarca(nuevoCarroEstandar.getMarca());
                carroEstandar.setMatricula(nuevoCarroEstandar.getMatricula());
                carroEstandar.setModelo(nuevoCarroEstandar.getModelo());
                carroEstandar.setPrecio(nuevoCarroEstandar.getPrecio());
                carroEstandar.setReferencia(nuevoCarroEstandar.getReferencia());
            }
        }
         if(!existe){
            System.out.println("Carro estandar no encontrado");
        }else{
            System.out.println("Carro estandar modificado");
            guardarDatos();
        }
    }
    
     /**
     * Metodo encargado de eliminar
     * carro estandar marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
    @Override
    public void eliminar() {
        int indice = 0;

        boolean existe=false;
        for (CarroEstandar carroEstandar : listaDatos.getCarrosEstandar()) {

            if (carroEstandar.getCodigoVehiculo()== codigoCarroEstandar) {

                existe=true;
                listaDatos.getCarrosEstandar().remove(indice);
                break;
            }
            indice++;
        }
        if(!existe){
            System.out.println("Carro estandar no encontrado");
        }else{
            System.out.println("Carro estandar eliminado");
            guardarDatos();
        }
        
    }
    
    /**
     * Metodo encargado de ver
     * carro estandar marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
    @Override
    public void ver() {
        
        boolean existe=false;
        for (CarroEstandar carroEstandar : listaDatos.getCarrosEstandar()) {

            if (carroEstandar.getCodigoVehiculo()== codigoCarroEstandar) {

                System.out.println("Cantidad: " + carroEstandar.getCantidad());
                System.out.println("Cantidad Minima: " + carroEstandar.getCantidadMinima());
                System.out.println("Codigo Vehiculo: " + carroEstandar.getCodigoVehiculo());
                System.out.println("Color: " + carroEstandar.getColor());
                System.out.println("Estado: " + carroEstandar.getEstado());
                System.out.println("Marca: " + carroEstandar.getMarca());
                System.out.println("Matricula: " + carroEstandar.getMatricula());
                System.out.println("Modelo: " + carroEstandar.getModelo());
                System.out.println("Precio: " + carroEstandar.getPrecio());
                System.out.println("Referencia: " + carroEstandar.getReferencia());
     
                existe=true;
                break;
            }
        }
        if(!existe){
            System.out.println("Carro estandar no encontrado");
        }

    }
    
    /**
     * Metodo encargado de listar
     * carro estandar marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
    @Override
    public void listar() {
        int indice = 1;
        cargarDatos();
        for (CarroEstandar carroEstandar : listaDatos.getCarrosEstandar()) {

            System.out.println("Cantidad: " + carroEstandar.getCantidad());
            System.out.println("Cantidad Minima: " + carroEstandar.getCantidadMinima());
            System.out.println("Codigo Vehiculo: " + carroEstandar.getCodigoVehiculo());
            System.out.println("Color: " + carroEstandar.getColor());
            System.out.println("Estado: " + carroEstandar.getEstado());
            System.out.println("Marca: " + carroEstandar.getMarca());
            System.out.println("Matricula: " + carroEstandar.getMatricula());
            System.out.println("Modelo: " + carroEstandar.getModelo());
            System.out.println("Precio: " + carroEstandar.getPrecio());
            System.out.println("Referencia: " + carroEstandar.getReferencia());
            
            indice++;
        }
        if(indice==1){
            System.out.println("No existen carros estandar registrados");
        }
    }
    
    /**
     * Metodo encargado obtener la 
     * lista de carros estandar
     * @return retorna el objeto 
     * de la clase CarroEstandar
     */
     public CarroEstandar obtener() {
        
        boolean existe=false;
        for (CarroEstandar carroEstandar : listaDatos.getCarrosEstandar()) {

            if (carroEstandar.getCodigoVehiculo()== codigoCarroEstandar) {

                return carroEstandar;   
            }
        }
        if(!existe){
            System.out.println("Carro estandar no encontrado");
        }
        return null;
    }
            
}
