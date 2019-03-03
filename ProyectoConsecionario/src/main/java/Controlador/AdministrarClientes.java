/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Pojos.Personas.Cliente;

/**
 *
 * @author alejandro y diego
 */
public class AdministrarClientes extends AdministradorPadre{

    /**
     * Objeto de la clase Clientes
     * Variable global documentoCliente
     */
    Cliente nuevoCliente;
    int documentoCliente;
   
    /**
     * Constructor inicial 
     * de la clase AdministradorClientes
     */
    public AdministrarClientes() {
        super();
    }
     /**
     * Constructor con carga del objeto Cliente
     * @param cliente nombre del objeto de la clase Cliente
     */
    public AdministrarClientes(Cliente cliente) {
        super();
        nuevoCliente = new Cliente();
        nuevoCliente = cliente;

    }

     /**
     * Constructor con carga de la variabale documento Cliente
     * @param cliente numero del documento de cliente
     */
    public AdministrarClientes(int documento) {
        super();
        documentoCliente = documento;
    }
    
    /**
      * Metodo encargado de agregar
      * Clientes marcado con @Override
      * que esta sobreescribiendo al metodo de la clase
      * padre AdministradorPadre
      */
    @Override
    public void agregar() {
       
        listaDatos.getClientes().add(nuevoCliente);
        guardarDatos();
        System.out.println("Cliente agregado correctamente");
    }

    /**
     * Metodo encargado de modificar
     * clientes marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
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

    /**
     * Metodo encargado de eliminar
     * Clientes marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
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
    
    /**
     * Metodo encargado de ver
     * Clientes marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
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
    
    /**
     * Metodo encargado de listar
     * clientes marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
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
    
    /**
     * Metodo encargado obtener la 
     * lista de Cliente
     * @return retorna el objeto 
     * de la clase cliente
     */
     public Cliente obtener() {
        
        boolean existe=false;
        for (Cliente cliente : listaDatos.getClientes()) {

            if (cliente.getDocumento() == documentoCliente) {

                return cliente;
                
            }
        }
        if(!existe){
            System.out.println("Cliente no encontrado");
        }
        return null;
    }

}
