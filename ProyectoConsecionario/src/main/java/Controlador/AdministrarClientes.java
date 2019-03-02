/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

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
        cargarDatos();
        listaDatos.getClientes().add(nuevoCliente);
        guardarDatos();
        System.out.println("Cliente agregado correctamente");
    }

    @Override
    public void modificar() {

        boolean existe=false;
       
        for (Cliente cliente : listaDatos.getClientes()) {

            if (cliente.getDocumento() == nuevoCliente.getDocumento()) {
                existe=true;
                cliente.setCiudad(nuevoCliente.getCiudad());
                cliente.setCorreo(nuevoCliente.getCorreo());
                cliente.setCuentaBancaria(nuevoCliente.getCuentaBancaria());
                cliente.setDireccion(nuevoCliente.getDireccion());
                cliente.setDocumento(nuevoCliente.getDocumento());
                cliente.setCiudad(nuevoCliente.getCiudad());
                cliente.setNombreCompleto(nuevoCliente.getNombreCompleto());
                cliente.setTipoDocumento(nuevoCliente.getTipoDocumento());
            }
        }
         if(!existe){
            System.out.println("Cliente no encontrado");
        }else{
            System.out.println("Cliente modificado");
            guardarDatos();
        }
    }

    @Override
    public void eliminar() {
        int indice = 0;

        boolean existe=false;
        for (Cliente cliente : listaDatos.getClientes()) {

            if (cliente.getDocumento() == documentoCliente) {

                existe=true;
                listaDatos.getClientes().remove(indice);
                break;
            }
            indice++;
        }
        if(!existe){
            System.out.println("Cliente no encontrado");
        }else{
            System.out.println("Cliente eliminado");
            guardarDatos();
        }
        
    }
    
    @Override
    public void ver() {
        
        boolean existe=false;
        for (Cliente cliente : listaDatos.getClientes()) {

            if (cliente.getDocumento() == documentoCliente) {

                System.out.println("Nombre: " + cliente.getNombreCompleto());
                System.out.println("Tipo de Documento: " + cliente.getTipoDocumento());
                System.out.println("Documento: " + cliente.getDocumento());
                System.out.println("Ciudad: " + cliente.getCiudad());
                System.out.println("Correo: " + cliente.getCorreo());
                System.out.println("Cuenta Bancaria: " + cliente.getCuentaBancaria());
                System.out.println("Direccion: " + cliente.getDireccion());
                
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
        cargarDatos();
        for (Cliente cliente : listaDatos.getClientes()) {

            System.out.println("Indice: " + indice);
            System.out.println("Nombre: " + cliente.getNombreCompleto());
            System.out.println("Tipo de Documento: " + cliente.getTipoDocumento());
            System.out.println("Documento: " + cliente.getDocumento());
            System.out.println("Ciudad: " + cliente.getCiudad());
            System.out.println("Correo: " + cliente.getCorreo());
            System.out.println("Cuenta Bancaria: " + cliente.getCuentaBancaria());
            System.out.println("Direccion: " + cliente.getDireccion());
            

            indice++;
        }
        if(indice==1){
            System.out.println("No existen clientes registrados");
        }
    }

}
