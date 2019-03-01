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
 * @author alejandro
 */
public abstract class AdministradorPadre implements AdministradorInterface{
    
    ListasDatos listaDatos = new ListasDatos();
    Archivos archivo = new Archivos();

    public AdministradorPadre() {
        cargarDatos();
    }

    
    protected void cargarDatos() {
        listaDatos = archivo.obtenerListasActuales();
    }

    protected void guardarDatos() {
        archivo.guardarRegistro(listaDatos);
    }
}
