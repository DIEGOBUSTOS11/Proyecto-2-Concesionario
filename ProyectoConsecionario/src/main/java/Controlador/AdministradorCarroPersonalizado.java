/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Pojos.Carros.CarroPersonalizado;

/**
 *
 * @author ferch
 */
public class AdministradorCarroPersonalizado extends AdministradorPadre{
   
    CarroPersonalizado nuevoCarroPersonalizado;
    int codigoCarroPerzonalizado;
    
    public AdministradorCarroPersonalizado(){
        super();
    }
    
    public AdministradorCarroPersonalizado(CarroPersonalizado carroPersonalizado){
        super();
        nuevoCarroPersonalizado= new CarroPersonalizado();
        nuevoCarroPersonalizado= carroPersonalizado;
    }
    
    public AdministradorCarroPersonalizado(int codigo){
        super();
        codigoCarroPerzonalizado=codigo;
    }
    
    @Override
    public void agregar() {
       
        listaDatos.getCarrosPersonalizados().add(nuevoCarroPersonalizado);
        guardarDatos();
        System.out.println("Carro perzonalizado agregado correctamente");
    }

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
