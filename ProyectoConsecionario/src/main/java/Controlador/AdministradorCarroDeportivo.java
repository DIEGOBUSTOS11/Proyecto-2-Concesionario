/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Pojos.Carros.CarroDeportivo;

/**
 *
 * @author diego y alejandro
 */
public class AdministradorCarroDeportivo extends AdministradorPadre{
    /**
     * Objeto de la clase carro deportivo
     * Variable global codigoCarroDeportivo
     */
    CarroDeportivo nuevoCarroDeportivo;
    int codigoCarroDeportivo;
    
    /**
     * Constructor inicial 
     * de la clase AdministradorCarroDeportivo
     */
    public AdministradorCarroDeportivo(){
        super();
    }
    
    /**
     * Constructor con carga del objeto CarroDeportivo
     * @param carroDeportivo nombre del objeto de la clase CarroDeportivo
     */
    public AdministradorCarroDeportivo (CarroDeportivo carroDeportivo){
        super();
        nuevoCarroDeportivo= new CarroDeportivo();
        nuevoCarroDeportivo=carroDeportivo; 
    }
  
    /**
     * Constructor con carga de la variabale codigo vehiculo
     * @param codigo numero del codigo de vehiculo
     */
     public AdministradorCarroDeportivo(int codigo ) {
        super();
        codigoCarroDeportivo = codigo;
    }
    
     /**
      * Metodo encargado de agregar
      * carro deportivo marcado con @Override
      * que esta sobreescribiendo al metodo de la clase
      * padre AdministradorPadre
      */
    @Override
    public void agregar() {
       
        listaDatos.getCarrosDeportivos().add(nuevoCarroDeportivo);
        guardarDatos();
        System.out.println("Carro deportivo agregado correctamente");
    }
    
    /**
     * Metodo encargado de modificar
     * carro deportivo marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
    @Override
    public void modificar() {

        boolean existe=false;
       
        for (CarroDeportivo  carroDeportivo : listaDatos.getCarrosDeportivos()) {

            if (carroDeportivo.getCodigoVehiculo()== nuevoCarroDeportivo.getCodigoVehiculo()) {
                existe=true;
                carroDeportivo.setCantidad(nuevoCarroDeportivo.getCantidad());
                carroDeportivo.setCantidadMinima(nuevoCarroDeportivo.getCantidadMinima());
                carroDeportivo.setCodigoVehiculo(nuevoCarroDeportivo.getCodigoVehiculo());
                carroDeportivo.setColor(nuevoCarroDeportivo.getColor());
                carroDeportivo.setEstado(nuevoCarroDeportivo.getEstado());
                carroDeportivo.setMarca(nuevoCarroDeportivo.getMarca());
                carroDeportivo.setMatricula(nuevoCarroDeportivo.getMatricula());
                carroDeportivo.setModelo(nuevoCarroDeportivo.getModelo());
                carroDeportivo.setPrecio(nuevoCarroDeportivo.getPrecio());
                carroDeportivo.setReferencia(nuevoCarroDeportivo.getReferencia());
            }
        }
         if(!existe){
            System.out.println("Carro deportivo no encontrado");
        }else{
            System.out.println("Carro deportivo modificado");
            guardarDatos();
        }
    }
    
    /**
     * Metodo encargado de eliminar
     * carro deportivo marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
    @Override
    public void eliminar() {
        int indice = 0;

        boolean existe=false;
        for (CarroDeportivo carroDeportivo : listaDatos.getCarrosDeportivos()) {

            if (carroDeportivo.getCodigoVehiculo()== codigoCarroDeportivo) {

                existe=true;
                listaDatos.getCarrosDeportivos().remove(indice);
                break;
            }
            indice++;
        }
        if(!existe){
            System.out.println("Carro deportivo no encontrado");
        }else{
            System.out.println("Carro deportivo eliminado");
            guardarDatos();
        }
        
    }
    
    /**
     * Metodo encargado de ver
     * carro deportivo marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
    @Override
    public void ver() {
        
        boolean existe=false;
        for (CarroDeportivo carroDeportivo : listaDatos.getCarrosDeportivos()) {

            if (carroDeportivo.getCodigoVehiculo()== codigoCarroDeportivo) {

                System.out.println("Cantidad: " + carroDeportivo.getCantidad());
                System.out.println("Cantidad Minima: " + carroDeportivo.getCantidadMinima());
                System.out.println("Codigo Vehiculo: " + carroDeportivo.getCodigoVehiculo());
                System.out.println("Color: " + carroDeportivo.getColor());
                System.out.println("Estado: " + carroDeportivo.getEstado());
                System.out.println("Marca: " + carroDeportivo.getMarca());
                System.out.println("Matricula: " + carroDeportivo.getMatricula());
                System.out.println("Modelo: " + carroDeportivo.getModelo());
                System.out.println("Precio: " + carroDeportivo.getPrecio());
                System.out.println("Referencia: " + carroDeportivo.getReferencia());
     
                existe=true;
                break;
            }
        }
        if(!existe){
            System.out.println("Carro deportivo no encontrado");
        }

    }
    
    /**
     * Metodo encargado de listar
     * carro deportivo marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
    @Override
    public void listar() {
        int indice = 1;
        cargarDatos();
        for (CarroDeportivo carroDeportivo : listaDatos.getCarrosDeportivos()) {

            System.out.println("Cantidad: " + carroDeportivo.getCantidad());
            System.out.println("Cantidad Minima: " + carroDeportivo.getCantidadMinima());
            System.out.println("Codigo Vehiculo: " + carroDeportivo.getCodigoVehiculo());
            System.out.println("Color: " + carroDeportivo.getColor());
            System.out.println("Estado: " + carroDeportivo.getEstado());
            System.out.println("Marca: " + carroDeportivo.getMarca());
            System.out.println("Matricula: " + carroDeportivo.getMatricula());
            System.out.println("Modelo: " + carroDeportivo.getModelo());
            System.out.println("Precio: " + carroDeportivo.getPrecio());
            System.out.println("Referencia: " + carroDeportivo.getReferencia());
            
            indice++;
        }
        if(indice==1){
            System.out.println("No existen carros deportivos registrados");
        }
    }
    
    /**
     * Metodo encargado obtener la 
     * lista de carros deportivos
     * @return retorna el objeto 
     * de la clase CarroDeportivo
     */
     public CarroDeportivo obtener() {
        
        boolean existe=false;
        for (CarroDeportivo carroDeportivo : listaDatos.getCarrosDeportivos()) {

            if (carroDeportivo.getCodigoVehiculo()== codigoCarroDeportivo) {

                return carroDeportivo;   
            }
        }
        if(!existe){
            System.out.println("Carro deportivo no encontrado");
        }
        return null;
    }
            
}
