/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Archivos.Archivos;
import Datos.Listas.ListasDatos;
import Datos.Pojos.Personas.Cliente;

/**
 *
 * @author alejandro
 */
public class AdministrarClientes extends AdministradorPadre{

    Cliente nuevoCliente;
    int documentoCliente;
   
    public AdministrarClientes() {
        super();
    }

    public AdministrarClientes(Cliente cliente) {
        super();
        nuevoCliente = new Cliente();
        nuevoCliente = cliente;

    }

    public AdministrarClientes(int documento) {
        super();
        documentoCliente = documento;
    }

    @Override
    public void agregar() {
        listaDatos.getClientes().add(nuevoCliente);
        guardarDatos();
    }

    @Override
    public void modificar() {

        for (Cliente cliente : listaDatos.getClientes()) {

            if (cliente.getDocumento() == nuevoCliente.getDocumento()) {

                cliente.setCiudad(nuevoCliente.getCiudad());

            }
        }
        guardarDatos();
    }

    @Override
    public void eliminar() {
        int indice = 0;

        boolean existe=false;
        for (Cliente cliente : listaDatos.getClientes()) {

            if (cliente.getDocumento() == documentoCliente) {

                listaDatos.getClientes().remove(indice);
                break;
            }
            indice++;
        }
        if(!existe){
            System.out.println("Cliente no encontrado");
        }else{
            guardarDatos();
        }
        
    }
    
    @Override
    public void ver() {
        
        boolean existe=false;
        for (Cliente cliente : listaDatos.getClientes()) {

            if (cliente.getDocumento() == documentoCliente) {

                System.out.println("Nombre: " + cliente.getNombreCompleto());
                System.out.println("Ciudad: " + cliente.getCiudad());
                System.out.println("nombre: " + cliente.getNombreCompleto());
                System.out.println("nombre: " + cliente.getNombreCompleto());
                existe=true;
                break;
            }

        }
        if(!existe){
            System.out.println("Cliente no encontrado");
        }

    }
    
    @Override
    public void listar() {
        int indice = 1;
        for (Cliente cliente : listaDatos.getClientes()) {

            System.out.println("Indice: " + indice);
            System.out.println("Nombre: " + cliente.getNombreCompleto());
            System.out.println("Ciudad: " + cliente.getCiudad());
            System.out.println("nombre: " + cliente.getNombreCompleto());
            System.out.println("nombre: " + cliente.getNombreCompleto());

            indice++;
        }
        if(indice==1){
            System.out.println("No existen clientes registrados");
        }
    }

}
