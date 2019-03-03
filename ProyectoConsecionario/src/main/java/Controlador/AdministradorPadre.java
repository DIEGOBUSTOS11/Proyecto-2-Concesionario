/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Archivos.Archivos;
import Datos.Listas.ListasDatos;

/**
 *
 * @author alejandro y diego
 */
public abstract class AdministradorPadre implements AdministradorInterface{
    
     /**
     * Objeto de la clase ListasDatos
     * Objeto de la calse Archivos
     */
    ListasDatos listaDatos = new ListasDatos();
    Archivos archivo = new Archivos();

    /**
     * Constructor inicial 
     * de la clase AdministradorPadre
     */
    public AdministradorPadre() {
        cargarDatos();
    }

    /**
      * Metodo encargado 
      * cargaDatos 
      */
    protected void cargarDatos() {
        listaDatos = archivo.obtenerListasActuales();
    }

     /**
      * Metodo encargado 
      * guardarDatos
      */
    protected void guardarDatos() {
        archivo.guardarRegistro(listaDatos);
    }
}
