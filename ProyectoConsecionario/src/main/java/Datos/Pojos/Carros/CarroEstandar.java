/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Pojos.Carros;


/**
 *
 * @author alejandro y diego
 */ 
public class CarroEstandar extends Carro{
    
    private String tipoLlantas;

    /**
     * Constructor inicial 
     * de la clase CarroDeportivo
     */
    public CarroEstandar(){
        super();
    }
    
    /**
     * Constructor con los atributos
     * de la clase de CarroEstandar
     * @param tipoLlantas
     * @param codigoVehiculo
     * @param referencia
     * @param modelo
     * @param marca
     * @param matricula
     * @param precio
     * @param estado
     * @param color
     * @param cantidad
     * @param cantidadMinima 
     */
    public CarroEstandar(String tipoLlantas, int codigoVehiculo, String referencia, String modelo, String marca, String matricula, int precio, boolean estado, String color, int cantidad, int cantidadMinima) {
        super(codigoVehiculo, referencia, modelo, marca, matricula, precio, estado, color, cantidad, cantidadMinima);
        this.tipoLlantas = tipoLlantas;
    }
   
}
