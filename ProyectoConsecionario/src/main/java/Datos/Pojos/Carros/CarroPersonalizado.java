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
public class CarroPersonalizado extends Carro{
    
    private String modificacion;
    private String colorSecundario;

    public CarroPersonalizado(String modificacion, String colorSecundario, int codigoVehiculo, String referencia, String modelo, String marca, String matricula, int precio, boolean estado, String color, int cantidad, int cantidadMinima) {
        super(codigoVehiculo, referencia, modelo, marca, matricula, precio, estado, color, cantidad, cantidadMinima);
        this.modificacion = modificacion;
        this.colorSecundario = colorSecundario;
    }

   
    
}
