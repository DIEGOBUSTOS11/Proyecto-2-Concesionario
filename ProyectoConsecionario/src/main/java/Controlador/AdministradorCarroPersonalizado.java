/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Pojos.Carros.CarroPersonalizado;

/**
 *
 * @author diego y alejandro
 */
public class AdministradorCarroPersonalizado extends AdministradorPadre{
   
     /**
     * Objeto de la clase carro estandar
     * Variable global codigoCarroPersonalizado
     */
    CarroPersonalizado nuevoCarroPersonalizado;
    int codigoCarroPerzonalizado;
    
    /**
     * Constructor inicial 
     * de la clase AdministradorCarroPersonalizado
     */
    public AdministradorCarroPersonalizado(){
        super();
    }
    
    /**
     * Constructor con carga del objeto CarroPersonalizado
     * @param carroPersonalizado nombre del objeto de la clase CarroPersonalizado
     */
    public AdministradorCarroPersonalizado(CarroPersonalizado carroPersonalizado){
        super();
        nuevoCarroPersonalizado= new CarroPersonalizado();
        nuevoCarroPersonalizado= carroPersonalizado;
    }
    
    /**
     * Constructor con carga de la variabale codigo vehiculo
     * @param codigo numero del codigo de vehiculo
     */
    public AdministradorCarroPersonalizado(int codigo){
        super();
        codigoCarroPerzonalizado=codigo;
    }
    
    /**
      * Metodo encargado de agregar
      * carro personalizado marcado con @Override
      * que esta sobreescribiendo al metodo de la clase
      * padre AdministradorPadre
      */
    @Override
    public void agregar() {
       
        listaDatos.getCarrosPersonalizados().add(nuevoCarroPersonalizado);
        guardarDatos();
        System.out.println("Carro perzonalizado agregado correctamente");
    }

    /**
     * Metodo encargado de modificar
     * carro personalizado marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
    @Override
    public void modificar() {

        boolean existe=false;
       
        for (CarroPersonalizado  carroPersonalizado : listaDatos.getCarrosPersonalizados()) {

            if (carroPersonalizado.getCodigoVehiculo()== nuevoCarroPersonalizado.getCodigoVehiculo()) {
                existe=true;
                carroPersonalizado.setCantidad(nuevoCarroPersonalizado.getCantidad());
                carroPersonalizado.setCantidadMinima(nuevoCarroPersonalizado.getCantidadMinima());
                carroPersonalizado.setCodigoVehiculo(nuevoCarroPersonalizado.getCodigoVehiculo());
                carroPersonalizado.setColor(nuevoCarroPersonalizado.getColor());
                carroPersonalizado.setEstado(nuevoCarroPersonalizado.getEstado());
                carroPersonalizado.setMarca(nuevoCarroPersonalizado.getMarca());
                carroPersonalizado.setMatricula(nuevoCarroPersonalizado.getMatricula());
                carroPersonalizado.setModelo(nuevoCarroPersonalizado.getModelo());
                carroPersonalizado.setPrecio(nuevoCarroPersonalizado.getPrecio());
                carroPersonalizado.setReferencia(nuevoCarroPersonalizado.getReferencia());
            }
        }
         if(!existe){
            System.out.println("Carro personalizado no encontrado");
        }else{
            System.out.println("Carro personalizado modificado");
            guardarDatos();
        }
    }

    /**
     * Metodo encargado de eliminar
     * carro personalizado marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
    @Override
    public void eliminar() {
        int indice = 0;

        boolean existe=false;
        for (CarroPersonalizado carroPersonalizado : listaDatos.getCarrosPersonalizados()) {

            if (carroPersonalizado.getCodigoVehiculo()== codigoCarroPerzonalizado) {

                existe=true;
                listaDatos.getCarrosPersonalizados().remove(indice);
                break;
            }
            indice++;
        }
        if(!existe){
            System.out.println("Carro personalizado no encontrado");
        }else{
            System.out.println("Carro personalizado eliminado");
            guardarDatos();
        }
        
    }
    /**
     * Metodo encargado de ver
     * carro personalizado marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
    @Override
    public void ver() {
        
        boolean existe=false;
        for (CarroPersonalizado carroPersonalizado : listaDatos.getCarrosPersonalizados()) {

            if (carroPersonalizado.getCodigoVehiculo()== codigoCarroPerzonalizado) {

                System.out.println("Cantidad: " + carroPersonalizado.getCantidad());
                System.out.println("Cantidad Minima: " + carroPersonalizado.getCantidadMinima());
                System.out.println("Codigo Vehiculo: " + carroPersonalizado.getCodigoVehiculo());
                System.out.println("Color: " + carroPersonalizado.getColor());
                System.out.println("Estado: " + carroPersonalizado.getEstado());
                System.out.println("Marca: " + carroPersonalizado.getMarca());
                System.out.println("Matricula: " + carroPersonalizado.getMatricula());
                System.out.println("Modelo: " + carroPersonalizado.getModelo());
                System.out.println("Precio: " + carroPersonalizado.getPrecio());
                System.out.println("Referencia: " + carroPersonalizado.getReferencia());
     
                existe=true;
                break;
            }
        }
        if(!existe){
            System.out.println("Carro personalizado no encontrado");
        }

    }
    
    /**
     * Metodo encargado de listar
     * carro personalizado marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
    @Override
    public void listar() {
        int indice = 1;
        cargarDatos();
        for (CarroPersonalizado carroPersonalizado : listaDatos.getCarrosPersonalizados()) {
           
            System.out.println("Cantidad: " + carroPersonalizado.getCantidad());
            System.out.println("Cantidad Minima: " + carroPersonalizado.getCantidadMinima());
            System.out.println("Codigo Vehiculo: " + carroPersonalizado.getCodigoVehiculo());
            System.out.println("Color: " + carroPersonalizado.getColor());
            System.out.println("Estado: " + carroPersonalizado.getEstado());
            System.out.println("Marca: " + carroPersonalizado.getMarca());
            System.out.println("Matricula: " + carroPersonalizado.getMatricula());
            System.out.println("Modelo: " + carroPersonalizado.getModelo());
            System.out.println("Precio: " + carroPersonalizado.getPrecio());
            System.out.println("Referencia: " + carroPersonalizado.getReferencia());
           
            
            indice++;
        }
        if(indice==1){
            System.out.println("No existen carros personalizados registrados");
        }
    }
    
    /**
     * Metodo encargado obtener la 
     * lista de carros Personalizado
     * @return retorna el objeto 
     * de la clase CarroPersonalizado
     */
     public CarroPersonalizado obtener() {
        
        boolean existe=false;
        for (CarroPersonalizado carroPersonalizado : listaDatos.getCarrosPersonalizados()) {

            if (carroPersonalizado.getCodigoVehiculo()== codigoCarroPerzonalizado) {

                return carroPersonalizado;   
            }
        }
        if(!existe){
            System.out.println("Carro personalizado no encontrado");
        }
        return null;
    }
            
}
