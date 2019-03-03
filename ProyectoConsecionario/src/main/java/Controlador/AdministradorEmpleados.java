/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Pojos.Personas.Empleado;

/**
 *
 * @author diego y alejandro
 */
public class AdministradorEmpleados extends AdministradorPadre{
    
    /**
     * Objeto de la clase Empleado
     * Variable global documentoEmpleado
     */
    Empleado nuevoEmpleado;
    int documentoEmpleado;
  
    /**
     * Constructor inicial 
     * de la clase AdministradorEmpleados
     */
    public AdministradorEmpleados(){
        super();
    }
    
    /**
     * Constructor con carga del objeto Empleado
     * @param empleado nombre del objeto de la clase Empleado
     */
    public AdministradorEmpleados(Empleado empleado){
        super();
        nuevoEmpleado= new Empleado();
        nuevoEmpleado=empleado;
    }
    
     /**
     * Constructor con carga de la variabale documento empleado
     * @param documento numero del documento de empleado
     */
    public AdministradorEmpleados(int documento){
        super();
        documentoEmpleado=documento;
    }
    
    /**
      * Metodo encargado de agregar
      * Empleado marcado con @Override
      * que esta sobreescribiendo al metodo de la clase
      * padre AdministradorPadre
      */
    @Override
    public void agregar() {
       
        listaDatos.getEmpleados().add(nuevoEmpleado);
        guardarDatos();
        System.out.println("Empleado agregado correctamente");
    }

    /**
     * Metodo encargado de modificar
     * Empleado marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
    @Override
    public void modificar() {

        boolean existe=false;
       
        for (Empleado empleado : listaDatos.getEmpleados()) {

            if (empleado.getDocumento() == nuevoEmpleado.getDocumento()) {
                existe=true;
                empleado.setCiudad(nuevoEmpleado.getCiudad());
                empleado.setCorreo(nuevoEmpleado.getCorreo());
                empleado.setCuentaBancaria(nuevoEmpleado.getCuentaBancaria());
                empleado.setDireccion(nuevoEmpleado.getDireccion());
                empleado.setDocumento(nuevoEmpleado.getDocumento());
                empleado.setCiudad(nuevoEmpleado.getCiudad());
                empleado.setNombreCompleto(nuevoEmpleado.getNombreCompleto());
                empleado.setTipoDocumento(nuevoEmpleado.getTipoDocumento());
            }
        }
         if(!existe){
            System.out.println("Empleado no encontrado");
        }else{
            System.out.println("Empleado modificado");
            guardarDatos();
        }
    }

    /**
     * Metodo encargado de eliminar
     * Empleado marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
    @Override
    public void eliminar() {
        int indice = 0;

        boolean existe=false;
        for (Empleado empleado : listaDatos.getEmpleados()) {

            if (empleado.getDocumento() == documentoEmpleado) {

                existe=true;
                listaDatos.getEmpleados().remove(indice);
                break;
            }
            indice++;
        }
        if(!existe){
            System.out.println("Empleado no encontrado");
        }else{
            System.out.println("Empleado eliminado");
            guardarDatos();
        }
        
    }
    
     /**
     * Metodo encargado de ver
     * Empleado marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
    @Override
    public void ver() {
        
        boolean existe=false;
        for (Empleado empleado : listaDatos.getEmpleados()) {

            if (empleado.getDocumento() == documentoEmpleado) {

                System.out.println("Nombre: " + empleado.getNombreCompleto());
                System.out.println("Tipo de Documento: " + empleado.getTipoDocumento());
                System.out.println("Documento: " + empleado.getDocumento());
                System.out.println("Ciudad: " + empleado.getCiudad());
                System.out.println("Correo: " + empleado.getCorreo());
                System.out.println("Cuenta Bancaria: " + empleado.getCuentaBancaria());
                System.out.println("Direccion: " + empleado.getDireccion());
                
                existe=true;
                break;
            }
        }
        if(!existe){
            System.out.println("Empleado no encontrado");
        }

    }
    
    /**
     * Metodo encargado de listar
     * empleado marcado con @Override
     * que esta sobreescribiendo al metodo de la clase
     * padre AdministradorPadre
     */
    @Override
    public void listar() {
        int indice = 1;
        cargarDatos();
        for (Empleado empleado : listaDatos.getEmpleados()) {

            System.out.println("Nombre: " + empleado.getNombreCompleto());
            System.out.println("Tipo de Documento: " + empleado.getTipoDocumento());
            System.out.println("Documento: " + empleado.getDocumento());
            System.out.println("Ciudad: " + empleado.getCiudad());
            System.out.println("Correo: " + empleado.getCorreo());
            System.out.println("Cuenta Bancaria: " + empleado.getCuentaBancaria());
            System.out.println("Direccion: " + empleado.getDireccion());
            
            indice++;
        }
        if(indice==1){
            System.out.println("No existen empleados registrados");
        }
    }
    
    /**
     * Metodo encargado obtener la 
     * lista de Empelado
     * @return retorna el objeto 
     * de la clase Empleado
     */
     public Empleado obtener() {
        
        boolean existe=false;
        for (Empleado empleado : listaDatos.getEmpleados()) {

            if (empleado.getDocumento() == documentoEmpleado) {

                return empleado;
                
            }
        }
        if(!existe){
            System.out.println("Empleado no encontrado");
        }
        return null;
    }
}
