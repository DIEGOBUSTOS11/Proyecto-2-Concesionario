/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Pojos.Ventas.Venta;

/**
 *
 * @author ferch
 */
public class AdministradorVentas extends AdministradorPadre{
    
   Venta nuevaVenta;
   
   public AdministradorVentas(){
       super();
   }
   
    public AdministradorVentas(Venta venta){
       super();
       nuevaVenta=new Venta();
       nuevaVenta=venta;
   }
    
    @Override
    public void agregar() {
       
        listaDatos.getVentas().add(nuevaVenta);
        guardarDatos();
        System.out.println("Venta agregado correctamente");
    }
    
   @Override
    public void modificar() {

     
       
    }

    @Override
    public void eliminar() {
        
        
    }
    
    @Override
    public void ver() {
        
       
    }
    
    @Override
    public void listar() {
        
         
    }
    
}
