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
public class CarroMaquinaria extends Carro {
    
    private String especialidad;
    private int capacidadCarga;
    
    public CarroMaquinaria(){
        super();
    }

    public CarroMaquinaria(String especialidad, int capacidadCarga, int codigoVehiculo, String referencia, String modelo, String marca, String matricula, int precio, boolean estado, String color, int cantidad, int cantidadMinima) {
        super(codigoVehiculo, referencia, modelo, marca, matricula, precio, estado, color, cantidad, cantidadMinima);
        this.especialidad = especialidad;
        this.capacidadCarga = capacidadCarga;
    }

   
    
}
