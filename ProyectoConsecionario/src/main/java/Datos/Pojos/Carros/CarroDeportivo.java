/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Pojos.Carros;

import Datos.Pojos.Carros.Carro;

/**
 *
 * @author alejandro
 */
public class CarroDeportivo extends Carro {

   
    private int velocidadMaxima;
    private int caballosFuerza;

    public CarroDeportivo(int velocidadMaxima, int caballosFuerza, int codigoVehiculo, String referencia, String modelo, String marca, String matricula, int precio, boolean estado, String color, int cantidad, int cantidadMinima) {
        super(codigoVehiculo, referencia, modelo, marca, matricula, precio, estado, color, cantidad, cantidadMinima);
        this.velocidadMaxima = velocidadMaxima;
        this.caballosFuerza = caballosFuerza;
    }
   
}
