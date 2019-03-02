/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Pojos.Carros;


/**
 *
 * @author alejandro
 */
public class CarroEstandar extends Carro{
    
    private String tipoLlantas;

    public CarroEstandar(){
        super();
    }
    
    public CarroEstandar(String tipoLlantas, int codigoVehiculo, String referencia, String modelo, String marca, String matricula, int precio, boolean estado, String color, int cantidad, int cantidadMinima) {
        super(codigoVehiculo, referencia, modelo, marca, matricula, precio, estado, color, cantidad, cantidadMinima);
        this.tipoLlantas = tipoLlantas;
    }
   
}
